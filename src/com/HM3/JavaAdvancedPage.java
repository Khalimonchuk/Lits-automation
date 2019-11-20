package com.HM3;

public class JavaAdvancedPage extends StartPAge{
    String studyProgram;

    public JavaAdvancedPage(){

    }

    public JavaAdvancedPage(String title, String logoLink, String dropdownMenuRight, String studyProgram){
        super(title, logoLink, dropdownMenuRight);
        this.studyProgram=studyProgram;

    }


    @Override
    public void waiter() {
        System.out.println("Wait 5 seconds on Java Advanced page");
    }

    @Override
    public void verifyTitle() {
        System.out.println("Title on Java Advanced Page is " + title + " - Java Advanced");
    }

    @Override
    public void clickRightMenu () {
        System.out.println("Menu - "+ super.dropdownMenuRight +" was opened on JavaAdvancedPage");
    }

    public  void clickStudyProgramm (){
        System.out.println("Button " + studyProgram + " was clicked");
    }

}
