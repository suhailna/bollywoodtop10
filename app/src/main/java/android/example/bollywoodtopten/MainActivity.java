package android.example.bollywoodtopten;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the 2018 category
        TextView topTen2018 = (TextView) findViewById(R.id.year2018);

        // Set a click listener on that View
        topTen2018.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent topTen2018Intent = new Intent(MainActivity.this, songs2018.class);

                // Start the new activity
                startActivity(topTen2018Intent);
            }
        });

        // Find the View that shows the 2019 category
        TextView topTen2019 = (TextView) findViewById(R.id.year2019);

        // Set a click listener on that View
        topTen2019.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent topTen2019Intent = new Intent(MainActivity.this, songs2019.class);

                // Start the new activity
                startActivity(topTen2019Intent);
            }
        });





    }
}
