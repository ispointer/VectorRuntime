package com.aantik.vecruntime;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.aantik.vtruntime.Antik;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mImage = findViewById(R.id.mImage);

        /**
         *
         * @Aantik_Mods wrapper
         *
         *     @ColorInt public static final int BLACK       = 0xFF000000;
         *     @ColorInt public static final int DKGRAY      = 0xFF444444;
         *     @ColorInt public static final int GRAY        = 0xFF888888;
         *     @ColorInt public static final int LTGRAY      = 0xFFCCCCCC;
         *     @ColorInt public static final int WHITE       = 0xFFFFFFFF;
         *     @ColorInt public static final int RED         = 0xFFFF0000;
         *     @ColorInt public static final int GREEN       = 0xFF00FF00;
         *     @ColorInt public static final int BLUE        = 0xFF0000FF;
         *     @ColorInt public static final int YELLOW      = 0xFFFFFF00;
         *     @ColorInt public static final int CYAN        = 0xFF00FFFF;
         *     @ColorInt public static final int MAGENTA     = 0xFFFF00FF;
         *     @ColorInt public static final int TRANSPARENT = 0;
         */

        Antik antik = Antik.load(this, R.drawable.user);

        antik.setPathColor(0, Color.BLACK);

        antik.into(mImage);


     /*   Antik mAntik = Antik.load(this, R.drawable.user);
        Random random = new Random();

        new Thread(new Runnable() {
            @Override
            public void run() {

                for ( ; ; ) {


                    int[][] mColors = {
                            {
                                255, 0, 0
                            },
                            {
                                0, 255, 0
                            },
                            {
                                0, 0, 255
                            },
                            {
                                255, 255, 0
                            },
                            {
                                255, 0, 255
                            }
                    };

                    int[] mRgb = mColors[random.nextInt(mColors.length)];

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mAntik.setPathColor(0, Color.rgb(mRgb[0], mRgb[1], mRgb[2]));
                            mAntik.into(mImage);
                        }
                    });

                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        break;
                    } finally {
                        Log.d("Antik", "run : " + "called ~!");
                    }
                }
            }
        }).start();*/
    }
}