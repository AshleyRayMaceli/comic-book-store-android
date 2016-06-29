package com.epicodus.comicbookstore;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AboutActivity extends AppCompatActivity {
    @Bind(R.id.aboutUsTitle) TextView mAboutUsTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ButterKnife.bind(this);
        Typeface actionManFont = Typeface.createFromAsset(getAssets(), "fonts/Action_Man.ttf");
        mAboutUsTitle.setTypeface(actionManFont);
    }
}
