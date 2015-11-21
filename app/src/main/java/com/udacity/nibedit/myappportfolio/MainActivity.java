package com.udacity.nibedit.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;




public class MainActivity extends ActionBarActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= (Button)findViewById(R.id.btnSportify);
        btn2= (Button)findViewById(R.id.btnScores);
        btn3= (Button)findViewById(R.id.btnLibrary);
        btn4= (Button)findViewById(R.id.btnBiggerApp);
        btn5= (Button)findViewById(R.id.btnReader);
        btn6= (Button)findViewById(R.id.btnCapstoneApp);


    }

    public void btnClick(View view){
        switch (view.getId()){
            case R.id.btnSportify:
                Toast.makeText(MainActivity.this,"This button will launch my sportify streamer app.",Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnScores:
                Toast.makeText(MainActivity.this,"This button will launch my scores app.",Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnLibrary:
                Toast.makeText(MainActivity.this,"This button will launch my library app.",Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnBiggerApp:
                Toast.makeText(MainActivity.this,"This button will launch my build it bigger app",Toast.LENGTH_SHORT).show();

                break;

            case R.id.btnReader:

                Toast.makeText(MainActivity.this,"This button will launch my xyz reader app.",Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnCapstoneApp:

                Toast.makeText(MainActivity.this,"This button will launch my capstone app.",Toast.LENGTH_SHORT).show();
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
