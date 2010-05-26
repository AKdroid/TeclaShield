package com.meadl.btcommswitch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class BTCommSwitch extends Activity {
	
	private ClientThread cthread;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView tv = (TextView) findViewById(R.id.TextView02);
        cthread = new ClientThread(tv);
        cthread.start();
    }
    
}