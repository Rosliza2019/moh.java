//main() berada satu class kursus yang akan
//guna class class yang lain
public class App {
    //entry point method
    public static void main(String[] args) {
        //create object
        car ferrari = new car();
        ferrari.numberOfDoors = 2;
        ferrari.color = "red"; //mesti "" x blh ''
        ferrari.print();
        ferrari.startEngine();
        car porche = new car();
    }
    
}
