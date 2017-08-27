package com.example.lukesartori.myapp;
//import adds libraries of pre made code for commonly used functions
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Luke on 12/03/2017.
 */

public class LunchMenu extends AppCompatActivity {  //initialises lunch menu screen also uses app compat activity as a sub class from fragment activity with many useful API'S for supporting UI development
    @Override   //allows the compiler to override previously set parent functions
    protected void onCreate(Bundle savedInstanceState) {    //used for starting the activity to start up all the components on the screen by using previously saved data
        super.onCreate(savedInstanceState); //runs code that is created in the parent class by acting as a calling method within the activity
        setContentView(R.layout.activity_lunch);    //pairs the UI with the XML used to create it so it can show the user what has been created
    }
}