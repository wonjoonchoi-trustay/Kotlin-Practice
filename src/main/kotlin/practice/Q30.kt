package practice

import org.springframework.transaction.InvalidIsolationLevelException

/*
🚀 서른 번째 문제 (클래스와 init, backing field, custom getter)

다음 Java 코드를 Kotlin으로 변환하세요.

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.owner = owner;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > balance) throw new IllegalStateException("Insufficient funds");
        balance -= amount;
    }
}


👉 변환 시 고려사항:
primary constructor + init 블록에서 유효성 검사
balance는 var로 두되, custom setter로 제약을 줄 수도 있음
deposit, withdraw는 Kotlin 예외 처리 스타일(require, check) 사용
 */

class BankAccount private constructor(
    val owner: String,
    balance: Int
) {
    var balance: Int = balance
        private set

    init {
        require(balance >= 0) {throw IllegalArgumentException("Balance cannot be negative") }
    }

    fun deposit(amount: Int) {
        require(amount > 0) {throw IllegalArgumentException("Deposit must be positive") }
        balance += amount
    }

    fun withdraw(amount: Int) {
        require(amount <= balance) { throw IllegalStateException("Insufficient funds") }
        balance -= amount
    }
}