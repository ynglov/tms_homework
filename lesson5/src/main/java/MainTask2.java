import org.task2.CreditCard;

public class MainTask2 {

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(1, 10);
        CreditCard card2 = new CreditCard(2, 15);
        CreditCard card3 = new CreditCard(3, 5);

        card1.transfer(10);
        card2.transfer(15);
        card3.withdraw(10);
        card1.showCreditCard();
        card2.showCreditCard();
        card3.showCreditCard();

    }

}
