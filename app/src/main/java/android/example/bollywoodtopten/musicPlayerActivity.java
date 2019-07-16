package android.example.bollywoodtopten;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class musicPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_player);

        songplaying();
    }

    public void songplaying() {

        // Get extras from Intent.
        Intent songsIntent = getIntent();
        Bundle b = songsIntent.getExtras();

        String songString =(String) b.get("Song");
        TextView songTextView = findViewById(R.id.song_title);
        songTextView.setText(songString);

        String singerString =(String) b.get("Singer");
        TextView singerTextView = findViewById(R.id.song_singer);
        singerTextView.setText(singerString);


    }
}
