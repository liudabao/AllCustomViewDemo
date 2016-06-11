package com.example.administrator.allcustomviewdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Administrator on 2016/6/10.
 */
public class BasicView extends View{

    private Paint paint;
    private int alpha=0;
    private Canvas mCanvas;

    public BasicView(Context context) {
        this(context,null);
    }

    public BasicView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BasicView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);




    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
        int width=MeasureSpec.getSize(widthMeasureSpec);
        int widthMode=MeasureSpec.getMode(widthMeasureSpec);
        int height=MeasureSpec.getSize(heightMeasureSpec);
        int heightMode=MeasureSpec.getMode(heightMeasureSpec);
        if(widthMode==MeasureSpec.EXACTLY){

        }
        else if(widthMode==MeasureSpec.AT_MOST){

        }
        else if(widthMode==MeasureSpec.UNSPECIFIED){

        }
        Log.e("width: ", ""+width);
        Log.e("height: ", ""+height);
       // super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(width, height*2);
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom){
        super.onLayout(changed, left, top, right, bottom);
    }

    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.GRAY);
        drawPoint(canvas);
        drawLine(canvas);
        drawRect(canvas);
        drawOval(canvas);
        drawCircle(canvas);
        drawArc(canvas);
        drawPie(canvas);
        drawText(canvas);
        drawBitmap(canvas);
        drawSnap(canvas);
    }

    private void drawPoint(Canvas canvas){
        paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(10f);
        canvas.drawPoint(50, 50, paint);
        canvas.drawPoint(150, 50, paint);
        canvas.drawPoint(250, 50, paint);
        canvas.save();
    }

    private void drawLine(Canvas canvas){
        paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(10f);
        canvas.drawLine(50, 100, 80, 100, paint);
        canvas.save();
       // canvas.translate(getWidth()/2,getHeight()/2);
        //for(int i=0;i<=360;i+=10){
       //     canvas.drawLine(50, 300, 50, 350, paint);
       //     canvas.rotate(10);
      //  }
       // canvas.restore();
    }

    private void drawRect(Canvas canvas){
        paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        Rect rect=new Rect(50, 150, 400, 300);
        canvas.drawRect(rect, paint);

        RectF rectF=new RectF(50, 350, 400, 500);
        canvas.drawRoundRect(rectF, 20, 20, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10f);
        Rect rect2=new Rect(450, 150, 800, 300);
        canvas.drawRect(rect2, paint);
        RectF rectF2=new RectF(450, 350, 800, 500);
        canvas.drawRoundRect(rectF2, 20, 20, paint);
        canvas.save();
    }

    private void drawOval(Canvas canvas){
        paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        RectF rectF=new RectF(50, 550, 400, 800);
        canvas.drawOval(rectF, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20f);
        RectF rectF2=new RectF(450, 550, 800, 800);
        canvas.drawOval(rectF2, paint);
        canvas.save();
    }

    private void drawCircle(Canvas canvas){
        paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(200, 1000, 150, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20f);
        canvas.drawCircle(600, 1000, 150, paint);
        canvas.save();

        canvas.translate(100,100);
        canvas.drawCircle(600, 1000, 150, paint);

    }

    private void drawArc(Canvas canvas){
        paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        RectF rectF=new RectF(50,1300,400,1650);
        canvas.drawArc(rectF, 0, 270, true, paint);

        RectF rectF2=new RectF(450,1300,800,1650);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20f);
        canvas.drawArc(rectF2,0,270,false,paint);
        canvas.save();
    }

    private void drawPie(Canvas canvas){
        paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        RectF rectF=new RectF(300,1700,900,2300);
        canvas.drawArc(rectF, 0, 90, true, paint);
        paint.setColor(Color.RED);
        canvas.drawArc(rectF, 90,30, true, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF,120,80, true, paint);
        paint.setColor(Color.BLACK);
        canvas.drawArc(rectF,200,100, true, paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF, 300, 60, true, paint);
        canvas.save();
    }

    private void drawBitmap(Canvas canvas){
        paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        RectF rectF=new RectF(200, 2500, 450, 2750);
        Rect rect=new Rect(0,0, bitmap.getWidth(),bitmap.getHeight());
        canvas.drawBitmap(bitmap, rect, rectF, paint);

    }

    private void drawSnap(Canvas canvas){
        paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        Bitmap bg=Bitmap.createBitmap(200, 200, Bitmap.Config.ARGB_8888);
        mCanvas=new Canvas(bg);
        mCanvas.drawColor(Color.YELLOW);
        canvas.drawBitmap(bitmap, 450, 2500, paint);
        canvas.drawBitmap(bg,450, 2500, paint);
        canvas.save();
        mCanvas.save();

    }



    private void drawText(Canvas canvas){
        paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        paint.setTextSize(32);
        canvas.drawText("test draw text",200,2400,paint );
        canvas.save();

    }
}
