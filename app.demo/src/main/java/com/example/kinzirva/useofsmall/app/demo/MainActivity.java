package com.example.kinzirva.useofsmall.app.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by kinzirva on 2016/11/24.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_update).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Small.setUp(MainActivity.this, new Small.OnCompleteListener() {
//                    @Override
//                    public void onComplete() {
//                        Small.openUri("demo",MainActivity.this);
//                    }
//                });
                checkUpgrade();

            }
        });
    }

    private void checkUpgrade() {
        new UpgradeManager(getApplicationContext()).checkUpgrade();
    }
}
