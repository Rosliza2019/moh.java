package chap4;
/*
"this" utk set/get a property  OR call/run method
i.e this.jumlah = 100;
*/

public class LoanCalculator  extends Calculator {
    int jumlah = 0; // variable/property
    //final = val ini x blh tukar
    final String tajuk = "LOAN CALCULATOR";
    /*public void info() {
        
    }
    ini x blh sbb parent info() dah final
    */
            
    @Override
    public void cetak() {
        //this.tajuk = "abc" - dah final x blh tukar
        System.out.println("cetak loancalculator");
    }
    int jumlah; // variable / property
    //ctrl + space = show auto suggestion
    //psvm tab = auto gen pub static void main()
    
    public static void main(String [] args) {
        LoanCalculator cal = new LoanCalculator();
        cal.cetak();
        LoanCalculator cal2 = new LoanCalculator(1); //shift + control + arrow down
    }
      //constructor   
      // dlm satu class blh ada multiple constructor
    public LoanCalculator() {
        //super(); //run parent constructor
        System.out.println(" i'm in constructor");
    }
    //constructor
    public LoanCalculator(int amount) {
     this.jumlah = amount;
     System.out.println(" i'm in constructor 2 ");
    }
//mesti return int, void - no return
    int calcLoanPayment(int amount, int numberOfMonths, String state){
        return 0;
    }
    //shift + alt + f  = auto arrange code
    //method overloading
    private int calcLoanPayment(int amount) {
        return 0;
    }
}
