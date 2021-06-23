package com.ftm.Rshell;

import android.app.*;
import android.os.*;
	import android.util.Log;
	import android.view.View;
	import android.widget.Button;
	import android.widget.EditText;
	import android.widget.TextView;
	import com.ftm.Rshell.ShellExecuter;
	public class MainActivity extends Activity {

		EditText input;
		Button btn;
		TextView out;
		String command;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main);
			input = (EditText)findViewById(R.id.inP);
			btn = (Button)findViewById(R.id.run);
			out = (TextView)findViewById(R.id.outp);
			btn.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						ShellExecuter exe = new ShellExecuter();
						command = input.getText().toString();

						String outp = exe.Executer(command);
						out.setText(outp);
						Log.d("Output", outp);
					}
				});

		}

	}
