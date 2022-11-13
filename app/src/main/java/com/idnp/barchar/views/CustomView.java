package com.idnp.barchar.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {

    private static final int SQUARE_SIZE = 100;

    public CustomView(Context context) {
        super(context);

        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void init(@Nullable AttributeSet set){

    }

    @Override
    protected void onDraw(Canvas canvas) {
        Rect rect = new Rect();
        rect.left = 10;
        rect.top = 10;
        rect.right = rect.left + SQUARE_SIZE;
        rect.bottom = rect.top + SQUARE_SIZE;

        Paint paint = new Paint();
        paint.setColor(Color.GREEN);

        canvas.drawRect(rect, paint);
    }
}
