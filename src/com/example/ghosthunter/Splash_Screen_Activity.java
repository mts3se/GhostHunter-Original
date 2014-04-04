package com.example.ghosthunter;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



public class Splash_Screen_Activity extends MainActivity
{
	private final int SPLASH_DISPLAY_LENGTH = 10000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		
		new Handler().postDelayed(new Runnable()
		{
			@Override
			public void run()
			{
				Intent mainIntent = new Intent(Splash_Screen_Activity.this, MainActivity.class );
				Splash_Screen_Activity.this.startActivity(mainIntent);
				Splash_Screen_Activity.this.finish();
			}
		}, SPLASH_DISPLAY_LENGTH);
			}
		
	


}

