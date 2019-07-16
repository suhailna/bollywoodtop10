package android.example.bollywoodtopten;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {

    public SongsAdapter(Activity context, ArrayList<Songs> topTenSongs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, topTenSongs);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Songs} object located at this position in the list
        Songs currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView singerTextView = (TextView) listItemView.findViewById(R.id.singer_text_view);
        // Get the version name from the current Song object and
        // set this text on the name TextView
        singerTextView.setText(currentSong.getnameOfSinger());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the version number from the current Song object and
        // set this text on the number TextView
        titleTextView.setText(currentSong.getsongTitle());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
