package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foodrecipe.model.RecipeList;

import java.util.HashSet;
import java.util.Set;

public class DetailsActivity extends AppCompatActivity {
    public static final String RECIPE_POSITION = "recipe_position";

    Set<String> mFavourite;
    int Position;

    TextView RecipeName;
    TextView favoriteName;
    TextView FiberName;
    TextView description;
    TextView IngredientName;
    //    ImageView imageView;
    ImageView favButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

//        imageView = findViewById(R.id.thumb_header);
        Intent intent = getIntent();

        description = findViewById(R.id.recipe_description);
        favoriteName = findViewById(R.id.favorite);
        RecipeName = findViewById(R.id.food_name);
        IngredientName = findViewById(R.id.ingredient);
        FiberName = findViewById(R.id.fibers);

        favButton = findViewById(R.id.favouriteBtn);
        mFavourite = getFavourite();

        if (intent != null) {
            Position = intent.getIntExtra(RECIPE_POSITION, 0);
            RecipeList recipe = MainActivity.getRecipeList(Position);

            RecipeName.setText(recipe.getName());
            description.setText(recipe.getDescription());
            IngredientName.setText(recipe.getIngredients().toString());
            FiberName.setText(recipe.getFibers());
            favoriteName.setText(recipe.getCalories());
        }
    }
    public void fav(View v){

        if (ConfirmFavourite (Position)){
            mFavourite.remove(Integer.toString(Position));
            Toast.makeText(DetailsActivity.this,"Removed from favorite list",Toast.LENGTH_SHORT).show();
        }else {
            mFavourite.add(Integer.toString(Position));
            Toast.makeText(DetailsActivity.this,"Added to your favorite list",Toast.LENGTH_SHORT).show();
        }
        saveFavourite();
    }
    private boolean ConfirmFavourite(int isPosition) {
        Set<String> FavCF = getFavourite();
        if (FavCF.contains(Integer.toString(isPosition))){
            return true;
        }else {
            return false;
        }
    }
    private void saveFavourite() {
        SharedPreferences prefs = getSharedPreferences("Favourites Prefs", 0);
        SharedPreferences.Editor editP = prefs.edit();
        editP.putStringSet("Favourites", mFavourite).apply();
        if (ConfirmFavourite(Position)){
            favButton.setImageResource(R.drawable.ic_favorite);
        }else {
            favButton.setImageResource(R.drawable.ic_favorite_border);
        }
    }
    private Set<String> getFavourite() {
        SharedPreferences prefs = getSharedPreferences("Favourites Prefs", 0);
        return prefs.getStringSet("Favourites", new HashSet<String>());
    }
}
