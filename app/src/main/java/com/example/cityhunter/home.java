package com.example.cityhunter;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class home extends AppCompatActivity {
    FirebaseUser currentUser;//used to store current user of account
    FirebaseAuth mAuth;//Used for firebase authentication
    Button logout;
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();
        logout = (Button) findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you logged out",Toast.LENGTH_SHORT).show();
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(home.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        //Check if user has already signed in if not send user to Login Activity
        if(currentUser==null)
        {
            sendToLoginActivity();
        }
    }

    private void sendToLoginActivity() {
        //To send user to Login Activity
        Intent loginIntent = new Intent(home.this,LoginActivity.class);
        startActivity(loginIntent);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.item1:
                Intent a = new Intent(home.this,MainActivity2.class);
                startActivity(a);
                return true;

            case R.id.item2:
                Intent b = new Intent(home.this, MainActivity5.class);
                startActivity(b);
                return true;

            
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed(){
        if (backPressedTime+2000>System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else{
            Toast.makeText(getBaseContext(),"press back again to exit",Toast.LENGTH_SHORT).show();
        }
        backPressedTime=System.currentTimeMillis();
    }

}

