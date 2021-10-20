package com.example.androidapi;

public class Model {

    int userId, id;
    String Title, PostDesc;

    public Model() {
    }

    public Model(int userId, int id, String title, String postDesc) {
        this.userId = userId;
        this.id = id;
        Title = title;
        PostDesc = postDesc;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPostDesc() {
        return PostDesc;
    }

    public void setPostDesc(String postDesc) {
        PostDesc = postDesc;
    }
}
