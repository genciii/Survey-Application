package com.example.ibemakale;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;

public class ButtonDugmesi extends Activity {
	Button rq2, rq3,ra1, r2, r3, r4, rra1, rr2, rr3, rr4, rrra1, rrr2, rrr3, rrr4,
			rrrra1, rrrr2, rrrr3, rrrr4, rrrrra1, rrrrr2, rrrrr3, rrrrr4;
	Chronometer stopwatch;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buttons);
		rq2 = (Button) findViewById(R.id.rq2);
		ra1 = (Button) findViewById(R.id.ra1);
		r2 = (Button) findViewById(R.id.r2);
		r3 = (Button) findViewById(R.id.r3);
		r4 = (Button) findViewById(R.id.r4);
		rra1 = (Button) findViewById(R.id.rra1);
		rr2 = (Button) findViewById(R.id.rr2);
		rr3 = (Button) findViewById(R.id.rr3);
		rr4 = (Button) findViewById(R.id.rr4);
		rrra1 = (Button) findViewById(R.id.rrra1);
		rrr2 = (Button) findViewById(R.id.rrr2);
		rrr3 = (Button) findViewById(R.id.rrr3);
		rrr4 = (Button) findViewById(R.id.rrr4);
		rrrra1 = (Button) findViewById(R.id.rrrra1);
		rrrr2 = (Button) findViewById(R.id.rrrr2);
		rrrr3 = (Button) findViewById(R.id.rrrr3);
		rrrr4 = (Button) findViewById(R.id.rrrr4);
		rrrrra1 = (Button) findViewById(R.id.rrrrra1);
		rrrrr2 = (Button) findViewById(R.id.rrrrr2);
		rrrrr3 = (Button) findViewById(R.id.rrrrr3);
		rrrrr4 = (Button) findViewById(R.id.rrrrr4);
		stopwatch = (Chronometer) findViewById(R.id.stopwatch);
		rq2.setOnClickListener(mStopListener);
		rq3 = (Button) findViewById(R.id.rq3);
		rq3.setOnClickListener(listener);

		ra1.setOnClickListener(listener);
		r2.setOnClickListener(listener);
		r3.setOnClickListener(listener);
		r4.setOnClickListener(listener);

		rra1.setOnClickListener(listener);
		rr2.setOnClickListener(listener);
		rr3.setOnClickListener(listener);
		rr4.setOnClickListener(listener);

		rrra1.setOnClickListener(listener);
		rrr2.setOnClickListener(listener);
		rrr3.setOnClickListener(listener);
		rrr4.setOnClickListener(listener);

		rrrra1.setOnClickListener(listener);
		rrrr2.setOnClickListener(listener);
		rrrr3.setOnClickListener(listener);
		rrrr4.setOnClickListener(listener);

		rrrrra1.setOnClickListener(listener);
		rrrrr2.setOnClickListener(listener);
		rrrrr3.setOnClickListener(listener);
		rrrrr4.setOnClickListener(listener);
		stopwatch.setVisibility(View.INVISIBLE);

	}

	OnClickListener listener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			if (v.equals(ra1)) {
				r2.setVisibility(View.INVISIBLE);
				r3.setVisibility(View.INVISIBLE);
				r4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(r2)) {
				ra1.setVisibility(View.INVISIBLE);
				r3.setVisibility(View.INVISIBLE);
				r4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(r3)) {
				r2.setVisibility(View.INVISIBLE);
				ra1.setVisibility(View.INVISIBLE);
				r4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(r4)) {
				r2.setVisibility(View.INVISIBLE);
				r3.setVisibility(View.INVISIBLE);
				ra1.setVisibility(View.INVISIBLE);
			}

			if (v.equals(rra1)) {
				rr2.setVisibility(View.INVISIBLE);
				rr3.setVisibility(View.INVISIBLE);
				rr4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(rr2)) {
				rra1.setVisibility(View.INVISIBLE);
				rr3.setVisibility(View.INVISIBLE);
				rr4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(rr3)) {
				rr2.setVisibility(View.INVISIBLE);
				rra1.setVisibility(View.INVISIBLE);
				rr4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(rr4)) {
				rr2.setVisibility(View.INVISIBLE);
				rr3.setVisibility(View.INVISIBLE);
				rra1.setVisibility(View.INVISIBLE);
			}

			if (v.equals(rrra1)) {
				rrr2.setVisibility(View.INVISIBLE);
				rrr3.setVisibility(View.INVISIBLE);
				rrr4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(rrr2)) {
				rrra1.setVisibility(View.INVISIBLE);
				rrr3.setVisibility(View.INVISIBLE);
				rrr4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(rrr3)) {
				rrr2.setVisibility(View.INVISIBLE);
				rrra1.setVisibility(View.INVISIBLE);
				rrr4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(rrr4)) {
				rrr2.setVisibility(View.INVISIBLE);
				rrr3.setVisibility(View.INVISIBLE);
				rrra1.setVisibility(View.INVISIBLE);
			}

			if (v.equals(rrrra1)) {
				rrrr2.setVisibility(View.INVISIBLE);
				rrrr3.setVisibility(View.INVISIBLE);
				rrrr4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(rrrr2)) {
				rrrra1.setVisibility(View.INVISIBLE);
				rrrr3.setVisibility(View.INVISIBLE);
				rrrr4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(rrrr3)) {
				rrrr2.setVisibility(View.INVISIBLE);
				rrrra1.setVisibility(View.INVISIBLE);
				rrrr4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(rrrr4)) {
				rrrr2.setVisibility(View.INVISIBLE);
				rrrr3.setVisibility(View.INVISIBLE);
				rrrra1.setVisibility(View.INVISIBLE);
			}

			if (v.equals(rrrrra1)) {
				rrrrr2.setVisibility(View.INVISIBLE);
				rrrrr3.setVisibility(View.INVISIBLE);
				rrrrr4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(rrrrr2)) {
				rrrrra1.setVisibility(View.INVISIBLE);
				rrrrr3.setVisibility(View.INVISIBLE);
				rrrrr4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(rrrrr3)) {
				rrrrr2.setVisibility(View.INVISIBLE);
				rrrrra1.setVisibility(View.INVISIBLE);
				rrrrr4.setVisibility(View.INVISIBLE);
			}
			if (v.equals(rrrrr4)) {
				rrrrr2.setVisibility(View.INVISIBLE);
				rrrrr3.setVisibility(View.INVISIBLE);
				rrrrra1.setVisibility(View.INVISIBLE);
			}
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
