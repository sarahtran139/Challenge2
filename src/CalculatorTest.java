public class CalculatorTest {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        myCalc.setOperandOne(10.5);
        myCalc.setOperation("+");
        myCalc.setOperandTwo(5.2);
        myCalc.performOperation();
        double result = myCalc.getResults();

        System.out.println("The result is: " + result); // This will print "The result is: 15.7"
    }
}







