package com.example.tharani.bundlepassing;
/*import is libraries imported for writing the code
* AppCompatActivity is base class for activities
* Bundle handles the orientation of the activity
*/


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
     /*onCreate is the first method in the life cycle of an activity
 savedInstance passes data to super class,data is pull to store state of application
 * setContentView is used to set layout for the activity
 *R is a resource and it is auto generate file
  * activity_main assign an integer value*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //here we are creating the string
        String message;//string is a sequence of characters
        Intent i=getIntent();
        /**by using bundle we can pass objects from one activity to other*/
        Bundle bundle = i.getExtras();
        //here getting information of username

        String userName=bundle.getString("UserName");

        message="Welcome Username:"+userName;//here we are creating the message
        //here it displays the message
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
        // LENGTH_LONG is the duration for which a toast is displayed on screen and duration which is 3,5 seconds

    }
}
