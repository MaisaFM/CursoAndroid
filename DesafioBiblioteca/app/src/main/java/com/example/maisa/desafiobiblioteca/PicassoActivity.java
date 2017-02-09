package com.example.maisa.desafiobiblioteca;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;



import static java.security.AccessController.getContext;

public class PicassoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);

        ImageView imageView1 = (ImageView) findViewById(R.id.imag_view1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imag_view2);

        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(imageView1);
        Picasso.with(this).load("http://pt.wahooart.com/Art.nsf/O/8XXU4K/$File/Edvard-Munch-The-Scream-3-.jpg").into(imageView2);

    }


}
