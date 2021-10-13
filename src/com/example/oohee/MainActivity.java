package com.example.oohee;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.example.oohee.R;
import com.example.oohee.MainActivity;

import android.text.Html;
import android.view.KeyEvent;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ImageButton;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
 
public class MainActivity extends Activity {
   
	 ExpandableListAdapter listAdapter;
	    ExpandableListView expListView;
	    List<String> listDataHeader;
	    HashMap<String, List<String>> listDataChild;
	    String lang = "f";  
	    Toast toast;
	 
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setVolumeControlStream(AudioManager.STREAM_MUSIC);
	        setContentView(R.layout.activity_main);
	 
	        listDataHeader = new ArrayList<String>();
	        listDataChild = new HashMap<String, List<String>>();

	        expListView = (ExpandableListView) findViewById(R.id.lvExp);
	        
	        PrepareListData(1);
	        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
	        expListView.setAdapter(listAdapter);
	        
	        
	        expListView.setOnGroupClickListener(new OnGroupClickListener() {

	            @Override
	            public boolean onGroupClick(ExpandableListView parent, View v,
	                    int groupPosition, long id) {
	                // Toast.makeText(getApplicationContext(),
	                // "Group Clicked " + listDataHeader.get(groupPosition),
	                // Toast.LENGTH_SHORT).show();
	                return false;
	            }
	        });

	         expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

	            @Override
	            public void onGroupExpand(int groupPosition) {
	        /*        Toast.makeText(getApplicationContext(),
	                        listDataHeader.get(groupPosition) + " Expanded",
	                        Toast.LENGTH_SHORT).show(); */
	            }
	        });

	        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

	            @Override
	            public void onGroupCollapse(int groupPosition) {
	              /*  Toast.makeText(getApplicationContext(),
	                        listDataHeader.get(groupPosition) + " Collapsed",
	                        Toast.LENGTH_SHORT).show(); */

	            }
	        });

	        
	        
	         expListView.setOnChildClickListener(new OnChildClickListener() {

	            @Override
	            public boolean onChildClick(ExpandableListView parent, View v,
	                    int groupPosition, int childPosition, long id) {
          
	                // TODO Auto-generated method stub
	       /*         Toast.makeText(
	                        getApplicationContext(),
	                        listDataHeader.get(groupPosition)
	                                + " : "
	                                + listDataChild.get(
	                                        listDataHeader.get(groupPosition)).get(
	                                        childPosition), Toast.LENGTH_SHORT)
	                        .show();  */
	            	
	            	// Inflate the Layout
	            	// LayoutInflater inflater = getLayoutInflater();
	            	// View layout = inflater.inflate(R.layout.custom_toast,
	            	//        (ViewGroup) findViewById(R.id.custom_toast_layout_id));
	                
	                
	                String childText = listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition);
	                
	                String f = "";
	                String e = "";
	                String s = "";
	                String tv1txt = "";
	                String tv2txt = "";
	                String tv3txt = "";
	                
                    int i = childText.indexOf(":");
                    tv1txt = childText.substring(0, i);
	                childText = childText.substring(i+1, childText.length());
		            i = childText.indexOf("/");
		            tv2txt = childText.substring(0, i);
		            tv3txt = childText.substring(i+1, childText.length());
	                
	                if (lang=="f")  {
		                f = tv1txt;
		                e = tv2txt;
		                s = tv3txt;
	                }
	                
	                if (lang=="e")  {
		                e = tv1txt;
		                f = tv2txt;
		                s = tv3txt;        		
	                }

	                if (lang=="s")  {
		                s = tv1txt;
		                f = tv2txt;
		                e = tv3txt;
	                }

	                // TextView tv1 = (TextView) layout.findViewById(R.id.textView1);
	                // tv1.setText(Html.fromHtml("<b>" + f + "</b>"));
	                	  
	                // TextView tv2 = (TextView) layout.findViewById(R.id.textView2);
	                // tv2.setText(Html.fromHtml("<b>" + e + "</b>"));
	     
	                // TextView tv3 = (TextView) layout.findViewById(R.id.textView3);
	                // tv3.setText(Html.fromHtml("<b>" + s + "</b>"));

	                // Create Custom Toast  
	                // toast = new Toast(getApplicationContext());	
	                // toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
	                // toast.setDuration(Toast.LENGTH_LONG);
	            	// toast.setView(layout);
	                // toast.show();  
	                
	                StartDetail(f, e, s, groupPosition, childPosition);

	                return false;
	            }
	            
	            
	        });
	    }
	    
	    
