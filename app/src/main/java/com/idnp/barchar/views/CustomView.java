package com.idnp.barchar.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomView extends View {

    private static final int SQUARE_SIZE_DEF = 200;
    private Rect mRectSquare;
    private Paint mPaintSquare;
    private double barWidth;
    private double barHeight;
    private double screenHeight;
    private double screenWidth;

    //double [] datos = {5, 10, 2.5, 5, 8.2, 10, 6.1, 4.7, 6, 10,1.5,9,0.1};
    //11 datos
    ArrayList<Double> datos;

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

        mRectSquare = new Rect();
        mPaintSquare = new Paint(Paint.ANTI_ALIAS_FLAG);
        datos = new ArrayList<>();

        /*
        if(set == null)
            return;

        TypedArray ta = getContext().obtainStyledAttributes(set, R.styleable.CustomView);

        mSquareSize = ta.getDimensionPixelSize(R.styleable.CustomView_bar_size, SQUARE_SIZE_DEF);

        ta.recycle();
        */
    }

    @Override
    protected void onDraw(Canvas canvas) {

        mPaintSquare.setColor(Color.GREEN);


        int totalValues = datos.size();
        double maxValue = findMaxValue();
        barWidth = (getWidth()*0.9)/(totalValues+1);
        double spacing = barWidth/totalValues;
        screenHeight = getHeight();
        screenWidth = getWidth()*0.9;

        int x = 50;
        int y = (int) screenHeight-50;

        for(int i = 0; i < totalValues; i++ ){
            mRectSquare.left = x;
            mRectSquare.top = y;
            mRectSquare.right = (int)(mRectSquare.left + barWidth);
            barHeight = -((datos.get(i) * screenHeight) / maxValue);
            mRectSquare.bottom = (int) (mRectSquare.top + barHeight);
            canvas.drawRect(mRectSquare, mPaintSquare);
            x += barWidth + spacing;
        }
    }

    protected double findMaxValue(){
        double maxValue=0;
        for(int i = 0; i < datos.size(); i++)
            maxValue = (maxValue < datos.get(i)) ? datos.get(i) : maxValue;

        return maxValue;
    }

    public void addData(double value){
        datos.add(value);
    }
}
