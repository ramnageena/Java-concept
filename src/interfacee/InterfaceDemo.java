package interfacee;

interface Bank{

    void rateOfInterest();

}

class SBI implements Bank {


    public void rateOfInterest() {
        System.out.println("SBI rate of interest is 9.8%");
    }


}
class HDFC implements Bank {


    public void rateOfInterest() {
        System.out.println("HDFC rate of interest is 8.8%");
    }
}
class PNB implements Bank {


    public void rateOfInterest() {
        System.out.println("PNB rate of interest is 7.8%");
    }
}

public class InterfaceDemo  {

    public static void main(String[] args) {
            Bank sbi= new SBI();
            sbi.rateOfInterest();
            Bank hdfc= new HDFC();
            hdfc.rateOfInterest();
            Bank pnb= new PNB();
            pnb.rateOfInterest();




    }
}
