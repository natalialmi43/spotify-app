package features.albums.domain;

public class DeleteSongUseCase {

    private AlbumRepository albumRepository;

    public DeleteSongUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public void deteleSong (String idSong){
        albumRepository.deleteSong(idSong);
    }
}
