package edu.udayton.store;


import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class Main7Activity  extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        List<String> product =
                Arrays.asList(getResources().getStringArray(R.array.soda));

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main4,
                R.id.textView6, product));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent;

        switch (position) {
            case 0:
                intent = new Intent(Main7Activity.this, Main3Activity.class);
                // Wer are sending the values of text, image and link to MainActivity3
                intent.putExtra(Main3Activity.viewId, getResources().getString(R.string.fanta));
                intent.putExtra(Main3Activity.productID, Integer.toString(R.drawable.fanta));
                intent.putExtra(Main3Activity.link, getResources().getString(R.string.sodalink));
                break;
            case 1:
                intent = new Intent(Main7Activity.this, Main3Activity.class);
                intent.putExtra(Main3Activity.viewId, getResources().getString(R.string.redbull));
                intent.putExtra(Main3Activity.productID, Integer.toString(R.drawable.red));
                intent.putExtra(Main3Activity.link, getResources().getString(R.string.sodalink));
                break;
            case 2:
                intent = new Intent(Main7Activity.this, Main3Activity.class);
                intent.putExtra(Main3Activity.viewId, getResources().getString(R.string.pepsi));
                intent.putExtra(Main3Activity.productID, Integer.toString(R.drawable.pepsi));
                intent.putExtra(Main3Activity.link, getResources().getString(R.string.sodalink));
                break;
            default:
                intent = null;
                break;
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
