package android.example.bollywoodtopten;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class songs2018 extends AppCompatActivity implements ListView.OnItemClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Creating Songs Array
        ArrayList<Songs> songs = new ArrayList<Songs>();
        // Adding Objects to arraylist
        songs.add(new Songs("Harsdeep Kaur","Dilbardo"));
        songs.add(new Songs("Sukhwinder","Kar Har maidan Fateh"));
        songs.add(new Songs("Arijeet Singh","Tera Yaar Hoon"));
        songs.add(new Songs("Atif Aslam","Paniyo Sa"));
        songs.add(new Songs("Sunidhi Chawhan","Halka Halka"));
        songs.add(new Songs("Ammy Virk and Shahid Mallya","Daryaa"));
        songs.add(new Songs("Arijit Singh","Raazi"));
        songs.add(new Songs("Atif Aslam, Jyotica Tangri","O Meri Laila from Laila Majnu"));
        songs.add(new Songs("Nikitha Gandhi","Mujhe Chand Par Le Chalo"));
        songs.add(new Songs("Ustad Rashid Khan and Vidya Shah","Nikitha Gandhi"));

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
        Intent songsIntent = new Intent(songs2018.this, musicPlayerActivity.class);
        songsIntent.putExtra("Song", songPlaying);
        songsIntent.putExtra("Singer", singerPlaying);
        startActivity(songsIntent);
    }
}
