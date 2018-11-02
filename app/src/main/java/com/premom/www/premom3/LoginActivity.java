package com.premom.www.premom3;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
    Button m_refButton;
    EditText user_id;
    EditText user_pw;
    private SharedPreferences appData;
    private boolean saveLoginData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_login);

        this.m_refButton =(Button)findViewById(R.id.fl_button01);
        this.user_id =(EditText)findViewById(R.id.user_id);
        this.user_pw =(EditText)findViewById(R.id.user_pw);

        appData = getSharedPreferences("appData", MODE_PRIVATE);
        load();


        if (saveLoginData) {
            login();
        }
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
//        ref_Intent = new Intent(packageContext this, TestNextIntentActivity.class);

//        startActivity(ref_Intent);
=======
=======
    public void fl_BtnClick(View v){
>>>>>>> e7ee23d... login & mypage
        if(user_id.getText().toString().equals("test") && user_pw.getText().toString().equals("test") ) {
            login();
        }  else {
            Toast.makeText(this, "아이디 또는 패스워드가 잘못되었습니다.", Toast.LENGTH_SHORT).show();
        }
    }

    private void login() {
        save();

        Intent ref_Intent;
        ref_Intent = new Intent(this, MainActivity.class);
        startActivity(ref_Intent);

<<<<<<< HEAD
            startActivity(ref_Intent);
            LoginActivity.this.finish();
        } else {
            Toast.makeText(this, "아이디 또는 패스워드가 잘못되었습니다.", Toast.LENGTH_SHORT).show();
        }
=======
        ref_Intent = new Intent(this, MainActivity.class);
>>>>>>> 79b1a6cadb776b85e40aec8babdb2c5ca0709627

>>>>>>> 9740820... login complete
=======
        ref_Intent = new Intent(this, DiaryActivity.class);
        startActivity(ref_Intent);
>>>>>>> 6ea47abc68dfcd1b870f77bc11386e09bbafd0b5
=======
        LoginActivity.this.finish();
>>>>>>> e7ee23d... login & mypage

    }


    private void save() {
        SharedPreferences.Editor editor = appData.edit();
        
        editor.putBoolean("SAVE_LOGIN_DATA", true);
        editor.putString("user_id", "test");
        editor.putString("user_pw", "test");

        editor.apply();
    }

    private void load() {
        saveLoginData = appData.getBoolean("SAVE_LOGIN_DATA", false);
    }



}
