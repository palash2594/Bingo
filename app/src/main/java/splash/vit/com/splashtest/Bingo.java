package splash.vit.com.splashtest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by palash on 3/7/2015.
 */
public class Bingo extends ActionBarActivity {

    static int counter = 1;
    static int check = 0;
    static int loop[] = new int[12];
    static int flag[][] = new int[25][2];


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bingo);
        final Button b1 = (Button) findViewById(R.id.b1);
        final Button b2 = (Button) findViewById(R.id.b2);
        final Button b3 = (Button) findViewById(R.id.b3);
        final Button b4 = (Button) findViewById(R.id.b4);
        final Button b5 = (Button) findViewById(R.id.b5);
        final Button b6 = (Button) findViewById(R.id.b6);
        final Button b7 = (Button) findViewById(R.id.b7);
        final Button b8 = (Button) findViewById(R.id.b8);
        final Button b9 = (Button) findViewById(R.id.b9);
        final Button b10 = (Button) findViewById(R.id.b10);
        final Button b11 = (Button) findViewById(R.id.b11);
        final Button b12 = (Button) findViewById(R.id.b12);
        final Button b13 = (Button) findViewById(R.id.b13);
        final Button b14 = (Button) findViewById(R.id.b14);
        final Button b15 = (Button) findViewById(R.id.b15);
        final Button b16 = (Button) findViewById(R.id.b16);
        final Button b17 = (Button) findViewById(R.id.b17);
        final Button b18 = (Button) findViewById(R.id.b18);
        final Button b19 = (Button) findViewById(R.id.b19);
        final Button b20 = (Button) findViewById(R.id.b20);
        final Button b21 = (Button) findViewById(R.id.b21);
        final Button b22 = (Button) findViewById(R.id.b22);
        final Button b23 = (Button) findViewById(R.id.b23);
        final Button b24 = (Button) findViewById(R.id.b24);
        final Button b25 = (Button) findViewById(R.id.b25);
        final Button breset = (Button) findViewById(R.id.breset);
        // final TextView[] t = new TextView[5];
        final TextView t0 = (TextView) findViewById(R.id.t1);
        final TextView t1 = (TextView) findViewById(R.id.t2);
        final TextView t2 = (TextView) findViewById(R.id.t3);
        final TextView t3 = (TextView) findViewById(R.id.t4);
        final TextView t4 = (TextView) findViewById(R.id.t5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[0][0]==0) {
                    b1.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b1.setText(count);
                    counter++;
                    flag[0][0]++;

                }
                else if(flag[0][0]==1){
                    b1.setBackgroundColor(Color.GREEN);
                    flag[0][0]++;
                    flag[0][1]=1;
                    int ch=0;
                     ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[0][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[1][0]==0) {
                    b2.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b2.setText(count);
                    counter++;
                    flag[1][0]++;

                }
                else if(flag[1][0]==1){
                    b2.setBackgroundColor(Color.GREEN);
                    flag[1][0]++;
                    flag[1][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[1][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[2][0]==0) {
                    b3.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b3.setText(count);
                    counter++;
                    flag[2][0]++;

                }
                else if(flag[2][0]==1){
                    b3.setBackgroundColor(Color.GREEN);
                    flag[2][0]++;
                    flag[2][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);

                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[2][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }

        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[3][0]==0) {
                    b4.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b4.setText(count);
                    counter++;
                    flag[3][0]++;

                }
                else if(flag[3][0]==1){
                    b4.setBackgroundColor(Color.GREEN);
                    flag[3][0]++;
                    flag[3][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);

                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[3][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[4][0]==0) {
                    b5.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b5.setText(count);
                    counter++;
                    flag[4][0]++;

                }
                else if(flag[4][0]==1){
                    b5.setBackgroundColor(Color.GREEN);
                    flag[4][0]++;
                    flag[4][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[4][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[5][0]==0) {
                    b6.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b6.setText(count);
                    counter++;
                    flag[5][0]++;

                }
                else if(flag[5][0]==1){
                    b6.setBackgroundColor(Color.GREEN);
                    flag[5][0]++;
                    flag[5][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[5][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[6][0]==0) {
                    b7.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b7.setText(count);
                    counter++;
                    flag[6][0]++;

                }
                else if(flag[6][0]==1){
                    b7.setBackgroundColor(Color.GREEN);
                    flag[6][0]++;
                    flag[6][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[6][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[7][0]==0) {
                    b8.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b8.setText(count);
                    counter++;
                    flag[7][0]++;

                }
                else if(flag[7][0]==1){
                    b8.setBackgroundColor(Color.GREEN);
                    flag[7][0]++;
                    flag[7][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[7][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[8][0]==0) {
                    b9.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b9.setText(count);
                    counter++;
                    flag[8][0]++;

                }
                else if(flag[8][0]==1){
                    b9.setBackgroundColor(Color.GREEN);
                    flag[8][0]++;
                    flag[8][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[8][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });


        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[9][0]==0) {
                    b10.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b10.setText(count);
                    counter++;
                    flag[9][0]++;

                }
                else if(flag[9][0]==1){
                    b10.setBackgroundColor(Color.GREEN);
                    flag[9][0]++;
                    flag[9][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[9][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[10][0]==0) {
                    b11.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b11.setText(count);
                    counter++;
                    flag[10][0]++;

                }
                else if(flag[10][0]==1){
                    b11.setBackgroundColor(Color.GREEN);
                    flag[10][0]++;
                    flag[10][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[10][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[11][0]==0) {
                    b12.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b12.setText(count);
                    counter++;
                    flag[11][0]++;

                }
                else if(flag[11][0]==1){
                    b12.setBackgroundColor(Color.GREEN);
                    flag[11][0]++;
                    flag[11][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[11][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[12][0]==0) {
                    b13.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b13.setText(count);
                    counter++;
                    flag[12][0]++;

                }
                else if(flag[12][0]==1){
                    b13.setBackgroundColor(Color.GREEN);
                    flag[12][0]++;
                    flag[12][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[12][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[13][0]==0) {
                    b14.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b14.setText(count);
                    counter++;
                    flag[13][0]++;

                }
                else if(flag[13][0]==1){
                    b14.setBackgroundColor(Color.GREEN);
                    flag[13][0]++;
                    flag[13][1]=1;
                    flag[12][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[13][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[14][0]==0) {
                    b15.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b15.setText(count);
                    counter++;
                    flag[14][0]++;

                }
                else if(flag[14][0]==1){
                    b15.setBackgroundColor(Color.GREEN);
                    flag[14][0]++;
                    flag[14][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[14][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[15][0]==0) {
                    b16.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b16.setText(count);
                    counter++;
                    flag[15][0]++;

                }
                else if(flag[15][0]==1){
                    b16.setBackgroundColor(Color.GREEN);
                    flag[15][0]++;
                    flag[15][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[15][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[16][0]==0) {
                    b17.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b17.setText(count);
                    counter++;
                    flag[16][0]++;

                }
                else if(flag[16][0]==1){
                    b17.setBackgroundColor(Color.GREEN);
                    flag[16][0]++;
                    flag[16][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[16][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[17][0]==0) {
                    b18.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b18.setText(count);
                    counter++;
                    flag[17][0]++;

                    }
                else if(flag[17][0]==1){
                    b18.setBackgroundColor(Color.GREEN);
                    flag[17][0]++;
                    flag[17][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[17][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[18][0]==0) {
                    b19.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b19.setText(count);
                    counter++;
                    flag[18][0]++;

                }
                else if(flag[18][0]==1){
                    b19.setBackgroundColor(Color.GREEN);
                    flag[18][0]++;
                    flag[18][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[18][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[19][0]==0) {
                    b20.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b20.setText(count);
                    counter++;
                    flag[19][0]++;

                }
                else if(flag[19][0]==1){
                    b20.setBackgroundColor(Color.GREEN);
                    flag[19][0]++;
                    flag[19][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[19][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[20][0]==0) {
                    b21.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b21.setText(count);
                    counter++;
                    flag[20][0]++;

                }
                else if(flag[20][0]==1){
                    b21.setBackgroundColor(Color.GREEN);
                    flag[20][0]++;
                    flag[20][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[20][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[21][0]==0) {
                    b22.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b22.setText(count);
                    counter++;
                    flag[21][0]++;

                }
                else if(flag[21][0]==1){
                    b22.setBackgroundColor(Color.GREEN);
                    flag[21][0]++;
                    flag[21][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[21][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[22][0]==0) {
                    b23.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b23.setText(count);
                    counter++;
                    flag[22][0]++;

                }
                else if(flag[22][0]==1){
                    b23.setBackgroundColor(Color.GREEN);
                    flag[22][0]++;
                    flag[22][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[22][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[23][0]==0) {
                    b24.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b24.setText(count);
                    counter++;
                    flag[23][0]++;

                }
                else if(flag[23][0]==1){
                    b24.setBackgroundColor(Color.GREEN);
                    flag[23][0]++;
                    flag[23][1]=1;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[23][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag[24][0]==0) {
                    b25.setBackgroundColor(Color.BLUE);
                    String count = Integer.toString(counter);
                    b25.setText(count);
                    counter++;
                    flag[24][0]++;

                }
                else if(flag[24][0]==1){
                    b25.setBackgroundColor(Color.GREEN);
                    flag[24][1]=1;
                    flag[24][0]++;
                    int ch=0;
                    ch = checker();
                    if(ch==1) {
                        t0.setTextColor(Color.GREEN);
                    }else if(ch==2){
                        t1.setTextColor(Color.GREEN);
                    }else if(ch==3){
                        t2.setTextColor(Color.GREEN);
                    }else if(ch==4){
                        t3.setTextColor(Color.GREEN);
                    }else if(ch==5){
                        t4.setTextColor(Color.GREEN);
                        Toast.makeText(getApplicationContext(), " U WIN!!!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else if (flag[24][0]==2){
                    Toast.makeText(getApplicationContext(), "Already set!!",
                            Toast.LENGTH_LONG).show();
                }
                if(counter>25){
                    counter=1;
                }
            }
        });

        breset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               for(int i=0;i<2;i++)
                   for(int j=0;j<25;j++){
                       flag[j][i]=0;
                   }
                for(int i=0;i<12;i++)
                    loop[i]=0;
                counter=1;
                b1.setBackgroundColor(Color.RED);
                b2.setBackgroundColor(Color.RED);
                b3.setBackgroundColor(Color.RED);
                b4.setBackgroundColor(Color.RED);
                b5.setBackgroundColor(Color.RED);
                b6.setBackgroundColor(Color.RED);
                b7.setBackgroundColor(Color.RED);
                b8.setBackgroundColor(Color.RED);
                b9.setBackgroundColor(Color.RED);
                b10.setBackgroundColor(Color.RED);
                b11.setBackgroundColor(Color.RED);
                b12.setBackgroundColor(Color.RED);
                b13.setBackgroundColor(Color.RED);
                b14.setBackgroundColor(Color.RED);
                b15.setBackgroundColor(Color.RED);
                b16.setBackgroundColor(Color.RED);
                b17.setBackgroundColor(Color.RED);
                b18.setBackgroundColor(Color.RED);
                b19.setBackgroundColor(Color.RED);
                b20.setBackgroundColor(Color.RED);
                b21.setBackgroundColor(Color.RED);
                b22.setBackgroundColor(Color.RED);
                b23.setBackgroundColor(Color.RED);
                b24.setBackgroundColor(Color.RED);
                b25.setBackgroundColor(Color.RED);

                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                b10.setText("");
                b11.setText("");
                b12.setText("");
                b13.setText("");
                b14.setText("");
                b15.setText("");
                b16.setText("");
                b17.setText("");
                b18.setText("");
                b19.setText("");
                b20.setText("");
                b21.setText("");
                b22.setText("");
                b23.setText("");
                b24.setText("");
                b25.setText("");

                t0.setTextColor(Color.RED);
                t1.setTextColor(Color.RED);
                t2.setTextColor(Color.RED);
                t3.setTextColor(Color.RED);
                t4.setTextColor(Color.RED);

                check=0;

            }
        });

    }

    public int checker(){


        if(flag[0][1]==1 && flag[1][1]==1 && flag[2][1]==1 && flag[3][1]==1 && flag[4][1]==1 && loop[0]==0){
            loop[0] = 1;
            check++;
        }

        if(flag[5][1]==1 && flag[6][1]==1 && flag[7][1]==1 && flag[8][1]==1 && flag[9][1]==1 && loop[1]==0){
            loop[1] = 1;
            check++;
        }
        if(flag[10][1]==1 && flag[11][1]==1 && flag[12][1]==1 && flag[13][1]==1 && flag[14][1]==1 && loop[2]==0){
            loop[2] = 1;
            check++;
        }
        if(flag[15][1]==1 && flag[16][1]==1 && flag[17][1]==1 && flag[18][1]==1 && flag[19][1]==1 && loop[3]==0){
            loop[3] = 1;
            check++;
        }
        if(flag[20][1]==1 && flag[21][1]==1 && flag[22][1]==1 && flag[23][1]==1 && flag[24][1]==1 && loop[4]==0){
            loop[4] = 1;
            check++;
        }
        if(flag[0][1]==1 && flag[5][1]==1 && flag[10][1]==1 && flag[15][1]==1 && flag[20][1]==1 && loop[5]==0){
            loop[5] = 1;
            check++;
        }
        if(flag[1][1]==1 && flag[6][1]==1 && flag[11][1]==1 && flag[16][1]==1 && flag[21][1]==1 && loop[6]==0){
            loop[6] = 1;
            check++;
        }
        if(flag[2][1]==1 && flag[7][1]==1 && flag[12][1]==1 && flag[17][1]==1 && flag[22][1]==1 && loop[7]==0){
            loop[7] = 1;
            check++;
        }
        if(flag[3][1]==1 && flag[8][1]==1 && flag[13][1]==1 && flag[18][1]==1 && flag[23][1]==1 && loop[8]==0){
            loop[8] = 1;
            check++;
        }
        if(flag[4][1]==1 && flag[9][1]==1 && flag[14][1]==1 && flag[19][1]==1 && flag[24][1]==1 && loop[9]==0){
            loop[9] = 1;
            check++;
        }
        if(flag[0][1]==1 && flag[6][1]==1 && flag[12][1]==1 && flag[18][1]==1 && flag[24][1]==1 && loop[10]==0){
            loop[10] = 1;
            check++;
        }
        if(flag[4][1]==1 && flag[8][1]==1 && flag[12][1]==1 && flag[16][1]==1 && flag[20][1]==1 && loop[11]==0){
            loop[11] = 1;
            check++;
        }

        return check;
    }
}