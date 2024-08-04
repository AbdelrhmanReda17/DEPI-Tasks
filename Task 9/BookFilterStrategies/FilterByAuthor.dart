import '../BookService.dart';
import 'IBookFilter.dart';
import '../Book.dart';

class FilterByAuthor implements IBookFilter {
  @override
  BookFilter applyFilter(dynamic author) {
    return (Book book) => book.author == author;
  }
}