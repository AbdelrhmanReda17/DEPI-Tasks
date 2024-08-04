import "Book.dart";
import "BookFilterStrategy/BookFilterChain.dart";
import "BookFilterStrategy/Filters/FilterByAuthor.dart";
import "BookFilterStrategy/Filters/FilterByCheckedOutStatus.dart";
import "BookFilterStrategy/Filters/FilterByYearPublished.dart";
import "BookFilterStrategy/IBookFilter.dart";
import "BookRepository.dart";
import "BookService.dart";

void main() {
  BookRepository repository = BookRepository();
  BookService service = BookService(repository);

  repository.addBook(Book(title : 'Book 1',author:   'Author 1',yearPublished:  2000, isCheckedOut:  false));
  repository.addBook(Book(title : 'Book 2',author:  'Author 2',yearPublished:  2005, isCheckedOut:  false));
  repository.addBook(Book(title : 'Book 3',author:  'Author 3',yearPublished:  2004, isCheckedOut:  false));
  repository.addBook(Book(title : 'Book 4',author:  'Author 4',yearPublished:  2008, isCheckedOut:  false));
  repository.addBook(Book(title : 'Book 5',author:  'Author 1',yearPublished:  2006, isCheckedOut:  false));
  repository.addBook(Book(title : 'Book 6',author:  'Author 5',yearPublished:  2009, isCheckedOut:  false));
  repository.addBook(Book(title : 'Book 7',author:  'Author 6',yearPublished:  20010, isCheckedOut:  true));

  repository.addBook(Book.unknownAuthor(title : 'Book 8',yearPublished:  2010));
  repository.addBook(Book.fromMap({
    'title': 'Book 9',
    'author': 'Author 3',
    'yearPublished': 2020,
    'isCheckedOut': true,
  }));

  print("-------------------------------------------");
  BookFilterChain filterChain = BookFilterChain();
  filterChain.addFilter(FilterByAuthor(author: 'Author 1'));
  filterChain.addFilter(FilterByCheckedOutStatus(isCheckedOut: false));
  filterChain.addFilter(FilterByYearPublished(year: 2005 ,identifier: FilterIdentifier.After));
  print('Books by Author 1 and not checked out and After 2005: ');
  service.printList(filterChain.applyFilters(repository.getBooks()));
  print ("-------------------------------------------");
  IBookFilter BookFilter = FilterByAuthor(author: 'Author 1');
  print('Books by Author 1: ');
  service.printList(service.filterBooks(BookFilter.applyFilter()));
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
