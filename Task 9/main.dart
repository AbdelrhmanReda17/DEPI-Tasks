import "Book.dart";
import "BookFilterStrategies.dart";
import "BookRepository.dart";
import "BookService.dart";

void main() {
  BookRepository repository = BookRepository();
  BookService service = BookService(repository);

  repository.addBook(Book(title : 'Book 1',author:   'Author 1',yearPublished:  2000, isCheckedOut:  false));
  repository.addBook(Book(title : 'Book 2',author:  'Author 2',yearPublished:  2005, isCheckedOut:  false));
  repository.addBook(Book.unknownAuthor(title : 'Book 3',yearPublished:  2010));
  repository.addBook(Book.fromMap({
    'title': 'Book 4',
    'author': 'Author 3',
    'yearPublished': 2020,
    'isCheckedOut': true,
  }));

  List<Book> booksByAuthor1 = service.filterBooks(BookFilterStrategies.byAuthor('Author 1'));
  print('Books by Author 1: ${booksByAuthor1.map((book) => book.title).toList()}');
  print('Checked Out Books Count: ${service.countCheckedOutBooks()}');
  print('Total Books Published After 2005: ${service.totalBooksPublishedAfter(2005)}');
  print('Book Titles: ${service.getBookTitles()}');
  print('Book Status for Book 1: ${service.getBookStatus(repository.getBooks()[0])}');
  service.printBookDetails();
}
