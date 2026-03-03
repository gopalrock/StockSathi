package com.stocksathi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("StockSathi Installed Successfully!");
        tv.setTextSize(22);
        setContentView(tv);
    }
}
