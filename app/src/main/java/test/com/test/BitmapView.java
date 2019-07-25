package test.com.test;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class BitmapView extends View {
    public BitmapView(Context context) {
        super(context);
    }

    public BitmapView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BitmapView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
        canvas.drawBitmap(bitmap,400,400,null);


        Matrix matrix = new Matrix();
        matrix.postTranslate(10,10);
        matrix.postScale(2,2);
        canvas.drawBitmap(bitmap,matrix,null);
    }
}
