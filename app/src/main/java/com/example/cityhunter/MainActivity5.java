package com.example.cityhunter;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivity5 extends AppCompatActivity implements GestureDetector.OnGestureListener ,GestureDetector.OnDoubleTapListener{

    LinearLayout lt;
    GestureDetector gd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        gd=new GestureDetector(this,this);
        lt=(LinearLayout)findViewById(R.id.linear);
    }

    public boolean onTouchEvent(MotionEvent event)           //reconizes the action on screen
    {
        gd.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Toast.makeText(getApplicationContext(),"Long Press",Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        if(e2.getX()-e1.getX()>30)                //value should be atleast little bigger to move much pixels
        {
            Toast.makeText(getApplicationContext(),"Swipe Right",Toast.LENGTH_SHORT).show();
        }
        if(e1.getX()-e2.getX()>30)
        {
            Toast.makeText(getApplicationContext(),"Swipe Left",Toast.LENGTH_SHORT).show();
        }
        if(e2.getY()-e1.getY()>30)
        {
            Toast.makeText(getApplicationContext(),"Swipe Down",Toast.LENGTH_SHORT).show();
        }
        if(e1.getY()-e2.getY()>30)
        {
            Toast.makeText(getApplicationContext(),"Swipe Up",Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Toast.makeText(getApplicationContext(),"Single Click",Toast.LENGTH_SHORT).show();


        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        ActivityCompat.requestPermissions(MainActivity5.this,new String[]{Manifest.permission.CALL_PHONE,Manifest.permission.SEND_SMS},2);

        Toast.makeText(getApplicationContext(),"Double Click",Toast.LENGTH_SHORT).show();
        SmsManager smgr = SmsManager.getDefault();
        smgr.sendTextMessage("8357816298",null,"HELP!!",null,null);
        Toast.makeText(MainActivity5.this,"sms send successfully",Toast.LENGTH_LONG).show();
        String number="8357816298";
        Intent i=new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:"+number));
        startActivity(i);
        return true;

    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {


        return false;
    }
}