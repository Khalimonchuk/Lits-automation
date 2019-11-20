package com.HM3;

public class QaSchoolPage extends StartPAge {

    @Override
    public void waiter() {
        System.out.println("Wait 5 seconds on QASchool");
    }

    @Override
    public void verifyTitle(){
        System.out.println("Title is "+ title +" - Cучасна школа програмування, основною метою якої є випускати максимально професійних девелоперів, не залежно від рівня їхніх знань до початку навчання. ");
    }

    @Override
    public void clickRightMenu () {
        System.out.println("Menu - "+dropdownMenuRight+" was opened");
    }

}
