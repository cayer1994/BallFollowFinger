package com.example.ballfollowfinger;

import android.support.v7.app.ActionBarActivity;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
       final Ball ball=new Ball(this);
       ball.setMinimumHeight(500);
       ball.setMinimumWidth(500);
       ball.setOnTouchListener(new OnTouchListener()
    		   {
                @Override
                public boolean onTouch(View arg0,MotionEvent e)
                {
                	ball.x=e.getX();
                	ball.y=e.getY();ball.invalidate();
                	return true;
                }
    		   });
       RelativeLayout r=(RelativeLayout)findViewById(R.id.root);
       r.addView(ball);
       
	}

	

	
}
