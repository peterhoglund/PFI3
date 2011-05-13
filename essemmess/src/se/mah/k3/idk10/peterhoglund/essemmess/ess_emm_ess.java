package se.mah.k3.idk10.peterhoglund.essemmess;

import android.app.Activity;
import android.os.Bundle;
import android.text.*;
import android.view.*;
import android.widget.*;

public class ess_emm_ess extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        InputFilter filterMed = new InputFilter.LengthFilter(256); 
      	EditText medFilter = (EditText) findViewById(R.id.meddelandeTextView);
      	medFilter.setFilters(new InputFilter[]{filterMed});
      	
        InputFilter filterTag = new InputFilter.LengthFilter(32); 
      	EditText tagFilter = (EditText) findViewById(R.id.tagsTextView);
      	tagFilter.setFilters(new InputFilter[]{filterTag});      	
              	
        Button button = (Button) findViewById(R.id.knappSkicka);
        button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				
				EditText tagsTextView = (EditText) findViewById(R.id.tagsTextView);
				EditText meddelandeTextView = (EditText) findViewById(R.id.meddelandeTextView);
				
				Toast toast = Toast.makeText(ess_emm_ess.this, "Meddelande: " + meddelandeTextView.getText() + "\nTags: " + tagsTextView.getText(), Toast.LENGTH_SHORT);
				toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast.show();
				
				meddelandeTextView.setText("");
				tagsTextView.setText("");
			}
		});
        
    }
}

