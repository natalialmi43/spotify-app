package features.authors.domain;

public class DeleteAuthorUseCase {

    private AuthorRepository authorRepository;

    public DeleteAuthorUseCase(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void deleteAuthor (String idAuthor){
        authorRepository.deleteAuthor(idAuthor);
    }
}
