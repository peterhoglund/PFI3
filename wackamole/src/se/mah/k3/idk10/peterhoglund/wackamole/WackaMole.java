package se.mah.k3.idk10.peterhoglund.wackamole;

import android.app.Activity;
import android.os.Bundle;

public class WackaMole extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameEngine(this));
    }
    
}