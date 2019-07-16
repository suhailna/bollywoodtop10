package android.example.bollywoodtopten;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class songs2019 extends AppCompatActivity implements ListView.OnItemClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Creating Songs Array
        ArrayList<Songs> songs = new ArrayList<Songs>();
        // Adding Objects to arraylist
        songs.add(new Songs("Arijit Singh","Bekhayali"));
        songs.add(new Songs("Vishal & Shekhar Feat. Nakash A , Shreya G","Slow Motion"));
        songs.add(new Songs("Arijeet Singh","Tujhe Kitna Chahne Lage"));
        songs.add(new Songs("Vishal & Shekhar feat. Abhijeet Srivastava","Chashni"));
        songs.add(new Songs("Neha Kakkar & Shekhar Ravjiani","Hook up song"));
        songs.add(new Songs("Jasbir Jassi, Badshah, Dhvani Bhanushali","Koka"));
        songs.add(new Songs("Tony Kakkar ft. Neha Sharma","Dheeme Dheeme"));
        songs.add(new Songs("Udit Narayan & Shreya Ghoshal","Jugrafiyan"));
        songs.add(new Songs("Garry Sandhu & Neha Kakkar","Hauli Hauli"));
        songs.add(new Songs("Arijit Singh & Asees Kaur","Ve Maahi"));

        SongsAdapter adapter = new SongsAdapter(this,songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        // Get the selected Song.
        Songs currentSong = (Songs) adapterView.getItemAtPosition(position);

        // Extract strings from Song object.
        String songPlaying = currentSong.getsongTitle();
        String singerPlaying = currentSong.getnameOfSinger();

        //Sending the name of song and singer to musicPlayerActivity.
        Intent songsIntent = new Intent(songs2019.this, musicPlayerActivity.class);
        songsIntent.putExtra("Song", songPlaying);
        songsIntent.putExtra("Singer", singerPlaying);
        startActivity(songsIntent);
    }
}
