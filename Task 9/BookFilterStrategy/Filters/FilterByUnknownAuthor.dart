import '../BookFilter.dart';
import '../IBookFilter.dart';
import '../../Book.dart';
class FilterByUnknownAuthor implements IBookFilter {
  @override
  BookFilter applyFilter() {
    return (Book book) => book.author == 'Unknown';
  }
}