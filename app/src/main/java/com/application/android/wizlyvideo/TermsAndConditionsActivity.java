package com.application.android.wizlyvideo;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class TermsAndConditionsActivity extends AppCompatActivity {
    WebView termsconditions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terms_and_conditions);

        termsconditions = findViewById(R.id.termsconditionswebview);
        termsconditions.getSettings().setJavaScriptEnabled(true);
        termsconditions.loadUrl("https://wizly-video-0.flycricket.io/terms.html");
    }
}