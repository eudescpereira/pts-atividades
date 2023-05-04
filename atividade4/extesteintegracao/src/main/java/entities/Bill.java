package entities;

public class Bill {

    int definedValue = 0;
    int expMonth = 3;
    int paymentMonth = 3;

    public int periodInMonths(int expMonth, int paymentMonth){
        if (paymentMonth <= expMonth){
            definedValue = 0;
        }else {
            definedValue = paymentMonth - expMonth * 1;
        }
        return 2;
    }
    public String calculatePaymentValue(){
        return "noise";
    }
}
