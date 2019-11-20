package com.HM3;

public class StartPAge {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //for all pages
     String title;
    String logoLink;
    String dropdownMenuRight;

    //for start page
    String link;
    String qa;
    String code;

    public StartPAge(){

    }

    public StartPAge(String title, String logoLink, String dropdownMenuRight){

    }

    public StartPAge (String title, String logoLink, String dropdownMenuRight, String link, String qa, String code) {
        this.title = title;
        this.logoLink= logoLink;
        this.dropdownMenuRight = dropdownMenuRight;
        this.link = link;
        this.qa = qa;
        this.code = code;

    }





    public void clickLink() {
        System.out.println("Open link "+ link + ". Link was opened");
    }

    public void waiter() {
        System.out.println("Wait 5 seconds on StartPage");
    }

    public void verifyTitle(){
        System.out.println("Title on StartPage("+ title + ") - Cучасна школа програмування, основною метою якої є випускати максимально професійних девелоперів, не залежно від рівня їхніх знань до початку навчання. ");
    }

    public void clickRightMenu () {
        System.out.println("Menu - "+ dropdownMenuRight +" was opened");
    }

    public void clickQaPage() {
        System.out.println("Button" + qa + " was clicked");
    }

    public void clickCodePage() {
        System.out.println("Button " +code + " was clicked");
    }



}
