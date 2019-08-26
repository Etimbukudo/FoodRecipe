package com.example.foodrecipe;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodrecipe.Adapter.CustomAdapter;
import com.example.foodrecipe.Network.RetrofitClientInstance;
import com.example.foodrecipe.model.RecipeList;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    static List<RecipeList> recipeLists;
    private CustomAdapter adapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDialog;


    private Activity getActivity() {
        Context context = this;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }

        return null;
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getActionBar().setElevation(1);

        initViews();



        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<RecipeList>> call = service.getAllRecipe();
        call.enqueue(new Callback<List<RecipeList>>() {
            @Override
            public void onResponse(Call<List<RecipeList>> call, Response<List<RecipeList>> response) {
                recipeLists = response.body();
                adapter.setRecipes(recipeLists);
                progressDialog.dismiss();
//                generateDataList((ArrayList<RecipeList>) response.body());
            }

            @Override
            public void onFailure(Call<List<RecipeList>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*Method to generate List of data using RecyclerView with custom adapter*/
//    private void generateDataList(ArrayList<RecipeList> recipeLists) {
//        recyclerView = findViewById(R.id.customRecyclerView);
//        recipeLists = new ArrayList<>();
//        adapter = new CustomAdapter(this,recipeLists);
//
    private void initViews(){
        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        recyclerView = findViewById(R.id.customRecyclerView);
        recipeLists = new ArrayList<>();
        adapter = new CustomAdapter(this,recipeLists);



        if (getActivity().getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);
        }
    }
//    }

    public static RecipeList getRecipeList (int position){
        return recipeLists.get(position);
    }
}
