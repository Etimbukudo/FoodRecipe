package com.example.foodrecipe.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class RecipeList {

    @SerializedName("calories")
    private String calories;
//    @SerializedName("carbos")
//    private String carbos;
//    @SerializedName("card")
//    private String card;
//    @SerializedName("country")
//    private String country;
//    @SerializedName("deliverable_ingredients")
//    private List<String> deliberableIngredients;
//    @SerializedName("description")
//    private String description;
//    @SerializedName("difficulty")
//    private Integer difficulty;
//    @SerializedName("fats")
//    private String fats;
//    @SerializedName("favorites")
//    private Integer favorites;
//    @SerializedName("fibers")
//    private String fibers;
//    @SerializedName("headline")
//    private String headline;
//    @SerializedName("highlighted")
//    private boolean ishighlighted;
//    @SerializedName("id")
//    private String id;
//    @SerializedName("image")
//    private String image;
////    @SerializedName("incompatibilities")
////    val incompatibilities: Any,
//    @SerializedName("ingredients")
//    private List<String> ingredients;
    @SerializedName("keywords")
    private List<String> keywords;
    @SerializedName("name")
    private String name;
//    @SerializedName("products")
//    private List<String> products;
//    @SerializedName("proteins")
//    private String proteins;
//    @SerializedName("rating")
//    private Double rating;
//    @SerializedName("ratings")
//    private Integer ratings;
//    @SerializedName("thumb")
//    private String thumb;
//    @SerializedName("time")
//    private String time;
//    @SerializedName("undeliverable_ingredients")
//    val undeliverableIngredients: List<Any>,
    @SerializedName("user")
    private User user;
//    @SerializedName("weeks")
//    private List<String> weeks;

    public RecipeList(String calories, String carbos, String card, String country, List<String> deliberableIngredients, String description,
                      Integer difficulty, String fats, Integer favorites, String fibers, String headline, boolean ishighlighted, String id,
                      String image, List<String> ingredients, List<String> keywords, String name, List<String> products, String proteins,
                      Double rating, Integer ratings, String thumb, String time, User user, List<String> weeks) {
        this.calories = calories;
//        this.carbos = carbos;
//        this.card = card;
//        this.country = country;
//        this.deliberableIngredients = deliberableIngredients;
//        this.description = description;
//        this.difficulty = difficulty;
//        this.fats = fats;
//        this.favorites = favorites;
//        this.fibers = fibers;
//        this.headline = headline;
//        this.ishighlighted = ishighlighted;
//        this.id = id;
//        this.image = image;
//        this.ingredients = ingredients;
        this.keywords = keywords;
        this.name = name;
//        this.products = products;
//        this.proteins = proteins;
//        this.rating = rating;
//        this.ratings = ratings;
//        this.thumb = thumb;
//        this.time = time;
        this.user = user;
//        this.weeks = weeks;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }
//
//    public String getCarbos() {
//        return carbos;
//    }
//
//    public void setCarbos(String carbos) {
//        this.carbos = carbos;
//    }
//
//    public String getCard() {
//        return card;
//    }
//
//    public void setCard(String card) {
//        this.card = card;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public List<String> getDeliberableIngredients() {
//        return deliberableIngredients;
//    }
//
//    public void setDeliberableIngredients(List<String> deliberableIngredients) {
//        this.deliberableIngredients = deliberableIngredients;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Integer getDifficulty() {
//        return difficulty;
//    }
//
//    public void setDifficulty(Integer difficulty) {
//        this.difficulty = difficulty;
//    }
//
//    public String getFats() {
//        return fats;
//    }
//
//    public void setFats(String fats) {
//        this.fats = fats;
//    }
//
//    public Integer getFavorites() {
//        return favorites;
//    }
//
//    public void setFavorites(Integer favorites) {
//        this.favorites = favorites;
//    }
//
//    public String getFibers() {
//        return fibers;
//    }
//
//    public void setFibers(String fibers) {
//        this.fibers = fibers;
//    }
//
//    public String getHeadline() {
//        return headline;
//    }
//
//    public void setHeadline(String headline) {
//        this.headline = headline;
//    }
//
//    public boolean isIshighlighted() {
//        return ishighlighted;
//    }
//
//    public void setIshighlighted(boolean ishighlighted) {
//        this.ishighlighted = ishighlighted;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public List<String> getIngredients() {
//        return ingredients;
//    }
//
//    public void setIngredients(List<String> ingredients) {
//        this.ingredients = ingredients;
//    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
//    public List<String> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<String> products) {
//        this.products = products;
//    }
//
//    public String getProteins() {
//        return proteins;
//    }
//
//    public void setProteins(String proteins) {
//        this.proteins = proteins;
//    }
//
//    public Double getRating() {
//        return rating;
//    }
//
//    public void setRating(Double rating) {
//        this.rating = rating;
//    }
//
//    public Integer getRatings() {
//        return ratings;
//    }
//
//    public void setRatings(Integer ratings) {
//        this.ratings = ratings;
//    }
//
//    public String getThumb() {
//        return thumb;
//    }
//
//    public void setThumb(String thumb) {
//        this.thumb = thumb;
//    }
//
//    public String getTime() {
//        return time;
//    }
//
//    public void setTime(String time) {
//        this.time = time;
//    }

    public String getuser() {
        return User.getname();
    }

    public void setuser(User user) {
        User.user = user;
    }
//
//    public List<String> getWeeks() {
//        return weeks;
//    }
//
//    public void setWeeks(List<String> weeks) {
//        this.weeks = weeks;
//    }
}
