import "Book.dart";
import "BookFilterStrategies/FilterByAuthor.dart";
import "BookFilterStrategies/IBookFilter.dart";
import "BookRepository.dart";
import "BookService.dart";

void main() {
  BookRepository repository = BookRepository();
  BookService service = BookService(repository);

  repository.addBook(Book(title : 'Book 1',author:   'Author 1',yearPublished:  2000, isCheckedOut:  false));
  repository.addBook(Book(title : 'Book 2',author:  'Author 2',yearPublished:  2005, isCheckedOut:  false));
  repository.addBook(Book(title : 'Book 3',author:  'Author 3',yearPublished:  2004, isCheckedOut:  false));
  repository.addBook(Book(title : 'Book 4',author:  'Author 4',yearPublished:  2008, isCheckedOut:  false));
  repository.addBook(Book(title : 'Book 5',author:  'Author 1',yearPublished:  2005, isCheckedOut:  false));
  repository.addBook(Book(title : 'Book 6',author:  'Author 5',yearPublished:  2009, isCheckedOut:  false));
  repository.addBook(Book(title : 'Book 7',author:  'Author 6',yearPublished:  20010, isCheckedOut:  true));

  repository.addBook(Book.unknownAuthor(title : 'Book 8',yearPublished:  2010));
  repository.addBook(Book.fromMap({
    'title': 'Book 9',
    'author': 'Author 3',
    'yearPublished': 2020,
    'isCheckedOut': true,
  }));

  print ("-------------------------------------------");
  IBookFilter BookFilter = FilterByAuthor();
  List<Book> booksByAuthor1 = service.filterBooks(BookFilter.applyFilter('Author 1'));
  print('Books by Author 1: ${booksByAuthor1.map((book) => book.title).toList()}');
  print ("-------------------------------------------");
  print('Checked Out Books Count: ${service.countCheckedOutBooks()}');
  print ("-------------------------------------------");
  print('Total Books Published After 2005: ${service.totalBooksPublishedAfter(2005)}');
  print ("-------------------------------------------");
  print('Book Titles: ${service.getBookTitles()}');
  print ("-------------------------------------------");
  print('Book Status for Book 1: ${service.getBookStatus(repository.getBooks()[0])}');
  print ("-------------------------------------------");
   service.printBookDetails();
}
