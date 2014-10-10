package cn.edu.gdmec.s07131034.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView mytv;
	
	public boolean onMenuItemSelected (int featureId,MenuItem item){
		switch(item.getItemId()){
		case R.id.item1:
			mytv.setText("you have select 'good' menu item!");
			break;
		case R.id.item2:
			mytv.setText("you have select 'good' menu item!");
			break;
		}
		return super.onMenuItemSelected(featureId, item);
	}
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mytv = (TextView) findViewById(R.id.item3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}


