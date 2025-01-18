class BankAccount(
    var accountHolder: String,
    private var balance: Double
) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            transactionHistory.add("$accountHolder deposited $$amount")
            println("$accountHolder deposited $$amount. New balance: $$balance")
        } else {
            println("Deposit amount must be greater than zero.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount
                transactionHistory.add("$accountHolder withdrew $$amount")
                println("$accountHolder withdrew $$amount. New balance: $$balance")
            } else {
                println("Insufficient funds! Cannot withdraw $$amount.")
            }
        } else {
            println("Withdrawal amount must be greater than zero.")
        }
    }

    fun displayTransactionHistory() {
        println("Transaction history for $accountHolder:")
        if (transactionHistory.isEmpty()) {
            println("No transactions recorded.")
        } else {
            for (transaction in transactionHistory) {
                println(transaction)
            }
        }
    }

    fun displayBalance() {
        println("$accountHolder's current balance: $$balance")
    }
}

fun main() {
    val akarshBankAccount = BankAccount(accountHolder = "Akarsh Jha", balance = 200.0)

    // Display the initial balance
    akarshBankAccount.displayBalance()

    // Perform transactions
    akarshBankAccount.deposit(40.0)
    akarshBankAccount.withdraw(1200.0)
    akarshBankAccount.deposit(2000.0)
    akarshBankAccount.deposit(300.0)
    akarshBankAccount.withdraw(250.24)

    // Display transaction history and final balance
    akarshBankAccount.displayTransactionHistory()
    akarshBankAccount.displayBalance()
}
