package com.example.tharani.bundlepassing;
/*import is libraries imported for writing the code
* AppCompatActivity is base class for activities
* Bundle handles the orientation of the activity
*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // declaring variables
    Button nextActivity;//Button is a android widget or view
    //creating bridge between button and java
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         /*onCreate is the first method in the life cycle of an activity
 savedInstance passes data to super class,data is pull to store state of application
 * setContentView is used to set layout for the activity
 *R is a resource and it is auto generate file
  * activity_main assign an integer value*/
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        nextActivity = findViewById(R.id.button2);
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//here we are creating the onclick method
                //here we are creating the String
                String userNameVal = username.getText().toString();
                String passwordVal = password.getText().toString();
                if (userNameVal.equals("tharanichelumalla") && passwordVal.equals("987654321")) {
                    //here we are creating the bundle
                    //for passing the data from one activity to another activity
                    Bundle bundle = new Bundle();
                    bundle.putString("UserName", username.getText().toString());
                    bundle.putString("Password", password.getText().toString());
                    //here we are using intent to show the second string
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    //here passing information from this activity to other activity using putExtras
                    intent.putExtras(bundle);
                    //here we are starting the activity
                    startActivity(intent);
                }

            }
        });
    }
}

