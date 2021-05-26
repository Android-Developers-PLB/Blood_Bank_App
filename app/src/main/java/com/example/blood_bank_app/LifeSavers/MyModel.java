package com.example.blood_bank_app.LifeSavers;

public class MyModel {
    String title, description,date , linkedin, insta;
    int image;

    public MyModel(String title, String description, String date, int image, String linkedin,String insta) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.image = image;
        this.linkedin = linkedin;
        this.insta = insta;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getInsta() {
        return insta;
    }

    public void setInsta(String insta) {
        this.insta = insta;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
