package rahman.abdul.abudhabi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class AbuDhabiActivity extends AppCompatActivity {
    String groupChoice = "";
    String names[] = {"Is Abu Dhabi the capital city of United Arab Emirates?", "Who is the ruler of Abu Dhabi?", "What is the population of Abu Dhabi?", "What is the total size of Abu Dhabi?", "What are the most popular places in Abu Dhabi"};
    ArrayAdapter<String> adapter;
    Spinner spin;
    TextView display_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abudhabi);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        spin = findViewById(R.id.txtGroup);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, names);

        display_data = findViewById(R.id.txtResult);

        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        groupChoice = "Yes, Abu Dhabi is the capital city of United Arab Emirates";
                        break;

                    case 1:
                        groupChoice = "His Highness Sheikh Zayed bin Sultan Al Nahyan";
                        break;

                    case 2:
                        groupChoice = "1.145 million";
                        break;

                    case 3:
                        groupChoice = "972 km²";
                        break;

                    case 4:
                        groupChoice = "Sheikh Zayed Mosque, Ferrari World, Marina Mall and Yas Waterworld";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button button = findViewById(R.id.btnAns);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                display_data.setTextSize(18);
                display_data.setText(groupChoice);

            }
        });

        Button button1 = findViewById(R.id.btnNxt);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(AbuDhabiActivity.this, OldAbuDhabiActivity.class);
                startActivity(i);

            }
        });
    }
}
