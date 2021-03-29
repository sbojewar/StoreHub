package edu.udayton.store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    public static final String viewId ="view", productID="productView",  link="btnopen";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent gadget = getIntent();
        Bundle values = gadget.getExtras();

        if (values != null) {
            String viewText = values.getString(viewId);
            final TextView view = (TextView)findViewById(R.id.view);
            view.setText(viewText);

            String img = values.getString(productID);
            int imgId = Integer.parseInt(img);
            final ImageView showImg = (ImageView)findViewById(R.id.productView);
            showImg.setImageResource(imgId);
            showImg.setContentDescription(viewText);

            final String btnLink = values.getString(link);
            Button buttonLink = (Button)findViewById(R.id.btnopen);
            buttonLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(btnLink));
                    startActivity(intent);
                }
            });
        }
    }
}

