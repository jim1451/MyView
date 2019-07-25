package test.com.test;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;

public class CombineView extends FrameLayout implements View.OnClickListener {
    private TextView tv_text;
    private CheckBox cb_check;
    private String text;
    private boolean checked;

    public CombineView(@NonNull Context context) {
        super(context);
        innt();
    }

    public CombineView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        text = attrs.getAttributeValue("http://schemas.android.com/apk/res-auto", "text");
        checked = attrs.getAttributeBooleanValue("http://schemas.android.com/apk/res-auto", "checked", true);
        innt();
    }

    public CombineView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        innt();
    }
    private void innt(){
        View view = View.inflate(getContext(),R.layout.combine_layout,this);
        tv_text = view.findViewById(R.id.tv_text);
        cb_check = view.findViewById(R.id.cb_check);

        tv_text.setText(text);
        cb_check.setChecked(checked);

        this.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        cb_check.setChecked(!cb_check.isChecked());
    }
}
