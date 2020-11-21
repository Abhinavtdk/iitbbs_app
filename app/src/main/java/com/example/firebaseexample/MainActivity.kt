package com.example.firebaseexample

import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewAnimationUtils
import android.view.WindowManager
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import androidx.browser.customtabs.CustomTabsIntent
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.progressBar
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

//    private lateinit var webView: WebView
//    private lateinit var progressBar : ProgressBar
    private val url: String = "https://discoveriitbbs.herokuapp.com/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        val builder:CustomTabsIntent.Builder = CustomTabsIntent.Builder()
        val customTabsIntent = builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))


//        progressBar = findViewById(R.id.progressBar)
//        webView = findViewById(R.id.splashWebView)
//        setUpWebView()

    }

//    private fun setUpWebView() {
//
//        webView.apply {
//            webViewClient = object :WebViewClient(){
//
//                override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
//                    super.onPageStarted(view, url, favicon)
//                    progressBar?.visibility = View.VISIBLE
//                }
//
//                override fun onPageFinished(view: WebView?, url: String?) {
//                    super.onPageFinished(view, url)
//                    progressBar?.visibility = View.GONE
//                    progressBar?.progress = 100
//                    webView.visibility = View.VISIBLE
//                }
//            }
//            webChromeClient = WebChromeClient()
//            loadUrl("https://discoveriitbbs.herokuapp.com/")
//            clearCache(true)
//            settings.javaScriptEnabled = true
//            settings.javaScriptCanOpenWindowsAutomatically = true
//            settings.userAgentString = "myApp"
//        }
//    }
//
//    override fun onBackPressed() {
//        if(webView.canGoBack()){
//            webView.goBack()
//        } else {
//            super.onBackPressed()
//        }
//    }
}