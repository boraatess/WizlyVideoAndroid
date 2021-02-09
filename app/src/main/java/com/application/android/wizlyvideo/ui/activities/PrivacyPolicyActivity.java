package com.application.android.wizlyvideo.ui.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.application.android.wizlyvideo.R;

public class PrivacyPolicyActivity extends AppCompatActivity {
    WebView privacywebView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.privacy_policy);

        privacywebView = findViewById(R.id.privacywebview);
        privacywebView.getSettings().setJavaScriptEnabled(true);
        privacywebView.loadUrl("https://wizly-video-0.flycricket.io/privacy.html");
    }
}