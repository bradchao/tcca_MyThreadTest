package tw.brad.android.games.mythreadtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private  MyThread mt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test1(View v){
        mt1 = new MyThread();
        mt1.start();
    }
    public void test2(View v){
        mt1.run();
    }

    private class MyThread extends Thread {
        @Override
        public void run() {
            for (int i=0; i<20; i++){
                Log.i("brad", "i = " + i);
            }
        }
    }



}
