package test.com.test;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class Onlayout extends ViewGroup {
    public Onlayout(Context context) {
        super(context);
    }

    public Onlayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Onlayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getChildCount() > 0){
            View childView = getChildAt(0);
            measureChild(childView,widthMeasureSpec,heightMeasureSpec);
        }
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {
        if (getChildCount() > 0){
            View childView  = getChildAt(0);
          //  childView.layout(0,0,200,200);
            childView.layout(10,110,childView.getMeasuredWidth()+10,childView.getMeasuredHeight()+10);
        }
    }
}
