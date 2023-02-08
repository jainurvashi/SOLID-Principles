//The Liskov Substitution Principle (LSP) applies to inheritance hierarchies such that
// derived classes must be completely substitutable for their base classes.
import java.math.BigDecimal;

public class LiskovSubstitutionPrinciple {
}
 abstract class Account {
    protected abstract void deposit(BigDecimal amount);
}
abstract class WithdrawableAccount  extends  Account{
    protected abstract void deposit(BigDecimal amount);
    protected abstract void withdraw(BigDecimal amount);
}
abstract class FixedAccount extends Account {
    protected abstract void deposit(BigDecimal amount);
}

 class BankingAppWithdrawalService  extends  WithdrawableAccount{
     @Override
     protected void deposit(BigDecimal amount) {

     }
     @Override
     protected void withdraw(BigDecimal amount) {

     }
 }
 class FixedTermDepositAccount extends FixedAccount {
    @Override
    protected void deposit(BigDecimal amount) {

    }

}
//Signature Rule – Return Types
abstract class Foo {
    public abstract Number generateNumber();
    // Other Methods
}
class Bar extends Foo {
    @Override
    public Integer generateNumber() {
        return 10;
    }
    // Other Methods
}

//Properties Rule – Class Invariants
//Methods Rule – Postcondition
// Methods Rule – Preconditions
 abstract class Car {
    protected int limit;

    // invariant: speed < limit;
    protected int speed;

    // postcondition: speed < limit
    protected abstract void accelerate();

    // precondition: 0 < num <= 5
    public void doStuff(int num) {
        if (num <= 0 || num > 5) {
            throw new IllegalArgumentException("Input out of range 1-5");
        }
    }
}
 class HybridCar extends Car {
    // invariant: charge >= 0;
    private int charge;
    @Override
    // postcondition: speed < limit
    protected void accelerate() {
        // Accelerate HybridCar ensuring speed < limit
    }

     @Override

     public void doStuff(int num) {
        //this condition break postcondition rule
      /*   if (num <= 0 || num > 10) {
             throw new IllegalArgumentException("Input out of range 1-10");
         }*/
         if (num <= 0 || num > 3) {
             throw new IllegalArgumentException("Input out of range 1-10");
         }
     }
}

//Properties Rule – History Constraint
abstract class Bike {

    protected int petrol;

    public Bike(int petrol) {
        this.petrol = petrol;
    }


}
class  ToyBike extends Bike{

    public ToyBike(int petrol) {
        super(petrol);
    }
    //this method break  history Constraint rule
   /* public void reset() {
        petrol = 0;
    }*/
}