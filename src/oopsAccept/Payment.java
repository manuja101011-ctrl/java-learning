package oopsAccept;

public class Payment {
  void pay() {
	  
  }
}

class UPIPayment extends Payment {

    void pay() {
        System.out.println("Payment through UPI");
    }
}

class CardPayment extends Payment {

  
    void pay() {
        System.out.println("Payment through Card");
    }
}

class CashPayment extends Payment {

 
    void pay() {
        System.out.println("Payment through Cash");
    }
}