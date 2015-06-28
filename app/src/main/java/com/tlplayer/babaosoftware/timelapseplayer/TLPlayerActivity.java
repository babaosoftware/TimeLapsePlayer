package com.tlplayer.babaosoftware.timelapseplayer;

import com.tlplayer.babaosoftware.timelapseplayer.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

public class TLPlayerActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        setContentView(R.layout.activity_tlplayer);
        final WebView wv = (WebView)findViewById(R.id.tlpwv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("file:///mnt/sdcard/Android/data/com.babaosoftware.tlplayer/tlplayer.html");
    }

}
