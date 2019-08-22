package com.example.foodrecipe;

import com.example.foodrecipe.model.RecipeList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/Nsikaktopdown/Recipe/master/Recipe.json")
    Call<List<RecipeList>> getAllRecipe();
}
