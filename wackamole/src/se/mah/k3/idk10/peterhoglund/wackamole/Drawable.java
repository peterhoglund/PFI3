package se.mah.k3.idk10.peterhoglund.wackamole;

import android.graphics.Canvas;
import android.view.MotionEvent;

public interface Drawable {
	
	void update();
	void draw (Canvas c);
	boolean pressed(MotionEvent m);
}