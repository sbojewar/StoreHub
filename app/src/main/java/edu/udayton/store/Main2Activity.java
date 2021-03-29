package edu.udayton.store;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.text.BreakIterator;
import java.util.Arrays;
import java.util.List;

public class Main2Activity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //list
        List<String> product=
                Arrays.asList(getResources().getStringArray(R.array.products));

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main2,
                R.id.textView6, product));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position,long id)
    {
        if(position == 0){
            // Wer are sending the values of text, image and link to MainActivity3
            startActivity(new Intent(this,Main4Activity.class));
        }
        if(position == 1) {
            startActivity(new Intent(this, Main5Activity.class));
        }
        if(position == 2){
            startActivity(new Intent(this,Main6Activity.class));
        }
        if(position == 3){
            startActivity(new Intent(this,Main7Activity.class));
        }
        if(position == 4){
            startActivity(new Intent(this,Main8Activity.class));
        }
    }


}

