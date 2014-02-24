package com.example.andtest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Dial extends Activity {

	private static final String TAG = "Dial";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        Log.v(TAG,"onCreate is called.");
		setContentView(R.layout.dial);
	}
	
	// OKボタンの処理
	public void onClick_OKButton(View target){
		// 入力欄から電話番号文字列の取得
		EditText editText = (EditText)findViewById(R.id.EditText01);
		String telNumber = editText.getText().toString();
		
		// 電話番号を指定して発信
		Intent intent = new Intent(
				Intent.ACTION_CALL, Uri.parse("tel:" + telNumber));
		
		startActivity(intent);
		
	}

}
