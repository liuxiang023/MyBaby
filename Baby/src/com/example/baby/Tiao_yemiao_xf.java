package com.example.baby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class Tiao_yemiao_xf extends Activity{
	TextView textview;
	Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xiangcehuiyi_2);
		textview=(TextView) findViewById(R.id.diy_1);
		textview.setOnClickListener(l);
		button=(Button) findViewById(R.id.tianjiatupian);
		button.setOnClickListener(l);
		
	}
OnClickListener l =new OnClickListener() {
	
	//private int CAPTURE_CODE;

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		/*case R.id .diy_1:
			Intent intent=new Intent(Tiao_yemiao_xf.this,Xiangcehuiyi_Activity.class);
			startActivity(intent);
			break;*/
		case R.id.tianjiatupian:
			
			
			
			/**
			 * 
			 * 调用 相机
			 */
			/*Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
			intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1);
			// Intent intent = new
			// Intent("android.media.action.IMAGE_CAPTURE");
			// Uri fromFile = Uri.fromFile(mCurrentPhotoFile);
			// String string = fromFile.toString();
			// Log.i("gp", string);
			// intent.putExtra(MediaStore.EXTRA_OUTPUT,
			// Uri.fromFile(mCurrentPhotoFile));
			startActivityForResult(intent, CAPTURE_CODE);*/
			
			Intent intent1 = new Intent();
	        intent1.setAction(Intent.ACTION_VIEW);
	        intent1.setType("image/*");
	        startActivity(intent1);
	        
	        Intent intent2= new Intent();
	        intent2.setAction(Intent.ACTION_GET_CONTENT);
	        intent2.setType("image/*");
	        startActivityForResult(Intent.createChooser(intent2, "Select Picture"),1);
	        

	   

	        
		}
	}
};


}
