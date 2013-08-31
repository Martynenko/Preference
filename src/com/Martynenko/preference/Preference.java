package com.Martynenko.preference;

import android.os.Bundle;
import android.preference.PreferenceActivity;

//чтобы показать пользователю экран с настройками, небходимо создать активити, унаследованное от PreferenceActivity

public class Preference extends PreferenceActivity {
	 protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         getPreferenceManager().setSharedPreferencesName("main");
         addPreferencesFromResource(R.xml.preferences);
        
         
	 }
         
	 

}
