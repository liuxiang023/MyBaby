package com.example.baby;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Activity_fabiaojiyi extends Activity {
	private ImageButton btn2,btn3;
	private Button btn;
	private EditText edittext;
	/**SharedPreferences*/
	private SharedPreferences mSharedPreferences;
	/**Editor*/
	private Editor mEditor;
	private static final String SAVE_FILE_NAME = "save_spref";
	private static final String SAVE_FILE_KEY = "save_key";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fabiaojiyi);
		btn=(Button)findViewById(R.id.btn_addhuiyi);
		btn2=(ImageButton)findViewById(R.id.btn_back3);
		btn3=(ImageButton)findViewById(R.id.btn_addimg2);
		edittext=(EditText)findViewById(R.id.edittext);
		btn.setOnClickListener(onClickListener);
		btn2.setOnClickListener(onClickListener);
		btn3.setOnClickListener(onClickListener);
		mSharedPreferences = getSharedPreferences(SAVE_FILE_NAME, MODE_PRIVATE);
		mEditor = mSharedPreferences.edit();
		/**如果要取得对应的值*/
		String getContent = mSharedPreferences.getString(SAVE_FILE_KEY, "");
		edittext.setText(getContent);
		
	}
	OnClickListener onClickListener=new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(v.getId()){
			case R.id.btn_addtext:
				String content = edittext.getText().toString();
				mEditor.putString(SAVE_FILE_KEY, content);
				break;
			case R.id.btn_back3:
				Intent intent=new Intent(Activity_fabiaojiyi.this,Note_Fragment.class);
				startActivity(intent);
				break;
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
