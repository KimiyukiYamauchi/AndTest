package com.example.andtest;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class Menu extends Activity {

	private static final String TAG = "Menu";

	// 画面のレイアウト設定
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
	}
	
	// 「電話をかける」ボタンの処理
	public void onClick_TelButton(View target){
        Log.v(TAG,"onClick_TelButton is called.");
		Intent intent = new Intent(this, Dial.class);
		startActivity(intent);
	}
	
	// 「メールする」ボタンの処理
	public void onClick_MailButton(View target){
        Log.v(TAG,"onClick_MailButton is called.");
//        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"));
    	Intent intent = new Intent();
    	// アクションを指定(ACTION_SENDTOではないところがミソ)  
    	intent.setAction(Intent.ACTION_SEND);  
    	// データタイプを指定  
        intent.setType("message/rfc822");  
    	startActivity(intent);
	}
	
	// 「サイト」ボタンの処理
	public void onClick_WebButton(View target){
        Log.v(TAG,"onClick_WebButton is called.");
    	Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.it-college.ac.jp"));
    	startActivity(intent);
	}
	
	// 「地図」ボタンの処理
	public void onClick_MapButton(View target){
        Log.v(TAG,"onClick_MapButton is called.");
    	Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=沖縄県那覇市樋川１丁目１−７７"));
    	startActivity(intent);
	}
	
	// 「終了」ボタンの処理
	public void onClick_ExitButton(View target){
		finish();
	}

}
