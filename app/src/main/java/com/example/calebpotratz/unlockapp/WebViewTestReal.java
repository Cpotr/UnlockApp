package com.example.calebpotratz.unlockapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewTestReal extends Activity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_test_real);

        WebView webViewTest = (WebView) findViewById(R.id.webView);
        webViewTest.setWebViewClient(new customWebViewClient());
        webViewTest.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        WebSettings webSettings = webViewTest.getSettings();
        webSettings.setJavaScriptEnabled(true);


        webViewTest.loadUrl("http://www.google.com");

    }

    private class customWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }

}