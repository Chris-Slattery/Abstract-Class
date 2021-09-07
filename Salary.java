/**
 * @(#)Salary.java
 *
 *
 * @author
 * @version 1.00 2021/5/24
 */
//We can inherit the properties of the Employee class just liek the concrete class int he following way -

public class Salary extends Employee {
	private double salary;  //Annual Salary


    public Salary(String name, String address, int number, double salary) {
    	super(name, address, number);
    	setSalary(salary);
    }//end constructor


    public void mailCheck(){
    	System.out.println("Within mailCheck of salary class");
    	System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }//end mailCheck method


    public double getSalary(){
    	return salary;
    }//end getSalary method


    public void setSalary(double newSalary){
    	if(newSalary >= 0.0){
    		salary = newSalary;
    	}//end if
    }//end setSalary


    public double computePay(){
    	System.out.println("Computing salary pay for " + getName());
    	return salary/52;
    }//end computePay method


}