/**
 * @(#)AbstractEmployeeDemo.java
 *
 *
 * @author
 * @version 1.00 2021/5/24
 */


public class AbstractEmployeeDemo {

    public static void main(String args[]) {
    	//The following code is not allowed and raises error.
    	Employee e = new Employee("George", "Dublin, Ireland", 29);
    	System.out.println("\n Call mailCheck using employee reference--");
    	e.mailCheck();

    }//end main method


}//end AbstractEmployeeDemo Class