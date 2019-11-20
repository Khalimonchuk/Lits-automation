package com.HM3;

public class CodeSchoolPage extends StartPAge {

    String javaAdvanced;
    String moreButton;
    String title=getTitle();

    public CodeSchoolPage(){

    }

    public CodeSchoolPage(String title, String logoLink, String dropdownMenuRight, String moreButton, String javaAdvanced){
        super(title, logoLink, dropdownMenuRight);
        this.moreButton=moreButton;
        this.javaAdvanced=javaAdvanced;

    }

    @Override
    public void waiter() {
        System.out.println("Wait 5 seconds on CodeSchoolPage");
    }

    @Override
    public void verifyTitle(){
        System.out.println("Title on CodeSchoolPage("+ title + ") - Cучасна школа програмування, основною метою якої є випускати максимально професійних девелоперів, не залежно від рівня їхніх знань до початку навчання. ");
    }

    @Override
    public void clickRightMenu () {
        System.out.println("Menu - "+dropdownMenuRight+" was opened on CodeSchoolPage");
    }

    public void clickCourse (){
        System.out.println("Button " + javaAdvanced + " was clicked");
    }

    public void clockButonMore(){
        System.out.println("Button " + moreButton+ " was clicked");
    }


}
