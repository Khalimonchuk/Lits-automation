package com.HM3;

public class Main {

    public static void main(String[] args) {

        StartPAge start = new StartPAge("StartPage", "/images/logo.png", "/images/mob_menu.png", "http://lits.ua/", "QA School", "Code School");
        CodeSchoolPage codeschoolpage1 = new CodeSchoolPage("t88888882","/images/logo.png","/images/mob_menu.png","Детальніше","Java Advanced");
        JavaAdvancedPage javaA1p1 = new JavaAdvancedPage("t3","/images/logo.png","/images/mob_menu.png", "Навчальна программа");

        start.clickLink();
        start.waiter();
        start.verifyTitle();
        start.clickCodePage();
        start.waiter();

        codeschoolpage1.waiter();
        codeschoolpage1.verifyTitle();
        codeschoolpage1.clickCourse();
        codeschoolpage1.clockButonMore();


        javaA1p1.waiter();
        javaA1p1.verifyTitle();
        javaA1p1.clickStudyProgramm();








    }
}
