package features.songs.domain;

import java.util.ArrayList;

public class GetSongUseCase {

    private SongRepository songRepository;

    public GetSongUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public ArrayList <Song> execute (){
        return songRepository.getSongs();
    }
}
