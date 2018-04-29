package com.example.android.userprofile;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView profileImageImageView = (ImageView) findViewById(R.id.profile_picture);

        // Code for circular profile picture created with the help of Stack Overflow question
        // https://stackoverflow.com/questions/11932805/cropping-circular-area-from-bitmap-in-android/28096369#28096369
        Bitmap imageBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.profile);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), imageBitmap);

        //setting radius
        roundedBitmapDrawable.setCircular(true);
        roundedBitmapDrawable.setAntiAlias(true);
        profileImageImageView.setImageDrawable(roundedBitmapDrawable);

        TextView nameTextView = (TextView) findViewById(R.id.name);
        TextView degreeTextView = (TextView) findViewById(R.id.degree);
        TextView birthdayTextView = (TextView) findViewById(R.id.birthday);
        TextView countryTextView = (TextView) findViewById(R.id.country);

        nameTextView.setText("Cory");
        degreeTextView.setText("Android Basics Nano Degree");
        birthdayTextView.setText("July 10th");
        countryTextView.setText("United States");
    }
}
