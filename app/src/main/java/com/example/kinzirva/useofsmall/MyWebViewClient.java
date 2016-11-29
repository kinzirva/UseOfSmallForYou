package com.example.kinzirva.useofsmall;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;

import net.wequick.small.webkit.WebView;
import net.wequick.small.webkit.WebViewClient;

/**
 * Created by kinzirva on 2016/11/24.
 */
public class MyWebViewClient extends WebViewClient {

    private ProgressDialog mDlg;

    @Override
    public void onPageStarted(Context context, WebView view, String url, Bitmap favicon) {
        mDlg = new ProgressDialog(context);
        mDlg.setMessage("Loading...");
        mDlg.show();
        super.onPageStarted(context, view, url, favicon);
    }

    @Override
    public void onPageFinished(Context context, WebView view, String url) {
        super.onPageFinished(context, view, url);
        mDlg.dismiss();
    }

    @Override
    public void onReceivedError(Context context, WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(context, view, errorCode, description, failingUrl);
        mDlg.dismiss();
        Toast.makeText(context, description, Toast.LENGTH_SHORT).show();
    }
}
