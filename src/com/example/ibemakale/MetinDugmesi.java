package com.example.ibemakale;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;

public class MetinDugmesi extends Activity {
	EditText s1,s2,s3,s4,s5;
Chronometer stopwatch;
Button rq2,rq3;




	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_metin_dugmesi);
		stopwatch = (Chronometer) findViewById(R.id.stopwatch);
		rq2 = (Button) findViewById(R.id.rq2);
		rq2.setOnClickListener(mStopListener);
		rq3 = (Button) findViewById(R.id.rq3);
		rq3.setOnClickListener(listener);
		s1 = (EditText)findViewById(R.id.ra1);
		s2 = (EditText)findViewById(R.id.rra1);
		s3 = (EditText)findViewById(R.id.rrra1);
		s4 = (EditText)findViewById(R.id.rrrra1);
		s5 = (EditText)findViewById(R.id.rrrrra1);
		stopwatch.setVisibility(View.INVISIBLE);
		s1.setOnKeyListener(new OnKeyListener() {                 
            public boolean onKey(View v, int keyCode, KeyEvent event) {                 
                 if(keyCode == KeyEvent.KEYCODE_DEL){                        
                       return true; //Disable backspace key here
                     }                  
            return false;       
                }
        });   
		
		s2.setOnKeyListener(new OnKeyListener() {                 
            public boolean onKey(View v, int keyCode, KeyEvent event) {                 
                 if(keyCode == KeyEvent.KEYCODE_DEL){                        
                       return true; //Disable backspace key here
                     }                  
            return false;       
                }
        });  
		
		s3.setOnKeyListener(new OnKeyListener() {                 
            public boolean onKey(View v, int keyCode, KeyEvent event) {                 
                 if(keyCode == KeyEvent.KEYCODE_DEL){                        
                       return true; //Disable backspace key here
                     }                  
            return false;       
                }
        });  
		
		s4.setOnKeyListener(new OnKeyListener() {                 
            public boolean onKey(View v, int keyCode, KeyEvent event) {                 
                 if(keyCode == KeyEvent.KEYCODE_DEL){                        
                       return true; //Disable backspace key here
                     }                  
            return false;       
                }
        });  
		
		s5.setOnKeyListener(new OnKeyListener() {                 
            public boolean onKey(View v, int keyCode, KeyEvent event) {                 
                 if(keyCode == KeyEvent.KEYCODE_DEL){                        
                       return true; //Disable backspace key here
                     }                  
            return false;       
                }
        });
		
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
