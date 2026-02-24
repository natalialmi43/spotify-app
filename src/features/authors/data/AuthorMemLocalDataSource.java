package features.authors.data;

import features.authors.domain.Author;

import java.util.ArrayList;

public class AuthorMemLocalDataSource {

    private static AuthorMemLocalDataSource instance = null;

    // Se crea e inicializa un array
    public ArrayList <Author> authorsMemStorage = new ArrayList<>();

    public AuthorMemLocalDataSource(){
        initData();
    }

    // Se crean autores y se guardan en precarga de datos simulados.
    private void initData (){

        Author author1 = new Author("1", "autor1", "2000", "Española");
        authorsMemStorage.add(author1);

        Author author2 = new Author("2", "autor1", "2001", "Marroqui");
        authorsMemStorage.add(author2);
    }

    // Devuelve los autores guardados en el array de arriba
    public ArrayList <Author> findAll(){
        return authorsMemStorage;
    }

    // Se le pasa como parametro un autor y lo guarda en el array anterior
    public void save (Author author){
        authorsMemStorage.add(author);
    }

    public static AuthorMemLocalDataSource newInstance (){
        if (instance == null){
            instance = new AuthorMemLocalDataSource();
        }
        return instance;
    }
}
