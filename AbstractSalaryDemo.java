/**
 * @(#)AbstractSalaryDemo.java
 *
 *
 * @author
 * @version 1.00 2021/5/24
 */


public class AbstractSalaryDemo {

    public static void main(String args[]) {

    	Salary s = new Salary("Chirs", "Dublin", 3, 800.00);
    	Employee e = new Salary("Bill", "Wexford", 2, 650.00);

    	System.out.println("Call mailCheck using salary reference--");
    	s.mailCheck();

    	System.out.println("\n Call mailCheck using employee reference--");
    	e.mailCheck();

    }//end main


}//end class