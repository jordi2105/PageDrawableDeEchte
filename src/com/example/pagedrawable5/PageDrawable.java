package com.example.pagedrawable5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class PageDrawable extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		if (container == null) {
			return null;
		}
		return (LinearLayout) inflater.inflate(R.layout.pagedrawable_layout,
				container, false);

	}
	
	/*public void onClick(View v){
		
		switch(v.getId()){
		case R.id.ibTools:
			
			
			break;
		case R.id.ibBack:
		}
	}*/
	
	
	

}