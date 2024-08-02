import 'Transaction.dart';
class Budget {
  List<Transaction> income = [];
  List<Transaction> expenses = [];

  // Method to add a transaction to the correct list
  void addTransaction(Transaction transaction) {
    if (transaction.type == "income") {
      income.add(transaction);
    } else if (transaction.type == "expense") {
      expenses.add(transaction);
    }
  }

  double totalIncome() {
    double total = 0;
    for (final transaction in income) {
      total += transaction.amount;
    }
    return total;
  }

  double totalExpenses() {
    double total = 0;
    for (var transaction in expenses) {
      total += transaction.amount;
    }
    return total;
  }

  double balance() {
    return totalIncome() - totalExpenses();
  }
  void displaySummary() {
    print("Budget Summary :");
    print("Total Income: \$${totalIncome()}");
    print("Total Expenses: \$${totalExpenses()}");
    print("Current Balance: \$${balance()}");
  }
}
