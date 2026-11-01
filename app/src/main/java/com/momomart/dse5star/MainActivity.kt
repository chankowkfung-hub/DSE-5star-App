package com.momomart.dse5star
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity: AppCompatActivity(){
    override fun onCreate(s: Bundle?){
        super.onCreate(s)
        setContentView(R.layout.activity_main)
        AdManager.showAppOpen(this)
        val adContainer = findViewById<LinearLayout>(R.id.adContainer)
        val adView = AdView(this).apply{ adUnitId = AdManager.BANNER_ID; setAdSize(AdSize.BANNER) }
        adContainer.addView(adView)
        AdManager.loadBanner(adView)
        // TODO: setup elective grid with gold icons
    }
}