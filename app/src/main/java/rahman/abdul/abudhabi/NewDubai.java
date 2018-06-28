package rahman.abdul.abudhabi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;




public class NewDubai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newdubai);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher); //             ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);



    }
}
