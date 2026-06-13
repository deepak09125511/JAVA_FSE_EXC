interface paymentProcessor{
    public void processPayment();
}
class PayPal{
    public void palPayment(){
        System.out.println("paid using PayPal");
    }
}
class RazorPay{
    public void razorPayment(){
        System.err.println("paid using RazorPay");
    }
}
class JusPay{
    public void JusPayment(){
        System.err.println("paid using JusPay");
    }
}

class PayPalAdapter implements paymentProcessor{
    PayPal pay = new PayPal();
    @Override
    public void processPayment(){
           pay.palPayment();
    }
}
class RazorPayAdapter implements  paymentProcessor{
    RazorPay pay1 = new RazorPay();
    @Override
    public void processPayment(){
        pay1.razorPayment();
    }
}
class JusPayAdapter implements  paymentProcessor{
    JusPay pay2 = new JusPay();
    @Override
    public void processPayment(){
        pay2.JusPayment();
    }
}
public class Main{
    public static void main(String[] args) {
        paymentProcessor paypal = new PayPalAdapter();
        paypal.processPayment();
        paymentProcessor razorpay = new RazorPayAdapter();
        razorpay.processPayment();
        paymentProcessor juspay = new JusPayAdapter();
        juspay.processPayment();
    }
}