public void PrepareListData(int data) {
	    	
	    String f;  
	    String e;  
	    String s; 
	    String value;
	    int id;
	    int idf;
	    int ide;
	    int ids;
	    List<String> cat;
	    int t = 0;

 	    if (data ==1)  {
	    // French 
 	    lang = "f";
 	    for (Integer i=1; i<14; i++) {
 	    	id = getResources().getIdentifier("c"+i.toString()+"f", "string", getPackageName());
 	    	value = id == 0 ? "" : (String) getResources().getText(id);
 	    	listDataHeader.add(value);
  	    	
 		    // Adding child data
 		    cat = new ArrayList<String>();

 		    switch(i)
            {
                case 1:
           		  	t = 23;
           		  	break;
                case 2:
           		  	t = 32;
          		  	break;
               case 3:
          		  	t = 28;
          		  	break;
               case 4:
          		  	t = 40;
          		  	break;
               case 5:
          		  	t = 46;
          		  	break;
               case 6:
          		  	t = 11;
          		  	break;
               case 7:
          		  	t = 5;
          		  	break;
               case 8:
          		  	t = 10;
          		  	break;
               case 9:
          		  	t = 4;
          		  	break;
               case 10:
         		  	t = 5;
         		  	break;
               case 11:
          		  	t = 4;
          		  	break;
               case 12:
          		  	t = 5;
          		  	break;
               case 13:
          		  	t = 55;
          		  	break;
               }
 		    
 		    for (Integer j=1; j<t+1; j++) {
 	 	    	idf = getResources().getIdentifier("c"+i.toString()+"p"+j.toString()+"f", "string", getPackageName());
 	 	    	f = idf == 0 ? "" : (String) getResources().getText(idf);
 	 	    	ide = getResources().getIdentifier("c"+i.toString()+"p"+j.toString()+"e", "string", getPackageName());
 	 	    	e = ide == 0 ? "" : (String) getResources().getText(ide);
 	 	    	ids = getResources().getIdentifier("c"+i.toString()+"p"+j.toString()+"s", "string", getPackageName());
 	 	    	s = ids == 0 ? "" : (String) getResources().getText(ids); 	 		    
 	 	    	cat.add(f + ":" + e + " / " + s); 
 		    	}
 		    
 		    listDataChild.put(listDataHeader.get(i-1), cat); 
 		    
 	    	}
 	    }
	    
	    if (data ==2)  {
		    // English
	 	    lang = "e";
	 	    for (Integer i=1; i<14; i++) {
	 	    	id = getResources().getIdentifier("c"+i.toString()+"e", "string", getPackageName());
	 	    	value = id == 0 ? "" : (String) getResources().getText(id);
	 	    	listDataHeader.add(value);
	  	    	
	 		    // Adding child data
	 		    cat = new ArrayList<String>();

	 		    switch(i)
	            {
                case 1:
           		  	t = 23;
           		  	break;
                case 2:
           		  	t = 32;
          		  	break;
               case 3:
          		  	t = 28;
          		  	break;
               case 4:
          		  	t = 40;
          		  	break;
               case 5:
          		  	t = 46;
          		  	break;
               case 6:
          		  	t = 11;
          		  	break;
               case 7:
          		  	t = 5;
          		  	break;
               case 8:
          		  	t = 10;
          		  	break;
               case 9:
          		  	t = 4;
          		  	break;
               case 10:
         		  	t = 5;
         		  	break;
               case 11:
          		  	t = 4;
          		  	break;
               case 12:
          		  	t = 5;
          		  	break;
               case 13:
          		  	t = 55;
          		  	break;
	               }
	 		    
	 		    for (Integer j=1; j<t+1; j++) {
	 	 	    	idf = getResources().getIdentifier("c"+i.toString()+"p"+j.toString()+"f", "string", getPackageName());
	 	 	    	f = idf == 0 ? "" : (String) getResources().getText(idf);
	 	 	    	ide = getResources().getIdentifier("c"+i.toString()+"p"+j.toString()+"e", "string", getPackageName());
	 	 	    	e = ide == 0 ? "" : (String) getResources().getText(ide);
	 	 	    	ids = getResources().getIdentifier("c"+i.toString()+"p"+j.toString()+"s", "string", getPackageName());
	 	 	    	s = ids == 0 ? "" : (String) getResources().getText(ids); 	 		    
	 	 	    	cat.add(e + ":" + f + " / " + s); 
	 		    	}
	 		    
	 		    listDataChild.put(listDataHeader.get(i-1), cat); 
	 		    
	 	    	}
	 	    }
	    
	    if (data ==3)  {
		    // Spanish
	 	    lang = "s";
	 	    for (Integer i=1; i<14; i++) {
	 	    	id = getResources().getIdentifier("c"+i.toString()+"s", "string", getPackageName());
	 	    	value = id == 0 ? "" : (String) getResources().getText(id);
	 	    	listDataHeader.add(value);
	  	    	
	 		    // Adding child data
	 		    cat = new ArrayList<String>();

	 		    switch(i)
	            {
                case 1:
           		  	t = 23;
           		  	break;
                case 2:
           		  	t = 32;
          		  	break;
               case 3:
          		  	t = 28;
          		  	break;
               case 4:
          		  	t = 40;
          		  	break;
               case 5:
          		  	t = 46;
          		  	break;
               case 6:
          		  	t = 11;
          		  	break;
               case 7:
          		  	t = 5;
          		  	break;
               case 8:
          		  	t = 10;
          		  	break;
               case 9:
          		  	t = 4;
          		  	break;
               case 10:
         		  	t = 5;
         		  	break;
               case 11:
          		  	t = 4;
          		  	break;
               case 12:
          		  	t = 5;
          		  	break;
               case 13:
          		  	t = 55;
          		  	break;
	               }
	 		    
	 		    for (Integer j=1; j<t+1; j++) {
	 	 	    	idf = getResources().getIdentifier("c"+i.toString()+"p"+j.toString()+"f", "string", getPackageName());
	 	 	    	f = idf == 0 ? "" : (String) getResources().getText(idf);
	 	 	    	ide = getResources().getIdentifier("c"+i.toString()+"p"+j.toString()+"e", "string", getPackageName());
	 	 	    	e = ide == 0 ? "" : (String) getResources().getText(ide);
	 	 	    	ids = getResources().getIdentifier("c"+i.toString()+"p"+j.toString()+"s", "string", getPackageName());
	 	 	    	s = ids == 0 ? "" : (String) getResources().getText(ids); 	 		    
	 	 	    	cat.add(s + ":" + f + " / " + e); 
	 		    	}
	 		    
	 		    listDataChild.put(listDataHeader.get(i-1), cat); 
	 		    
	 	    	}
	 	    }
}
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ( keyCode == KeyEvent.KEYCODE_MENU ) {
        	StartInfo();
        	}
       /* 	Toast.makeText(MainActivity.this, "Menu activé",Toast.LENGTH_LONG).show();   */
        return super.onKeyDown(keyCode, event);
    }
    
    public void onBackPressed() {
    	
            if(toast!=null&&toast.getView().getWindowToken()!=null) {
            	toast.cancel();
            } else {
                //other stuff...
                super.onBackPressed();
            }
    }
    
        
