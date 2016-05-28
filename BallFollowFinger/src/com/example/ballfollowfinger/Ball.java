package com.example.ballfollowfinger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Ball extends View{
	public float x=0;
	public float y=0;

	public Ball(Context context) {
		super(context);
		
	}
	@Override
	public void onDraw(Canvas c)
	{
		super.onDraw(c);
		Paint p=new Paint();
		p.setColor(Color.RED);
		c.drawCircle(x, y, 100, p);
	}

}
