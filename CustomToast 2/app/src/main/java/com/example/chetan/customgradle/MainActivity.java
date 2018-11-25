package com.example.chetan.customgradle;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        switch (view.getId()){
            case R.id.error_button:
                Toasty.error(this , "Error message").show();
                break;
            case R.id.warning_button:
                Toasty.warning(this , "Error message").show();
                break;
            case R.id.info_button:
                Toasty.info(this , "Error message").show();
                break;
            case R.id.success_button:
                Toasty.success(this , "Error message").show();
                break;
            case R.id.img_button:
                Toasty.normal(this , "Error message" , ContextCompat.getDrawable(this , R.drawable.ic_cloud_done_black_24dp)).show();
                break;
        }
    }
}
