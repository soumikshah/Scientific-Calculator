package android.cs594.calculator;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,minus,equal,multiply,divide,point,del;
    double fact = 0;
    EditText textbox;
    double val1, val2;
    int total = 100;
    boolean add1,minus1,mul,div,equal1 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // disableSoftInputFromAppearing(textbox);
        b1 = (Button)findViewById(R.id.one);
        b2 = (Button)findViewById(R.id.two);
        b3 = (Button)findViewById(R.id.three);
        b4 = (Button)findViewById(R.id.four);
        b5 = (Button)findViewById(R.id.five);
        b6 = (Button)findViewById(R.id.six);
        b7 = (Button)findViewById(R.id.seven);
        b8 = (Button)findViewById(R.id.eight);
        b9 = (Button)findViewById(R.id.nine);
        b0 = (Button)findViewById(R.id.zero);
        del =(Button)findViewById(R.id.del);
        equal = (Button)findViewById(R.id.equal);
        add = (Button)findViewById(R.id.addition);
        minus = (Button)findViewById(R.id.minus);
        multiply = (Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);
        point=(Button)findViewById(R.id.point);
        textbox =(EditText)findViewById(R.id.screen);
        InputMethodManager im = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        im.hideSoftInputFromWindow(textbox.getWindowToken(), 0);
        final Intent intent = new Intent(MainActivity.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 textbox.setText(textbox.getText()+"1");
             }
         });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText(textbox.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText(textbox.getText()+"3");
            }
        });
        b4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText(textbox.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText(textbox.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText(textbox.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText(textbox.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText(textbox.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText(textbox.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText(textbox.getText()+"0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1= Integer.parseInt(textbox.getText() + "");
                add1 = true;
                textbox.setText(null);
                //startActivity(intent);

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(textbox.getText() + "");
                minus1 = true;
                textbox.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Integer.parseInt(textbox.getText() + "");
                mul = true;
                textbox.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               val1= Integer.parseInt(textbox.getText() + "");
                div=true;
                textbox.setText(null);
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText(textbox.getText()+".");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText(null);

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            val2 = Integer.parseInt(textbox.getText()+"");
                if(add1 == true){
                   textbox.setText(val1+val2+" ");

                    add1=false;
                }
                if(minus1==true){
                    textbox.setText(val1-val2+" ");
                    minus1=false;
                }
                if(mul==true){
                    textbox.setText(val1*val2+" ");
                    mul=false;
                }
                if(div==true){
                    textbox.setText(val1/val2+" ");
                    div=false;
                }
                if(Scientific.sin1==true){
                    textbox.setText(""+Math.sin(val2));
                    Scientific.sin1=false;

                }
                //textbox.setText(null);
                if(Scientific.tan1==true){
                    textbox.setText(""+Math.tan(val2));
                    Scientific.tan1=false;
                }
                if(Scientific.cos1==true){
                    textbox.setText(""+Math.cos(val2));
                    Scientific.cos1=false;
                }
                if(Scientific.log1==true){
                    textbox.setText(""+Math.log(val2));
                    Scientific.log1=false;
                }
                if(Scientific.ln1==true){
                    textbox.setText(""+Math.log10(val2));
                    Scientific.ln1=false;
                }
                if(Scientific.power1==true){
                    textbox.setText(""+Math.pow(val2,val2));
                    Scientific.power1=false;
                }
                if(Scientific.pie1==true){
                    textbox.setText(""+Math.PI);
                    Scientific.pie1=false;
                }
                if(Scientific.e1==true){
                    textbox.setText(""+Math.exp(val2));
                    Scientific.e1=false;
                }
                if(Scientific.percent1==true){
                    val1 = val2*100/total;
                    textbox.setText(""+val1);
                    Scientific.percent1=false;
                }
                if(Scientific.root1==true){
                    textbox.setText(" "+Math.sqrt(val2));
                    Scientific.root1=false;
                }
                if(Scientific.exclam1==true){
                    for(double i=val2-1; i>0; i--){
                        val2 = i * val2;

                        textbox.setText(" "+val2);
                    }
                    Scientific.exclam1=false;
                }
                if(Scientific.opening1==true){
                    textbox.setText("("+val2+")");
                    Scientific.opening1=false;
                }
                if(Scientific.closing1==true){
                    textbox.setText("("+val2+")");
                    Scientific.closing1=false;
                }
            }
        });
    }

    public static void disableSoftInputFromAppearing(EditText editText) {
        if (Build.VERSION.SDK_INT >= 11) {
            editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
            editText.setTextIsSelectable(true);
        } else {
            editText.setRawInputType(InputType.TYPE_NULL);
            editText.setFocusable(true);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void scientific(){
        Intent intent = new Intent(android.cs594.calculator.MainActivity.this,android.cs594.calculator.Scientific.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.change_activity:
                scientific();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }




        //return super.onOptionsItemSelected(item);
    }
}
