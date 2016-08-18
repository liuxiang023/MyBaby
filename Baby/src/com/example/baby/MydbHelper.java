package com.example.baby;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MydbHelper extends SQLiteOpenHelper {
	private static final int VERSION = 2;
	public static final String DBName = "userinfos";
	public static final String USER_TABLE_NAME = "users";
	private String CREATE_TABLE = "create table if not exists "
			+ USER_TABLE_NAME
			+ "(personid integer primary key,name varchar(20),age integer)";

	public MydbHelper(Context context, String name, CursorFactory factory,
			int version, DatabaseErrorHandler errorHandler) {
		super(context, name, factory, version, errorHandler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL( CREATE_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
