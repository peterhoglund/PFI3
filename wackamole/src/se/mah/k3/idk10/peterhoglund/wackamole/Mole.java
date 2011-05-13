package se.mah.k3.idk10.peterhoglund.wackamole;

import java.util.Random;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;

public class Mole implements Drawable {
	
	private float _posX, _posY;
	private int alpha;
	private Paint _p;
	private float _radius = 20;
	private boolean alive = false;
	private	Random random = new Random();
	
	public  Mole(float posX, float posY){
		_posX = posX;
		_posY = posY;
		alpha = 0;
		_p = new Paint(Paint.ANTI_ALIAS_FLAG);
		_p.setARGB(255, 234, 231, 128);
		alive = false;
	}

	@Override
	public void update() {
		Log.i("k3", "askhfakfaksdjfhkajs");
		if (random.nextInt(100) > 95){
			Log.i("k3", "askhfakfaksdjfhkajsdhfskajdfhaksfhaksjd");
			alpha = 255;
			alive = true;
		}
	}

	@Override
	public void draw(Canvas c) {

		if (alpha > 0){
			alpha = alpha - 20;
		}
		else if (alpha <= 0){
			alpha = 0;
			alive = false;
		}
		if (alive){
			c.drawCircle(_posX, _posY, _radius, _p);
		}		
	}

	@Override
	public boolean pressed(MotionEvent m) {

		Log.i("k3", "Pressed");
		
		boolean hit = false;
		float dx = (_posX - m.getX());
		float dy = (_posY - m.getY());
		float dist = (float) Math.sqrt(dx * dx + dy * dy);
		
		if (dist < _radius) {
			alive = false;
			alpha = 0;
			hit = true;
		}
		return hit;
	}
}