package com.Martynenko.preference;

import android.os.Bundle;
import android.preference.PreferenceActivity;

//����� �������� ������������ ����� � �����������, ��������� ������� ��������, �������������� �� PreferenceActivity

public class Preference extends PreferenceActivity {
	 protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         getPreferenceManager().setSharedPreferencesName("main");
         addPreferencesFromResource(R.xml.preferences);
        
         
	 }
         
	 

}
