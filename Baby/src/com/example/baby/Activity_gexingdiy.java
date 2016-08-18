package com.example.baby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_gexingdiy extends Activity{
	private Button btn;
	private ImageButton btn2,btn3;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);

	setContentView(R.layout.activity_gexindiy);
	
	btn=(Button)findViewById(R.id.btn_addimg);
	btn.setOnClickListener(onClickListener);

	btn2=(ImageButton)findViewById(R.id.btn_back2);
	//btn2.setOnClickListener(onClickListener);

}
OnClickListener onClickListener=new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.btn_back2:
			Intent intent=new Intent(Activity_gexingdiy.this,Note_Fragment.class);
			startActivity(intent);
			break;
			default:
				break;
			case R.id.btn_addimg:
				
				Intent intent1 = new Intent();
		        intent1.setAction(Intent.ACTION_VIEW);
		        intent1.setType("image/*");
		        startActivity(intent1);
		        
		        Intent intent2= new Intent();
		        intent2.setAction(Intent.ACTION_GET_CONTENT);
		        intent2.setType("image/*");
		        startActivityForResult(Intent.createChooser(intent2, "Select Picture"),1);
				
				//Intent intent3=new Intent(Activity_gexingdiy.this,Xiangcehuiyi_Activity.class);
				//startActivity(intent3);
					break;
		}
	}
};
}
