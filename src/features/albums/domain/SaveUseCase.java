package features.albums.domain;

public class SaveUseCase {

    private AlbumRepository albumRepository;

    public SaveUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public void execute (Album album){
        albumRepository.saveAlbum(album);
    }
}
