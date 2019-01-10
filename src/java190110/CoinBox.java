package java190110;

public class CoinBox {

    private int balance;
    private String shape;
    private boolean isDestroyed;

    public CoinBox(String shape) {
        //this.balance = balance;
        this.shape = shape;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int openStomach() {
        int result = this.balance;
        this.balance = 0;
        return result;
    }

    public int getBalance() {
        return this.balance;
    }

//      처음에 정한 shape를 바꾸지 않고싶기때문에 setShape()를 만들지 않는다.
//    public void setShape(String shape) {
//        this.shape = shape;
//    }
}
