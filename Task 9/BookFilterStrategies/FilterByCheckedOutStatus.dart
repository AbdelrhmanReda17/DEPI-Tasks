import '../BookService.dart';
import 'IBookFilter.dart';
import '../Book.dart';

class FilterByCheckedOutStatus implements IBookFilter {
  @override
  BookFilter applyFilter(dynamic isCheckedOut) {
    return (Book book) => book.isCheckedOut == isCheckedOut;
  }
}