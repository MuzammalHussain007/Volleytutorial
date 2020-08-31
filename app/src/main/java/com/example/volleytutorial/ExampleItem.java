package com.example.volleytutorial;

public class ExampleItem {
    private String image,name,likes;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public ExampleItem(String image, String name, String likes) {
        this.image = image;
        this.name = name;
        this.likes = likes;
    }
}
