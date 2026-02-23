package features.authors.data;

import features.authors.domain.Author;

import java.util.ArrayList;

public class AutorApiLocalDataSource {

    public ArrayList <Author> authorsApiStorage = new ArrayList<>();

    public AuthorApiLocalDataSource() {
        initData();
    }

    private void initData(){
        Author author1 = new Author("1", "autor1API", "2000", "Española");
        authorsApiStorage.add(author1);

        Author author2 = new Author("2", "autor2API", "2001", "Marroqui");
        authorsApiStorage.add(author2);
    }

    public ArrayList<Author> findAll(){
        return authorsApiStorage;
    }
}
