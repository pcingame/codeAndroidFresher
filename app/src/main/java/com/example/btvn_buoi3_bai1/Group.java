package com.example.btvn_buoi3_bai1;

public class Group {
    private int idImage;
    private String name;
    private String fan;
    private String post;
    private int idGroup;

    public Group(int idImage, String name, String fan, String post, int idGroup) {
        this.idImage = idImage;
        this.name = name;
        this.fan = fan;
        this.post = post;
        this.idGroup = idGroup;
    }

    public Group() {
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFan() {
        return fan;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }
}
