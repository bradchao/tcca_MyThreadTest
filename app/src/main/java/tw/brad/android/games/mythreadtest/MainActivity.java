package tw.brad.android.games.mythreadtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private  MyThread mt1, mt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test1(View v){
        mt1 = new MyThread("A");
        mt2 = new MyThread("B");
        mt1.start();
        mt2.start();
    }
    public void test2(View v){
    }

    private class MyThread extends Thread {
        String name;
        MyThread(String name){this.name = name;}
        @Override
        public void run() {
            for (int i=0; i<20; i++){
                Log.i("brad", name + " = " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }
            }
        }
    }



}
