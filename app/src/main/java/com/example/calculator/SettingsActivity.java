package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SettingsActivity extends AppCompatActivity {

    private RadioButton rbLightTheme;
    private RadioButton rbDarkTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppThemeDark);
        setContentView(R.layout.activity_settings);

        initRBThemes();
    }

    @Override
    public void onBackPressed() {
        Intent intentResult = new Intent();

        if (rbLightTheme.isChecked()) {
            intentResult.putExtra(Const.SETTINGS_THEME_STYLE, Const.MyThemeCodeStyle);
        }
        else{
            intentResult.putExtra(Const.SETTINGS_THEME_STYLE, Const.DarkThemeCodeStyle);
        }
        setResult(RESULT_OK, intentResult);

        super.onBackPressed();
    }

    private void initRBThemes() {
        rbLightTheme = findViewById(R.id.rb_lightTheme);
        rbDarkTheme = findViewById(R.id.rb_darkTheme);

        int curCodeStyle = getIntent().getExtras().getInt(Const.SETTINGS_THEME_STYLE);
        if (curCodeStyle == Const.MyThemeCodeStyle) {
            rbLightTheme.setChecked(true);
        }
        else {
            rbDarkTheme.setChecked(true);
        }
    }
}