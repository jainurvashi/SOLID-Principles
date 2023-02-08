import java.util.ArrayList;
import java.util.List;

//The Interface Segregation Principle (ISP) states that clients should not be forced to
// depend upon interface members they do not use. In other words, do not force any client
// to implement an interface that is irrelevant to them.
public class InterfaceSegregationPrinciple {
}
interface Payment {
    Object status();
    List<Object> getPayments();
}
interface Bank extends Payment {
    void initiatePayments();
}
interface Loan extends Payment {
    void intiateLoanSettlement();
    void initiateRePayment();
}
class BankPayment implements Bank {

    @Override
    public void initiatePayments() {
    }

    @Override
    public Object status() {
        return  new Object();
    }

    @Override
    public List<Object> getPayments() {
        return  new ArrayList<>();
    }
}
class LoanPayment implements Loan {

    @Override
    public void intiateLoanSettlement() {
    }

    @Override
    public void initiateRePayment() {
    }

    @Override
    public Object status() {
        return  new Object();
    }

    @Override
    public List<Object> getPayments() {
        return  new ArrayList<>();
    }
}
