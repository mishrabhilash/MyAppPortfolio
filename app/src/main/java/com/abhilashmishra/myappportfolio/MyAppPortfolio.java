package com.abhilashmishra.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MyAppPortfolio extends AppCompatActivity {

    LinearLayout buttonCarrier;
    Button btnSpotifyStreamer, btnScoresApp,btnLibraryApp,btnBuildItBiggerApp,btnXYZReaderApp,btnCapstoneApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);

        buttonCarrier = (LinearLayout)findViewById(R.id.buttonCarrier);

        btnSpotifyStreamer = (Button)buttonCarrier.findViewById(R.id.spotify_streamer);
        btnScoresApp = (Button)buttonCarrier.findViewById(R.id.scores_App);
        btnLibraryApp = (Button)buttonCarrier.findViewById(R.id.library_app);
        btnBuildItBiggerApp = (Button)buttonCarrier.findViewById(R.id.build_it_bigger);
        btnXYZReaderApp = (Button)buttonCarrier.findViewById(R.id.xyz_reader);
        btnCapstoneApp = (Button)buttonCarrier.findViewById(R.id.capstone);

        btnSpotifyStreamer.setOnClickListener(clickListener);
        btnScoresApp.setOnClickListener(clickListener);
        btnLibraryApp.setOnClickListener(clickListener);
        btnBuildItBiggerApp.setOnClickListener(clickListener);
        btnXYZReaderApp.setOnClickListener(clickListener);
        btnCapstoneApp.setOnClickListener(clickListener);

    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String message="";
            switch (view.getId()){
                case R.id.spotify_streamer:message="This button will launch my Spotify Streamer App";break;
                case R.id.scores_App:message="This button will launch my Scores App";break;
                case R.id.library_app:message="This button will launch my Library App";break;
                case R.id.build_it_bigger:message="This button will launch my Build It Bigger App";break;
                case R.id.xyz_reader:message="This button will launch my XYZ Reader App";break;
                case R.id.capstone:message="This button will launch my Capstone App";break;
            }
            Toast.makeText(MyAppPortfolio.this,message,Toast.LENGTH_SHORT).show();
        }
    };
}
