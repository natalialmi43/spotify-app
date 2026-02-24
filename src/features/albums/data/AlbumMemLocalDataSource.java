package features.albums.data;

import features.albums.domain.Album;

import java.util.ArrayList;

public class AlbumMemLocalDataSource {

    private static AlbumMemLocalDataSource instance = null;

    private ArrayList<Album> storage = new ArrayList<>();

    public AlbumMemLocalDataSource() {
        initData();
    }

    private void initData(){
        Album a1 = new Album("001", "nombre", "2026");
        storage.add(a1);
    }

    public ArrayList<Album> findAll (){
        return storage;
    }

    public void save (Album album){
        storage.add(album);
        System.out.println(album);
    }

    public static AlbumMemLocalDataSource newInstance(){
        if (instance == null){
            instance = new AlbumMemLocalDataSource();
        }

        return instance;
    }

}
