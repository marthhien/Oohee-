package com.example.oohee;

import android.text.Html;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.pm.ActivityInfo;
import com.example.oohee.R;
import android.media.MediaPlayer;
import android.media.AudioManager;


public class DetailActivity extends Activity {

	
		int screenhv = 0;
        MediaPlayer spk1,spk2, spk3;
		
 	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setVolumeControlStream(AudioManager.STREAM_MUSIC);
	        setContentView(R.layout.detail_activity);
	 
			Bundle extras = getIntent().getExtras();
			if(extras !=null) {
			    String txtf = extras.getString("txt1"); 
			    String txte = extras.getString("txt2"); 
			    String txts = extras.getString("txt3"); 
			    int c = extras.getInt("c"); 
			    int p = extras.getInt("p"); 
		    
			    TextView tv1 = (TextView) findViewById(R.id.textView1);
                tv1.setText(Html.fromHtml("<b>" + txtf + "</b>"));
                	  
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                tv2.setText(Html.fromHtml("<b>" + txte + "</b>"));
     
                TextView tv3 = (TextView) findViewById(R.id.textView3);
                tv3.setText(Html.fromHtml("<b>" + txts + "</b>"));

                
           	    spk1=MediaPlayer.create(this,R.raw.c1p1f);
 	    	    spk2=MediaPlayer.create(this,R.raw.c1p1e);
		    	spk3=MediaPlayer.create(this,R.raw.c1p1s);

                if (c==1) {
                	if (p==1) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p1f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p1e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p1s);   }
                	if (p==2) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p2f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p2e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p2s);   }
  	    	        if (p==3) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p3f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p3e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p3s);   }
                 	if (p==4) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p4f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p4e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p4s);   }
                 	if (p==5) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p5f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p5e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p5s);   }
                 	if (p==6) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p6f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p6e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p6s);   }
                 	if (p==7) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p7f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p7e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p7s);   }
                 	if (p==8) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p8f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p8e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p8s);   }
                 	if (p==9) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p9f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p9e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p9s);   }
                 	if (p==10) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p10f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p10e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p10s);   }
                 	if (p==11) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p11f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p11e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p11s);   }
                 	if (p==12) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p12f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p12e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p12s);   }
                 	if (p==13) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p13f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p13e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p13s);   }
                 	if (p==14) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p14f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p14e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p14s);   }
                 	if (p==15) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p15f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p15e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p15s);   }
                 	if (p==16) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p16f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p16e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p16s);   }
                 	if (p==17) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p17f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p17e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p17s);   }
                 	if (p==18) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p18f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p18e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p18s);   }
                 	if (p==19) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p19f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p19e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p19s);   }
                 	if (p==20) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p20f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p20e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p20s);   }
                 	if (p==21) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p21f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p21e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p21s);   }
                 	if (p==22) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p22f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p22e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p22s);   }
                 	if (p==23) {
                   	    spk1=MediaPlayer.create(this,R.raw.c1p23f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c1p23e);
        		    spk3=MediaPlayer.create(this,R.raw.c1p23s);   }
              }

                if (c==2) {
                	if (p==1) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p1f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p1e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p1s);   }
                	if (p==2) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p2f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p2e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p2s);   }
                	if (p==3) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p3f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p3e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p3s);   }
                	if (p==4) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p4f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p4e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p4s);   }
                	if (p==5) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p5f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p5e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p5s);   }
                	if (p==6) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p6f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p6e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p6s);   }
                	if (p==7) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p7f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p7e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p7s);   }
                	if (p==8) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p8f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p8e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p8s);   }
                	if (p==9) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p9f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p9e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p9s);   }
                	if (p==10) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p10f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p10e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p10s);   }
                	if (p==11) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p11f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p11e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p11s);   }
                	if (p==12) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p12f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p12e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p12s);   }
                	if (p==13) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p13f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p13e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p13s);   }
                	if (p==14) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p14f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p14e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p14s);   }
                	if (p==15) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p15f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p15e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p15s);   }
                	if (p==16) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p16f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p16e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p16s);   }
                	if (p==17) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p17f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p17e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p17s);   }
                	if (p==18) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p18f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p18e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p18s);   }
                	if (p==19) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p19f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p19e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p19s);   }
                	if (p==20) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p20f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p20e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p20s);   }
                	if (p==21) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p21f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p21e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p21s);   }
                	if (p==22) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p22f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p22e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p22s);   }
                	if (p==23) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p23f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p23e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p23s);   }
                	if (p==24) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p24f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p24e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p24s);   }
                	if (p==25) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p25f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p25e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p25s);   }
                	if (p==26) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p26f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p26e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p26s);   }
                	if (p==27) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p27f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p27e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p27s);   }
                	if (p==28) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p28f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p28e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p28s);   }
                	if (p==29) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p29f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p29e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p29s);   }
                	if (p==30) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p30f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p30e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p30s);   }
                	if (p==31) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p31f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p31e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p31s);   }
                	if (p==32) {
                   	    spk1=MediaPlayer.create(this,R.raw.c2p32f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c2p32e);
        		    spk3=MediaPlayer.create(this,R.raw.c2p32s);   }

              }

                if (c==3) {
                	if (p==1) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p1f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p1e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p1s);   }
                	if (p==2) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p2f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p2e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p2s);   }
                	if (p==3) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p3f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p3e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p3s);   }
                	if (p==4) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p4f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p4e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p4s);   }
                	if (p==5) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p5f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p5e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p5s);   }
                	if (p==6) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p6f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p6e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p6s);   }
                	if (p==7) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p7f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p7e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p7s);   }
                	if (p==8) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p8f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p8e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p8s);   }
                	if (p==9) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p9f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p9e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p9s);   }
                	if (p==10) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p10f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p10e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p10s);   }
                	if (p==11) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p11f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p11e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p11s);   }
                	if (p==12) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p12f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p12e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p12s);   }
                	if (p==13) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p13f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p13e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p13s);   }
                	if (p==14) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p14f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p14e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p14s);   }
                	if (p==15) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p15f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p15e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p15s);   }
                	if (p==16) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p16f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p16e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p16s);   }
                	if (p==17) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p17f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p17e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p17s);   }
                	if (p==18) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p18f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p18e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p18s);   }
                	if (p==19) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p19f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p19e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p19s);   }
                	if (p==20) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p20f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p20e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p20s);   }
                	if (p==21) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p21f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p21e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p21s);   }
                	if (p==22) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p22f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p22e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p22s);   }
                	if (p==23) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p23f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p23e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p23s);   }
                	if (p==24) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p24f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p24e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p24s);   }
                	if (p==25) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p25f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p25e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p25s);   }
                	if (p==26) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p26f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p26e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p26s);   }
                	if (p==27) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p27f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p27e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p27s);   }
                	if (p==28) {
                   	    spk1=MediaPlayer.create(this,R.raw.c3p28f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c3p28e);
        		    spk3=MediaPlayer.create(this,R.raw.c3p28s);   }

              }

                if (c==4) {
                	if (p==1) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p1f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p1e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p1s);   }
                	if (p==2) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p2f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p2e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p2s);   }
                	if (p==3) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p3f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p3e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p3s);   }
                	if (p==4) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p4f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p4e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p4s);   }
                	if (p==5) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p5f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p5e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p5s);   }
                	if (p==6) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p6f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p6e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p6s);   }
                	if (p==7) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p7f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p7e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p7s);   }
                	if (p==8) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p8f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p8e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p8s);   }
                	if (p==9) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p9f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p9e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p9s);   }
                	if (p==10) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p10f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p10e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p10s);   }
                	if (p==11) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p11f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p11e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p11s);   }
                	if (p==12) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p12f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p12e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p12s);   }
                	if (p==13) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p13f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p13e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p13s);   }
                	if (p==14) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p14f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p14e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p14s);   }
                	if (p==15) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p15f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p15e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p15s);   }
                	if (p==16) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p16f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p16e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p16s);   }
                	if (p==17) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p17f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p17e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p17s);   }
                	if (p==18) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p18f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p18e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p18s);   }
                	if (p==19) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p19f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p19e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p19s);   }
                	if (p==20) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p20f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p20e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p20s);   }
                	if (p==21) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p21f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p21e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p21s);   }
                	if (p==22) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p22f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p22e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p22s);   }
                	if (p==23) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p23f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p23e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p23s);   }
                	if (p==24) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p24f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p24e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p24s);   }
                	if (p==25) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p25f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p25e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p25s);   }
                	if (p==26) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p26f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p26e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p26s);   }
                	if (p==27) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p27f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p27e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p27s);   }
                	if (p==28) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p28f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p28e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p28s);   }
                	if (p==29) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p29f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p29e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p29s);   }
                	if (p==30) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p30f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p30e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p30s);   }
                	if (p==31) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p31f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p31e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p31s);   }
                	if (p==32) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p32f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p32e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p32s);   }
                	if (p==33) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p33f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p33e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p33s);   }
                	if (p==34) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p34f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p34e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p34s);   }
                	if (p==35) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p35f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p35e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p35s);   }
                	if (p==36) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p36f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p36e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p36s);   }
                	if (p==37) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p37f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p37e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p37s);   }
                	if (p==38) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p38f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p38e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p38s);   }
                	if (p==39) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p39f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p39e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p39s);   }
                	if (p==40) {
                   	    spk1=MediaPlayer.create(this,R.raw.c4p40f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c4p40e);
        		    spk3=MediaPlayer.create(this,R.raw.c4p40s);   }

              }

                if (c==5) {
                	if (p==1) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p1f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p1e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p1s);   }
                	if (p==2) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p2f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p2e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p2s);   }
                	if (p==3) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p3f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p3e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p3s);   }
                	if (p==4) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p4f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p4e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p4s);   }
                	if (p==5) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p5f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p5e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p5s);   }
                	if (p==6) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p6f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p6e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p6s);   }
                	if (p==7) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p7f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p7e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p7s);   }
                	if (p==8) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p8f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p8e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p8s);   }
                	if (p==9) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p9f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p9e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p9s);   }
                	if (p==10) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p10f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p10e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p10s);   }
                	if (p==11) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p11f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p11e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p11s);   }
                	if (p==12) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p12f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p12e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p12s);   }
                	if (p==13) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p13f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p13e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p13s);   }
                	if (p==14) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p14f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p14e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p14s);   }
                	if (p==15) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p15f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p15e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p15s);   }
                	if (p==16) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p16f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p16e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p16s);   }
                	if (p==17) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p17f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p17e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p17s);   }
                	if (p==18) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p18f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p18e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p18s);   }
                	if (p==19) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p19f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p19e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p19s);   }
                	if (p==20) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p20f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p20e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p20s);   }
                	if (p==21) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p21f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p21e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p21s);   }
                	if (p==22) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p22f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p22e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p22s);   }
                	if (p==23) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p23f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p23e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p23s);   }
                	if (p==24) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p24f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p24e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p24s);   }
                	if (p==25) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p25f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p25e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p25s);   }
                	if (p==26) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p26f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p26e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p26s);   }
                	if (p==27) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p27f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p27e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p27s);   }
                	if (p==28) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p28f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p28e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p28s);   }
                	if (p==29) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p29f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p29e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p29s);   }
                	if (p==30) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p30f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p30e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p30s);   }
                	if (p==31) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p31f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p31e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p31s);   }
                	if (p==32) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p32f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p32e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p32s);   }
                	if (p==33) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p33f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p33e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p33s);   }
                	if (p==34) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p34f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p34e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p34s);   }
                	if (p==35) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p35f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p35e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p35s);   }
                	if (p==36) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p36f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p36e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p36s);   }
                	if (p==37) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p37f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p37e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p37s);   }
                	if (p==38) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p38f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p38e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p38s);   }
                	if (p==39) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p39f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p39e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p39s);   }
                	if (p==40) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p40f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p40e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p40s);   }
                	if (p==41) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p41f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p41e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p41s);   }
                	if (p==42) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p42f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p42e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p42s);   }
                	if (p==43) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p43f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p43e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p43s);   }
                	if (p==44) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p44f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p44e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p44s);   }
                	if (p==45) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p45f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p45e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p45s);   }
                	if (p==46) {
                   	    spk1=MediaPlayer.create(this,R.raw.c5p46f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c5p46e);
        		    spk3=MediaPlayer.create(this,R.raw.c5p46s);   }

              }

               if (c==6) {
                	if (p==1) {
                   	    spk1=MediaPlayer.create(this,R.raw.c6p1f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c6p1e);
        		    spk3=MediaPlayer.create(this,R.raw.c6p1s);   }
                	if (p==2) {
                   	    spk1=MediaPlayer.create(this,R.raw.c6p2f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c6p2e);
        		    spk3=MediaPlayer.create(this,R.raw.c6p2s);   }
  	    	        if (p==3) {
                   	    spk1=MediaPlayer.create(this,R.raw.c6p3f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c6p3e);
        		    spk3=MediaPlayer.create(this,R.raw.c6p3s);   }
                 	if (p==4) {
                   	    spk1=MediaPlayer.create(this,R.raw.c6p4f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c6p4e);
        		    spk3=MediaPlayer.create(this,R.raw.c6p4s);   }
                 	if (p==5) {
                   	    spk1=MediaPlayer.create(this,R.raw.c6p5f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c6p5e);
        		    spk3=MediaPlayer.create(this,R.raw.c6p5s);   }
                 	if (p==6) {
                   	    spk1=MediaPlayer.create(this,R.raw.c6p6f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c6p6e);
        		    spk3=MediaPlayer.create(this,R.raw.c6p6s);   }
                 	if (p==7) {
                   	    spk1=MediaPlayer.create(this,R.raw.c6p7f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c6p7e);
        		    spk3=MediaPlayer.create(this,R.raw.c6p7s);   }
                 	if (p==8) {
                   	    spk1=MediaPlayer.create(this,R.raw.c6p8f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c6p8e);
        		    spk3=MediaPlayer.create(this,R.raw.c6p8s);   }
                 	if (p==9) {
                   	    spk1=MediaPlayer.create(this,R.raw.c6p9f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c6p9e);
        		    spk3=MediaPlayer.create(this,R.raw.c6p9s);   }
                 	if (p==10) {
                   	    spk1=MediaPlayer.create(this,R.raw.c6p10f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c6p10e);
        		    spk3=MediaPlayer.create(this,R.raw.c6p10s);   }
                 	if (p==11) {
                   	    spk1=MediaPlayer.create(this,R.raw.c6p11f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c6p11e);
        		    spk3=MediaPlayer.create(this,R.raw.c6p11s);   }
              }

               if (c==7) {
                	if (p==1) {
                   	    spk1=MediaPlayer.create(this,R.raw.c7p1f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c7p1e);
        		    spk3=MediaPlayer.create(this,R.raw.c7p1s);   }
                	if (p==2) {
                   	    spk1=MediaPlayer.create(this,R.raw.c7p2f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c7p2e);
        		    spk3=MediaPlayer.create(this,R.raw.c7p2s);   }
  	    	        if (p==3) {
                   	    spk1=MediaPlayer.create(this,R.raw.c7p3f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c7p3e);
        		    spk3=MediaPlayer.create(this,R.raw.c7p3s);   }
                 	if (p==4) {
                   	    spk1=MediaPlayer.create(this,R.raw.c7p4f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c7p4e);
        		    spk3=MediaPlayer.create(this,R.raw.c7p4s);   }
                 	if (p==5) {
                   	    spk1=MediaPlayer.create(this,R.raw.c7p5f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c7p5e);
        		    spk3=MediaPlayer.create(this,R.raw.c7p5s);   }

              }

               if (c==8) {
                	if (p==1) {
                   	    spk1=MediaPlayer.create(this,R.raw.c8p1f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c8p1e);
        		    spk3=MediaPlayer.create(this,R.raw.c8p1s);   }
                	if (p==2) {
                   	    spk1=MediaPlayer.create(this,R.raw.c8p2f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c8p2e);
        		    spk3=MediaPlayer.create(this,R.raw.c8p2s);   }
  	    	        if (p==3) {
                   	    spk1=MediaPlayer.create(this,R.raw.c8p3f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c8p3e);
        		    spk3=MediaPlayer.create(this,R.raw.c8p3s);   }
                 	if (p==4) {
                   	    spk1=MediaPlayer.create(this,R.raw.c8p4f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c8p4e);
        		    spk3=MediaPlayer.create(this,R.raw.c8p4s);   }
                 	if (p==5) {
                   	    spk1=MediaPlayer.create(this,R.raw.c8p5f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c8p5e);
        		    spk3=MediaPlayer.create(this,R.raw.c8p5s);   }
                 	if (p==6) {
                   	    spk1=MediaPlayer.create(this,R.raw.c8p6f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c8p6e);
        		    spk3=MediaPlayer.create(this,R.raw.c8p6s);   }
                 	if (p==7) {
                   	    spk1=MediaPlayer.create(this,R.raw.c8p7f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c8p7e);
        		    spk3=MediaPlayer.create(this,R.raw.c8p7s);   }
                 	if (p==8) {
                   	    spk1=MediaPlayer.create(this,R.raw.c8p8f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c8p8e);
        		    spk3=MediaPlayer.create(this,R.raw.c8p8s);   }
                 	if (p==9) {
                   	    spk1=MediaPlayer.create(this,R.raw.c8p9f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c8p9e);
        		    spk3=MediaPlayer.create(this,R.raw.c8p9s);   }
                 	if (p==10) {
                   	    spk1=MediaPlayer.create(this,R.raw.c8p10f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c8p10e);
        		    spk3=MediaPlayer.create(this,R.raw.c8p10s);   }

              }

               if (c==9) {
                	if (p==1) {
                   	    spk1=MediaPlayer.create(this,R.raw.c9p1f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c9p1e);
        		    spk3=MediaPlayer.create(this,R.raw.c9p1s);   }
                	if (p==2) {
                   	    spk1=MediaPlayer.create(this,R.raw.c9p2f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c9p2e);
        		    spk3=MediaPlayer.create(this,R.raw.c9p2s);   }
  	    	        if (p==3) {
                   	    spk1=MediaPlayer.create(this,R.raw.c9p3f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c9p3e);
        		    spk3=MediaPlayer.create(this,R.raw.c9p3s);   }
                 	if (p==4) {
                   	    spk1=MediaPlayer.create(this,R.raw.c9p4f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c9p4e);
        		    spk3=MediaPlayer.create(this,R.raw.c9p4s);   }

              } 

               if (c==10) {
                	if (p==1) {
                   	    spk1=MediaPlayer.create(this,R.raw.c10p1f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c10p1e);
        		    spk3=MediaPlayer.create(this,R.raw.c10p1s);   }
                	if (p==2) {
                   	    spk1=MediaPlayer.create(this,R.raw.c10p2f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c10p2e);
        		    spk3=MediaPlayer.create(this,R.raw.c10p2s);   }
  	    	        if (p==3) {
                   	    spk1=MediaPlayer.create(this,R.raw.c10p3f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c10p3e);
        		    spk3=MediaPlayer.create(this,R.raw.c10p3s);   }
                 	if (p==4) {
                   	    spk1=MediaPlayer.create(this,R.raw.c10p4f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c10p4e);
        		    spk3=MediaPlayer.create(this,R.raw.c10p4s);   }
                 	if (p==5) {
                   	    spk1=MediaPlayer.create(this,R.raw.c10p5f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c10p5e);
        		    spk3=MediaPlayer.create(this,R.raw.c10p5s);   }

              }

               if (c==11) {
                	if (p==1) {
                   	    spk1=MediaPlayer.create(this,R.raw.c11p1f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c11p1e);
        		    spk3=MediaPlayer.create(this,R.raw.c11p1s);   }
                	if (p==2) {
                   	    spk1=MediaPlayer.create(this,R.raw.c11p2f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c11p2e);
        		    spk3=MediaPlayer.create(this,R.raw.c11p2s);   }
  	    	        if (p==3) {
                   	    spk1=MediaPlayer.create(this,R.raw.c11p3f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c11p3e);
        		    spk3=MediaPlayer.create(this,R.raw.c11p3s);   }
                 	if (p==4) {
                   	    spk1=MediaPlayer.create(this,R.raw.c11p4f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c11p4e);
        		    spk3=MediaPlayer.create(this,R.raw.c11p4s);   }

              }  

               if (c==12) {
                	if (p==1) {
                   	    spk1=MediaPlayer.create(this,R.raw.c12p1f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c12p1e);
        		    spk3=MediaPlayer.create(this,R.raw.c12p1s);   }
                	if (p==2) {
                   	    spk1=MediaPlayer.create(this,R.raw.c12p2f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c12p2e);
        		    spk3=MediaPlayer.create(this,R.raw.c12p2s);   }
  	    	        if (p==3) {
                   	    spk1=MediaPlayer.create(this,R.raw.c12p3f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c12p3e);
        		    spk3=MediaPlayer.create(this,R.raw.c12p3s);   }
                 	if (p==4) {
                   	    spk1=MediaPlayer.create(this,R.raw.c12p4f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c12p4e);
        		    spk3=MediaPlayer.create(this,R.raw.c12p4s);   }
                 	if (p==5) {
                   	    spk1=MediaPlayer.create(this,R.raw.c12p5f);
         	    	    spk2=MediaPlayer.create(this,R.raw.c12p5e);
        		    spk3=MediaPlayer.create(this,R.raw.c12p5s);   }

              }  
               
               if (c==13) {
               	if (p==1) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p1f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p1e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p1s);   }
               	if (p==2) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p2f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p2e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p2s);   }
               	if (p==3) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p3f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p3e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p3s);   }
               	if (p==4) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p4f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p4e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p4s);   }
               	if (p==5) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p5f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p5e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p5s);   }
               	if (p==6) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p6f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p6e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p6s);   }
               	if (p==7) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p7f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p7e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p7s);   }
               	if (p==8) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p8f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p8e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p8s);   }
               	if (p==9) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p9f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p9e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p9s);   }
               	if (p==10) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p10f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p10e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p10s);   }
               	if (p==11) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p11f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p11e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p11s);   }
               	if (p==12) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p12f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p12e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p12s);   }
               	if (p==13) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p13f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p13e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p13s);   }
               	if (p==14) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p14f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p14e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p14s);   }
               	if (p==15) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p15f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p15e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p15s);   }
               	if (p==16) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p16f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p16e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p16s);   }
               	if (p==17) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p17f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p17e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p17s);   }
               	if (p==18) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p18f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p18e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p18s);   }
               	if (p==19) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p19f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p19e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p19s);   }
               	if (p==20) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p20f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p20e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p20s);   }
               	if (p==21) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p21f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p21e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p21s);   }
               	if (p==22) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p22f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p22e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p22s);   }
               	if (p==23) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p23f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p23e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p23s);   }
               	if (p==24) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p24f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p24e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p24s);   }
               	if (p==25) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p25f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p25e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p25s);   }
               	if (p==26) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p26f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p26e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p26s);   }
               	if (p==27) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p27f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p27e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p27s);   }
               	if (p==28) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p28f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p28e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p28s);   }
               	if (p==29) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p29f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p29e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p29s);   }
               	if (p==30) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p30f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p30e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p30s);   }
               	if (p==31) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p31f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p31e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p31s);   }
               	if (p==32) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p32f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p32e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p32s);   }
               	if (p==33) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p33f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p33e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p33s);   }
               	if (p==34) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p34f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p34e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p34s);   }
               	if (p==35) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p35f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p35e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p35s);   }
               	if (p==36) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p36f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p36e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p36s);   }
               	if (p==37) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p37f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p37e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p37s);   }
               	if (p==38) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p38f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p38e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p38s);   }
               	if (p==39) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p39f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p39e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p39s);   }
               	if (p==40) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p40f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p40e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p40s);   }
               	if (p==41) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p41f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p41e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p41s);   }
               	if (p==42) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p42f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p42e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p42s);   }
               	if (p==43) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p43f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p43e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p43s);   }
               	if (p==44) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p44f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p44e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p44s);   }
               	if (p==45) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p45f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p45e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p45s);   }
               	if (p==46) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p46f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p46e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p46s);   }
               	if (p==47) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p47f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p47e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p47s);   }
               	if (p==48) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p48f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p48e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p48s);   }
               	if (p==49) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p49f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p49e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p49s);   }
               	if (p==50) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p50f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p50e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p50s);   }
               	if (p==51) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p51f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p51e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p51s);   }
               	if (p==52) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p52f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p52e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p52s);   }
               	if (p==53) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p53f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p53e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p53s);   }
               	if (p==54) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p54f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p54e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p54s);   }
               	if (p==55) {
                  	    spk1=MediaPlayer.create(this,R.raw.c13p55f);
        	    	    spk2=MediaPlayer.create(this,R.raw.c13p55e);
       		    spk3=MediaPlayer.create(this,R.raw.c13p55s);   }

             }

             
			}
			
		}
			
		public void DetailRotate(View view) {
		 		   
			screenhv = getRequestedOrientation();
			  if(screenhv==1) {
			  setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
			   }
			  else {
			  setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
			   }
		}
		
		public void speakfr(View view) {
	 		
			spk1.start();
		}

		public void speaken(View view) {
	 		   
			spk2.start();
		}
		
		public void speaksp(View view) {
	 		
			spk3.start();
		}

		 @Override
		    protected void onDestroy() {
		        // TODO Auto-generated method stub
		        super.onDestroy();
		        if(spk1!=null){
		             spk1.stop();
		             spk1.release();
		             spk1 = null;
		        }
		        if(spk2!=null){
		             spk2.stop();
		             spk2.release();
		             spk2 = null;
		        }
		        if(spk3!=null){
		             spk3.stop();
		             spk3.release();
		             spk3 = null;
		        }	        
		 }
 		  
 	   }
 	    

