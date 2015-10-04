package com.example.hasmath.test;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
public class MyAdapter extends ArrayAdapter<String>{

	ArrayList <String> countryItem;
	ArrayList <String> timeItem;
	private Activity context;
	int viewCount;
	int count=0;
	public MyAdapter(Activity context, ArrayList<String> country) {
		super(context, R.layout.row2, country);
		// TODO Auto-generated constructor stub
		this.context=context;
		this.countryItem=country;
		
		
		
	}
	
	
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		
		View view= convertView;
		
		
			 
			 LayoutInflater inflater= context.getLayoutInflater();
			 
			 
			 view= inflater.inflate(R.layout.row2, parent,false);
			 
			  
		 count=position;
			 
		 TextView country = (TextView)view.findViewById(R.id.textView1);
		 TextView time = (TextView)view.findViewById(R.id.textView2);
	
		
		 country.setText(countryItem.get(position));
		//  time.setText(timeItem.get(position));
		 
		 
		 
		 
		 
		/* view.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				     
				
				Toast.makeText(context, "item="+count, Toast.LENGTH_LONG).show();
			}
		});*/
		 
		 
		 
		 
		 
		
		return view;
	}

}
