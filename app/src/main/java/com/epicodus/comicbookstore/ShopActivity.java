package com.epicodus.comicbookstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ShopActivity extends AppCompatActivity {
    @Bind(R.id.listView) ListView mListView;
    private String[] comics = new String[] {"Scott Pillgrim", "Jhon Doe", "Sandman", "Saga", "V for Vendetta", "Watchmen", "Captain Britain", "Umbrella Accademy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        ButterKnife.bind(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, comics);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String comicBook = ((TextView)view).getText().toString();
                Toast.makeText(ShopActivity.this, comicBook, Toast.LENGTH_LONG).show();
            }
        });
    }
}
