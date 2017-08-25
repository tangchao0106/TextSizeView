package com.aijie.settextsizeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SetTextSizeView.OnPointResultListener {
    SetTextSizeView mSetTextSizeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSetTextSizeView = (SetTextSizeView) findViewById(R.id.stsize);
        mSetTextSizeView.setOnPointResultListener(this);
    }

    @Override
    public void onPointResult(int position) {
        Toast.makeText(this, "position==="+position, Toast.LENGTH_SHORT).show();
    }
}
