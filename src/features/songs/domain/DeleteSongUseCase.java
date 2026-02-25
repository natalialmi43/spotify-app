package features.songs.domain;

public class DeleteSongUseCase {
    private SongRepository songRepository;

    public DeleteSongUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public void deleteSong (String idSong){
        songRepository.deleteSong(idSong);
    }
}
