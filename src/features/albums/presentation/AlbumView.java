package features.albums.presentation;

import features.albums.data.AlbumDataRepository;
import features.albums.data.AlbumMemLocalDataSource;
import features.albums.domain.Album;
import features.albums.domain.GetAlbumUseCase;

import java.util.ArrayList;

public class AlbumView {

    public  static void printAlbums(){
        GetAlbumUseCase albumUseCase = new GetAlbumUseCase(
          new AlbumDataRepository(AlbumMemLocalDataSource.newInstance())
        );
/*
        ArrayList<Album> albums = getAlbumsUseCase.execute();
        System.out.println(albums);

 */
    }
}
