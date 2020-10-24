package org.hcen.android.webtemp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebTemp extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView myWebView = new WebView(this.getApplicationContext());
        setContentView(myWebView);
        // enable javascript
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String url = "file:///android_asset/index.html";
        myWebView.loadUrl(url);

    }
}
