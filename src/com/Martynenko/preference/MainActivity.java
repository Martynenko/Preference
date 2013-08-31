package com.Martynenko.preference;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private SharedPreferences mSharedPreferences;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mSharedPreferences = getSharedPreferences("main", 0);
		View objButton = findViewById(R.id.button1);
		objButton.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// Добавляем обработчик нажатия кнопки:
		startActivity(new Intent(this, Preference.class));

	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		if (mSharedPreferences.getBoolean("CheckBox", false))
			super.onBackPressed();
		// нажимаем Назад и выходим из приложения
		else {
			showDialog(1);
		}
	}

	@Override
	public Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		if (id == 1) { // создаем диалог на выход ДА или НЕТ
			AlertDialog.Builder b = new AlertDialog.Builder(this);
			// передаем заголовок
			b.setTitle("Выход");
			b.setMessage("Вы уверены, что хотите выйти?");
			b.setNegativeButton("Нет", null);
			b.setPositiveButton("Да", new DialogInterface.OnClickListener() {

				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					finish();
				}
			});

			return b.create();
		}

		return super.onCreateDialog(id);
	}

}
