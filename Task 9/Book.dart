class Book{
  String title;
  String author;
  int yearPublished;
  bool isCheckedOut;

  Book({required this.title, required this.author,required this.yearPublished,required this.isCheckedOut});

  Book.unknownAuthor({required this.title , required this.yearPublished})
       : author = 'Unknown',
        isCheckedOut = false;

  factory Book.fromMap(Map<String, dynamic> map) {
    return Book(
      title : map['title'],
      author : map['author'],
      yearPublished : map['yearPublished'],
      isCheckedOut : map['isCheckedOut'] ?? false,
    );
  }
}
