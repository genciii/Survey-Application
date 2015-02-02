package com.example.ibemakale;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;

public class FirildakDugmesi extends Activity {
	Chronometer stopwatch;
	Button rq2,rq3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_firildak_dugmesi);
		stopwatch = (Chronometer) findViewById(R.id.stopwatch);
		rq2 = (Button) findViewById(R.id.rq2);
		rq2.setOnClickListener(mStopListener);
		
		rq3 = (Button) findViewById(R.id.rq3);
		rq3.setOnClickListener(listener);
		stopwatch.setVisibility(View.INVISIBLE);
	}
	
	
	OnClickListener listener = new OnClickListener() {
		@Override
		public void onClick(View v) {
	if (v.equals(rq3)) {
		stopwatch.setVisibility(View.VISIBLE);
	
	}
     
		}

	};

	View.OnClickListener mStopListener = new OnClickListener() {
		public void onClick(View v) {
			rq2.setVisibility(View.INVISIBLE);
			stopwatch.start();
			stopwatch.stop();
		}
	};

}
