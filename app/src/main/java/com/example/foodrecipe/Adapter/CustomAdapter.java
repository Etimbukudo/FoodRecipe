package com.example.foodrecipe.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.foodrecipe.R;
import com.example.foodrecipe.model.RecipeList;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<RecipeList> dataList;
//    private Context context;

    public CustomAdapter(Context context, List<RecipeList> dataList){
//        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        private TextView txtHeading;
        private TextView txtDetail;


        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            txtHeading = mView.findViewById(R.id.heading_text);
            txtDetail = mView.findViewById(R.id.detail_text);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_layout, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        RecipeList recipeList = dataList.get(position);
        holder.txtHeading.setText(dataList.get(position).getName());
        holder.txtDetail.setText("by " + dataList.get(position).getuser());

//        Picasso.Builder builder = new Picasso.Builder(context);
//        builder.downloader(new OkHttp3Downloader(context));
//        builder.build().load(dataList.get(position).getThumbnailUrl())
//                .placeholder((R.drawable.ic_launcher_background))
//                .error(R.drawable.ic_launcher_background)
//                .into(holder.coverImage);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}