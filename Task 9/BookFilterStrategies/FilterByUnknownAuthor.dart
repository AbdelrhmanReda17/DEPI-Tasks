import '../BookService.dart';
import 'IBookFilter.dart';
import '../Book.dart';
class FilterByUnknownAuthor implements IBookFilter {
  @override
  BookFilter applyFilter(dynamic criteria) {
    return (Book book) => book.author == 'Unknown';
  }
}