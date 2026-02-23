package features.songs.data;

import features.songs.domain.Song;
import features.songs.domain.SongRepository;

import java.util.ArrayList;

public class SongDataBDRepository implements SongRepository {

    @Override
    public ArrayList<Song> getSongs() {


        Song song1 = new Song();
        song1.setId("1");
        song1.setTitle("CCC");
        song1.setAuthor("CCC");
        song1.setDuration("5");

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song1);

        return null;
    }
}
