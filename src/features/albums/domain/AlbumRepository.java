package features.albums.domain;

import java.util.ArrayList;

public interface AlbumRepository {
    ArrayList <Album> getAlbums();

    void saveAlbum (Album album);

    void deleteAlbum (String songId);
}
