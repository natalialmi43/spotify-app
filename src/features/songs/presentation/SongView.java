package features.songs.presentation;

import features.songs.data.SongDataBDRepository;
import features.songs.domain.GetSongUseCase;
import features.songs.domain.Song;

import java.util.ArrayList;

public class SongView {

    public static void printSongs(){

        GetSongUseCase getSongsUseCase = new GetSongUseCase(new SongDataBDRepository());

        ArrayList<Song> songsList = getSongsUseCase.execute();

        System.out.println(songsList);
    }
}
