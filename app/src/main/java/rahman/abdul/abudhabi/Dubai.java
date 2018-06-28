package rahman.abdul.abudhabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.*;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class Dubai extends AppCompatActivity {
    String groupChoice="";
    String names[] ={"Is Dubai the capital city of United Arab Emirates?", "Who is the ruler of Dubai?", "What is the population of Dubai?", "What is the total size of Dubai?", "What are the most popular places in Dubai?"};
    ArrayAdapter <String> adapter;
    Spinner spin;
    TextView display_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dubai);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher); //             ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);




        spin = findViewById(R.id.txtGroup);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,names);

        display_data = findViewById(R.id.txtResult);

        spin.setAdapter(adapter);


        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {

                    case 0:
                        groupChoice = "No, Abu Dhabi is the capital city of United Arab Emirates";
                        break;

                    case 1:
                        groupChoice = "His Highness Sheikh Mohammed Bin Rashid Al Maktoum";
                        break;

                    case 2:
                        groupChoice = "3.052 million";
                        break;

                    case 3:
                        groupChoice = "4,114 km²";
                        break;

                    case 4:
                        groupChoice = "Burj Kalifa, Burj Al Arab, Dubai Mall and Palm Island";
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button button = (Button) findViewById(R.id.btnAns);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                display_data.setTextSize(18);
                display_data.setText(groupChoice);

            }
        });

      /*  final Spinner group = (Spinner)findViewById(R.id.txtGroup);
        final TextView result = ((TextView)findViewById(R.id.txtResult));
        Button Answer = (Button)findViewById(R.id.btnAns);
        Answer.setOnClickListener(new View.OnClickListener() {
                                      final TextView result = ((TextView)findViewById(R.id.txtResult));
                                      @Override
                                      public void onClick(View v){
                                          groupChoice = group.getSelectedItem().toString();
                                          if (groupChoice=)
                                          result.setText("No" + groupChoice);
                                      }
                                  }
        );*/

        Button button1 = (Button) findViewById(R.id.btnNxt);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(Dubai.this, OldDubai.class);
                startActivity(i);

            }
        });
}
}
