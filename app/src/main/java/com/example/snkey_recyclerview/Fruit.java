package com.example.snkey_recyclerview;

public class Fruit {
    private int imageId;
    private String name;

    public Fruit() {
    }

    public Fruit(int imageId, String name) {
        this.imageId = imageId;
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "imageId=" + imageId +
                ", name='" + name + '\'' +
                '}';
    }
}
