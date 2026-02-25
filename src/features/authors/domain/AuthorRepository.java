package features.authors.domain;

import features.albums.domain.Album;

import java.util.ArrayList;

public interface AuthorRepository {

    public ArrayList <Author> getAuthors();

    void saveAuthor (Author author);

    void deleteAuthor (String idAuthor);
}
