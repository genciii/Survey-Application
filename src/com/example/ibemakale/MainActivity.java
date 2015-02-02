package com.example.ibemakale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView a, b, c, d;
	Button e;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		addListenerOnButton();
	}

	public void addListenerOnButton() {

		a = (TextView) findViewById(R.id.a2);
		a.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(MainActivity.this,
						RadyoDugmesi.class);
				startActivity(intent);

			}

		});

		b = (TextView) findViewById(R.id.a3);
		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(MainActivity.this,
						MetinDugmesi.class);
				startActivity(intent);

			}

		});

		c = (TextView) findViewById(R.id.a4);
		c.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(MainActivity.this,
						FirildakDugmesi.class);
				startActivity(intent);

			}

		});

		d = (TextView) findViewById(R.id.a5);
		d.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(MainActivity.this,
						ButtonDugmesi.class);
				startActivity(intent);

			}

		});
		
		e = (Button) findViewById(R.id.a6);
		e.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(MainActivity.this,
						Ornekler.class);
				startActivity(intent);

			}

		});

	}

}
