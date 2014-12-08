package com.example.pagedrawable5;

import java.util.List;
import java.util.Vector;
import android.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Page extends ActionBarActivity {

	private PagerAdapter mPagerAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// requestWindowFeature(Window.FEATURE_NO_TITLE);
		// getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewpager_layout);
		getSupportActionBar().setTitle("\"Pagename here\"");
		getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.GREEN));
		initialisePaging();
	}

	// Hier worden de 2 fragmenten(de pagina en de notities) aan een lijst
	// toegevoegd
	private void initialisePaging() {
		// TODO Auto-generated method stub
		List<Fragment> fragments = new Vector<Fragment>();
		fragments.add(Fragment.instantiate(this, PageDrawable.class.getName()));
		fragments.add(Fragment.instantiate(this, Notes.class.getName()));
		mPagerAdapter = new PagerAdapter(this.getSupportFragmentManager(),
				fragments);

		ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
		pager.setAdapter(mPagerAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.action_bar_menu, menu);

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.button) {
			return true;
		}

		if (id == R.id.textbox) {
			return true;
		}
		return super.onOptionsItemSelected(item);

	}
}
