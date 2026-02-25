package features.albums.domain;

public class DeleteAlbumUseCase {

    private AlbumRepository albumRepository;

    public DeleteAlbumUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public void deteleAlbum (String idAlbum){
        albumRepository.deleteAlbum(idAlbum);
    }
}