public void StartInfo() {
    	
 	final Context context = this;
    Intent intent = new Intent(context, InfoActivity.class);
    startActivity(intent);
    overridePendingTransition(R.layout.right_slide_in, R.layout.right_slide_out);
    		
      }

public void StartDetail(String txt1, String txt2, String txt3, int c, int p) {
	
 	final Context context = this;
    Intent intent = new Intent(context, DetailActivity.class);
    intent.putExtra("txt1",txt1);
    intent.putExtra("txt2",txt2);
    intent.putExtra("txt3",txt3);
    c=c+1;
    p=p+1;
    intent.putExtra("c",c);
    intent.putExtra("p",p);
  startActivity(intent);
    
      }

/*
 * French
 */
public void StartFrench(View view) {
	
	listDataHeader = null;
	listDataChild = null;
	listAdapter = null;

    listDataHeader = new ArrayList<String>();
    listDataChild = new HashMap<String, List<String>>();

    expListView = (ExpandableListView) findViewById(R.id.lvExp);
	
    PrepareListData(1);
    
    listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

    expListView.setAdapter(listAdapter);
    
      }

/*
 * English
 */
public void StartEnglish(View view) {
	
	listDataHeader = null;
	listDataChild = null;
	listAdapter = null;

    listDataHeader = new ArrayList<String>();
    listDataChild = new HashMap<String, List<String>>();

    expListView = (ExpandableListView) findViewById(R.id.lvExp);
	
    PrepareListData(2);
    
    listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

    expListView.setAdapter(listAdapter);
    		
      }

/*
 * Spanish 
 */
public void StartSpanish(View view) {
	
	listDataHeader = null;
	listDataChild = null;
	listAdapter = null;

    listDataHeader = new ArrayList<String>();
    listDataChild = new HashMap<String, List<String>>();

    expListView = (ExpandableListView) findViewById(R.id.lvExp);
	
    PrepareListData(3);
    
    listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

    expListView.setAdapter(listAdapter);
    
      }

}

