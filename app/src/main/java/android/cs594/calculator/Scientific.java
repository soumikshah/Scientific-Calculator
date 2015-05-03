package android.cs594.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by soumik on 5/1/2015.
 */
public class Scientific extends ActionBarActivity {
   static Button sin, cos, tan, log, ln,pie,e,percent,exclam,root,power,opening,closing;
    double val3,val4;
    static boolean sin1,cos1,tan1,log1,ln1,power1,pie1,e1,percent1,root1,exclam1,opening1,closing1=false;
    String s;
    EditText textbox;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scientific);
        sin = (Button)findViewById(R.id.sin);
        cos = (Button)findViewById(R.id.cos);
        tan = (Button)findViewById(R.id.tan);
        log = (Button)findViewById(R.id.log);
        ln = (Button)findViewById(R.id.ln);
        pie = (Button)findViewById(R.id.pie);
        e = (Button)findViewById(R.id.e);
        percent = (Button)findViewById(R.id.percent);
        exclam = (Button)findViewById(R.id.exclam);
        root = (Button)findViewById(R.id.root);
        power = (Button)findViewById(R.id.power);
        opening = (Button)findViewById(R.id.opening);
        closing = (Button)findViewById(R.id.closing);
        textbox = (EditText)findViewById(R.id.screen1);
        final Intent intent = new Intent(Scientific.this,MainActivity.class);
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText("Sin");
                //intent.putExtra("sin",s);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                sin1=true;
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText("Tan");
                //intent.putExtra("tan",s);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                tan1=true;
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText("Cos");
               // intent.putExtra("cos",s);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                cos1=true;
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText("log");
               // intent.putExtra("log",s);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                log1=true;
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText("ln");
                //intent.putExtra("ln",s);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                ln1=true;
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText("^");
                //intent.putExtra("pow",s);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                power1=true;

            }
        });
        pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText("π");
               // intent.putExtra("pie",s);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                pie1=true;
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText("e");
                //intent.putExtra("e",s);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                e1=true;
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText("%");
                intent.putExtra("percent",s);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                percent1=true;
            }
        });
        exclam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText("!");
                intent.putExtra("Exclam",s);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                exclam1=true;
            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText("√");
                //.putExtra("root",s);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                root1=true;
            }
        });
        opening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText("(");
                intent.putExtra("opening",s);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                opening1=true;
            }
        });
        closing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbox.setText(")");
                intent.putExtra("closing",s);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                closing1=true;
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void scientific(){
        Intent intent = new Intent(Scientific.this,MainActivity.class);
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

