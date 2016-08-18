package com.example.baby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity_gexingdiy extends Activity{
	private Button btn;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
<<<<<<< HEAD
	setContentView(R.layout.activity_xiangcehuiyi);
/*	btn=(Button)findViewById(R.id.btn_back3);
	btn2=(Button)findViewById(R.id.btn_addimg);
	btn.setOnClickListener(onClickListener);*/
=======
	setContentView(R.layout.activity_gexindiy);
	//btn=(Button)findViewById(R.id.btn_back3);
	btn=(Button)findViewById(R.id.btn_addimg);
	btn.setOnClickListener(onClickListener);
>>>>>>> origin/xiangfeng
}
OnClickListener onClickListener=new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		/*case R.id.btn_back3:
			Intent intent=new Intent(Activity_gexingdiy.this,Note_Fragment.class);
			startActivity(intent);
			break;
			default:
				break;*/
			case R.id.btn_addimg:
				Intent intent1=new Intent(Activity_gexingdiy.this,Xiangcehuiyi_Activity.class);
				startActivity(intent1);
					break;
		}
	}
};
}
