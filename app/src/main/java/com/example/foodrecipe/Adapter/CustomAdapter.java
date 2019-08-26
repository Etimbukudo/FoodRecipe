package com.example.foodrecipe.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodrecipe.DetailsActivity;
import com.example.foodrecipe.R;
import com.example.foodrecipe.model.RecipeList;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private List<RecipeList> dataList;
    private Context context;
    RecipeOnClickListener mListener;


    public CustomAdapter(Context context, List<RecipeList> dataList){
        this.context = context;
        this.dataList = dataList;
    }



    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = LayoutInflater.from(context).inflate(R.layout.custom_layout, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        RecipeList recipeList = dataList.get(position);
        holder.txtHeading.setText(dataList.get(position).getName());
        holder.txtDetail.setText("by " + recipeList.getUser().getName());
        holder.headline.setText(recipeList.getHeadline());
//        holder.rating.getRating(recipeList.getRating());

        if (recipeList.getRating() == null){
            holder.rating.setRating(0);
        }else{
            holder.rating.setRating((float) recipeList.getRating().doubleValue());
        }

//        Picasso.Builder builder = new Picasso.Builder(context);
//        builder.downloader(new OkHttp3Downloader(context));
//        builder.build().load(dataList.get(position).getThumbnailUrl())
//                .placeholder((R.drawable.ic_launcher_background))
//                .error(R.drawable.ic_launcher_background)
//                .into(holder.coverImage);

    }

    public interface RecipeOnClickListener{
        void onClick(int position);
    }

    @Override
    public int getItemCount() {
        return dataList == null ? 0 : dataList.size();
    }

    public void setRecipes(List<RecipeList> recipeLists){
        for(RecipeList recipe:recipeLists){
            addRecipe(recipe);
        }
    }

    public void addRecipe(RecipeList recipe){
        dataList.add(recipe);
        notifyItemInserted(dataList.size());
    }

    class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public final View mView;

        private TextView txtHeading;
        private TextView txtDetail;
        private RatingBar rating;
        private TextView headline;

        public CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            txtHeading = mView.findViewById(R.id.heading_text);
            txtDetail = mView.findViewById(R.id.detail_text);
            rating = mView.findViewById(R.id.recipe_rating);
            headline = mView.findViewById(R.id.recipe_headline);

//            itemView.setOnClickListener((View.OnClickListener) this);
            itemView.setOnClickListener(this);
        }

        public void onClick(View view) {
            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra(DetailsActivity.RECIPE_POSITION,getAdapterPosition());
            context.startActivity(intent);
        }
    }

}