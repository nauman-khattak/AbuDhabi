package rahman.abdul.abudhabi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher); //             ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        Button button = (Button) findViewById(R.id.btnCH);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Dubai.class);
                startActivity(i);

                //new Intent(MainActivity.this, OldDubai.class));
            }
        });
    }
}
