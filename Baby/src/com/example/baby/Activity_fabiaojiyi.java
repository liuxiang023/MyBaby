package com.example.baby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_fabiaojiyi extends Activity {
	private ImageButton btn2,btn3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fabiaojiyi);
		btn2=(ImageButton)findViewById(R.id.btn_back3);
		btn3=(ImageButton)findViewById(R.id.btn_addimg2);
		
		
		btn3.setOnClickListener(onClickListener);
		
	}
	OnClickListener onClickListener=new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(v.getId()){
		
			
			case R.id.btn_addimg2:
				Intent intent1 = new Intent();
		        intent1.setAction(Intent.ACTION_VIEW);
		        intent1.setType("image/*");
		        startActivity(intent1);
		        
		        Intent intent3= new Intent();
		        intent3.setAction(Intent.ACTION_GET_CONTENT);
		        intent3.setType("image/*");
		        startActivityForResult(Intent.createChooser(intent3, "Select Picture"),1);
		        break;
				default:
					break;
			}
			
			
		}
	};

}
