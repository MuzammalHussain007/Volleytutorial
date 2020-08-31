package com.example.volleytutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleHolder> {
    private Context mContext;
    private List<ExampleItem> mItems;

    public ExampleAdapter(Context context, List<ExampleItem> items) {
        mContext = context;
        mItems = items;
    }

    @NonNull
    @Override
    public ExampleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(mContext.getApplicationContext());
        View view=inflater.inflate(R.layout.example_item,parent,false);
        return new ExampleHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleHolder holder, int position) {
        ExampleItem exampleItem = mItems.get(position);
        holder.name.setText("Name:"+exampleItem.getName());
        holder.likes.setText("Likes:"+exampleItem.getLikes());
        Glide.with(mContext.getApplicationContext()).load(exampleItem.getImage()).into(holder.mImageView);

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ExampleHolder extends RecyclerView.ViewHolder
    {
        private ImageView mImageView;
        private TextView name,likes;

        public ExampleHolder(@NonNull View itemView) {
            super(itemView);
            mImageView=itemView.findViewById(R.id.imageview);
            name=itemView.findViewById(R.id.name);
            likes=itemView.findViewById(R.id.likes);
        }
    }
}
