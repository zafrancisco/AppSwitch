package zamuel.francisco.com.appswitch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button map = (Button) findViewById(R.id.map);
        Button swtch = (Button) findViewById(R.id.swtch);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:14.6079499,120.9914351,17z");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                if(mapIntent.resolveActivity(getPackageManager())!= null){
                    startActivity(mapIntent);
                }
            }
        });

        swtch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Back = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(Back);
            }
        });
    }
}
