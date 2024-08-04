import '../BookFilter.dart';
import '../IBookFilter.dart';
import '../../Book.dart';

class FilterByCheckedOutStatus implements IBookFilter {
  final bool isCheckedOut;
  FilterByCheckedOutStatus({required this.isCheckedOut});
  @override
  BookFilter applyFilter() {
    return (Book book) => book.isCheckedOut == isCheckedOut;
  }
}