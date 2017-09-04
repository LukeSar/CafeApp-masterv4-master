package com.example.lukesartori.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



public class Checkout extends AppCompatActivity {

    @Override //allows the compiler to override previously set parent functions
    protected void onCreate(Bundle savedInstanceState) {    //used for starting the activity to start up all the components on the screen by using previously saved data
        super.onCreate(savedInstanceState); //runs code that is created in the parent class by acting as a calling method within the activity
        setContentView(R.layout.checkout);   //pairs the UI with the XML used to create it so it can show the user what has been created

    }
}