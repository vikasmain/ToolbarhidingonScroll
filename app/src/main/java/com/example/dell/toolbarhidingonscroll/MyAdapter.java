package com.example.dell.toolbarhidingonscroll;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;




public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    List<NumberHelper> numberList;

    public MyAdapter(List<NumberHelper> numberList) {
        this.numberList = numberList;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView txtTitle;
        public ImageView imageViewoff;

        public ViewHolder(View v) {
            super(v);
            txtTitle = (TextView) v.findViewById(R.id.num_name);
            imageViewoff = (ImageView) v.findViewById(R.id.num_images);
        }
    }

    public void add(int position, NumberHelper item) {
        numberList.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(NumberHelper item) {
        int position = numberList.indexOf(item);
        numberList.remove(position);
        notifyItemRemoved(position);
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_row, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final NumberHelper number = numberList.get(position);
        final String name = number.getNumNames();
        holder.txtTitle.setText(name);
        holder.imageViewoff.setImageResource(number.getNumImages());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return numberList.size();
    }

}
