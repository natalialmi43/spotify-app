package features.songs.data;

import features.songs.domain.Song;
import features.songs.domain.SongRepository;

import java.util.ArrayList;

public class SongDataRepository implements SongRepository {

    @Override
    public ArrayList<Song> getSongs() {

        //Se hace para probar que estemos metiendo bien
        Song song1 = new Song();
        song1.setId("1");
        song1.setTitle("AAA");
        song1.setAuthor("AAA");
        song1.setDuration("3");

        Song song2 = new Song();
        song2.setId("2");
        song2.setTitle("BBB");
        song2.setAuthor("BBB");
        song2.setDuration("4");

        // Se añaden al ArrayList
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);

        return null;
    }
}
