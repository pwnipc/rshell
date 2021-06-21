package com.ftm.Rshell;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	EditText getCmd;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		getCmd = (EditText) findViewById(R.id.enterCmd);
    }
	public void execute(View v){
		//String cmd = getCmd.getText().toString();
		try{
		 int res = Runtime.getRuntime().exec("whoami").waitFor();
		 getCmd.setText(res);
		}
		catch(Exception e){
			e.printStackTrace();
			return;
		}
		
	}
}
