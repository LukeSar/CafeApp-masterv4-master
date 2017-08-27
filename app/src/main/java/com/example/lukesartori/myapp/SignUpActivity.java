package com.example.lukesartori.myapp;
//import adds libraries of pre made code for commonly used functions
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;



public class SignUpActivity extends AppCompatActivity { //initialises sign up screen also uses app compat activity as a sub class from fragment activity with many useful API'S for supporting UI development

    Button DoneButton; //initialises button to complete sign up form
    Button FurtherButton;   //initialises button to show further information
    Button EmailButton; //initialises button to enter email
    private PopupWindow popupWindow;    //sets private class for pop up window to contain the extra information
    private LayoutInflater layoutInflater;  //sets private class for a box to contain the pop up window with the information


    @Override   //allows the compiler to override previously set parent functions
    protected void onCreate(Bundle savedInstanceState) {    //used for starting the activity to start up all the components on the screen by using previously saved
        super.onCreate(savedInstanceState); //runs code that is created in the parent class by acting as a calling method within the activity
        setContentView(R.layout.activity_signup);    //pairs the UI with the XML used to create it so it can show the user what has been created



        DoneButton = (Button) findViewById(R.id.DoneButton);    //tool used for the UI to locate the 'done' button on the screen
        FurtherButton = (Button) findViewById(R.id.FurtherButton);  //tool used for the UI to locate the 'further info' button on the screen


        DoneButton.setOnClickListener(new View.OnClickListener() {  //sets a class for the done button so that when it is clicked an action can be performed


            @Override
            public void onClick(View v) {   //sets method so when the view or done button has been clicked a new action can be performed

                startActivity(new Intent(SignUpActivity.this, MainActivity.class));  //starts a new activity where 'intent' is used as an object to bridge the two screens
            }
        });

        FurtherButton.setOnClickListener(new View.OnClickListener(){    //sets a class for the further information button so that when it is clicked an action can be performed
           @Override
            public void onClick(View v) {   //sets a method so when the further info button is clicked a new action can be performed
               layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE); //retrieves the information to be held in the pop up from XML
               ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.email_pop, null);  //calls the now retrieved XMl code and puts it into the 'email pop'

               popupWindow = new PopupWindow(container, 950, 1120, true);   //initiates the pop up size and sets it to visible
               popupWindow.showAtLocation(FurtherButton, Gravity.CENTER, 0, 0); //sets location of the pop up on the screen to center

               container.setOnTouchListener(new View.OnTouchListener() {    //adds a listener to the container of the pop up window so that the listener can react to an event such as being clicked
                   @Override
                   public boolean onTouch(View view, MotionEvent motionEvent) { //sets method so that when the window or screen is touched the pop up is removed
                       popupWindow.dismiss();   //sets pop up to inactive and invisible
                       return true; //sets dismiss to true so the pop up is now inactive
                   }
               });
           }
        });
    }
}
