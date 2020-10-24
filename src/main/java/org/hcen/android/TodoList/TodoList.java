package org.hcen.android.TodoList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class TodoList extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        WebView myWebView = new WebView(this.getApplicationContext());
        setContentView(myWebView);
        // enable javascript
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // enable localstorage
        webSettings.setDomStorageEnabled(true);

        String url = "file:///android_asset/index.html";
        myWebView.loadUrl(url);

    }
}
