package test.com.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CourtView  extends View implements View.OnClickListener {
    private int  count = 0;
    public CourtView(Context context) {
        super(context);
        init();
    }



    public CourtView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CourtView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        this.setOnClickListener(CourtView.this);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        canvas.drawCircle(getMeasuredWidth()/2,getMeasuredHeight()/2,100,paint);

        String test = count+"";
        Rect  bunnds = new Rect();
        paint.setTextSize(50);
        paint.getTextBounds(test,0,test.length(),bunnds);
        canvas.drawText(test,getMeasuredWidth()/2 - bunnds.width()/2,getMeasuredHeight()/2 + bunnds.height()/2,paint);

    }

    @Override
    public void onClick(View view) {
            count++;
           // invalidate();   //在主线程中使用
            postInvalidate();  //可以在子线程中使用
    }
}
