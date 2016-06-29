package com.epicodus.comicbookstore;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.shopButton) Button mShopButton;
    @Bind(R.id.textView) TextView mTextView;
    @Bind(R.id.aboutUsButton) Button mAboutUsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mShopButton.setOnClickListener(this);
        mAboutUsButton.setOnClickListener(this);
        Typeface actionManFont = Typeface.createFromAsset(getAssets(), "fonts/Action_Man.ttf");
        mTextView.setTypeface(actionManFont);
        mShopButton.setTypeface(actionManFont);
        mAboutUsButton.setTypeface(actionManFont);
    }

    @Override
    public void onClick(View v) {
        if(v == mShopButton) {
            Intent intent = new Intent(MainActivity.this, ShopActivity.class);
            startActivity(intent);
        } else if (v == mAboutUsButton) {
            Intent intent = new Intent (MainActivity.this, AboutActivity.class);
            startActivity(intent);
        }
    }
}
