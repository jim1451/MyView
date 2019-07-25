package test.com.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class PointView extends View {
    public PointView(Context context) {
        super(context);
    }

    public PointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);

        /**
         * FILL   填满但是不描边
         * STROKE   描边
         * FILL_AND_STROKE   全部填满
         */

        paint.setStyle(Paint.Style.FILL_AND_STROKE);


        paint.setAntiAlias(true);//抗锯齿
        paint.setStrokeWidth(11);
        float[]  ps = {100,100,200,200,400,500};


        canvas.drawPoints(ps,paint);
    }
}
