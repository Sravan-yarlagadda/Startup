package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private String EXTRA_MESSAGE = "com.example.myfirstapp.EXTRA_MESSAGE";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void sendMessage(View view){
    	Intent intent = new Intent(this,DisplayMessageActivity.class);
    	EditText editText = (EditText) findViewById(R.id.editText1);
    	intent.putExtra(EXTRA_MESSAGE,editText.getText().toString() );
    	startActivity(intent);
    }
}
