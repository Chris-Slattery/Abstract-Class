/**
 * @(#)Employee.java
 *
 *
 * @author
 * @version 1.00 2021/5/24
 */
//Program illustrating the use of abstract class
//Abstraction is the quality of dealing with ideas rather than events.
//In OO programming, abstraction is the process of hiding the implementation details fromt he user, only
//functionality will be provided to the user.
//The user will have information on what the object does instead of how it does it.

public abstract class Employee {
	private String name;
	private String address;
	private int number;

    public Employee(String name, String address, int number) {
    	System.out.println("Constructing an Employee");
    	this.name = name;
    	this.address = address;
    	this.number = number;
    }//end constructor

    public double computePay(){
    	System.out.println("Inside Employee computePay method");
    	return 0.0;
    }//end computePay method

    public void mailCheck(){
    	System.out.println("Mailing a check to " + this.name + " " + this.address);
    }//end mailCheck method

    public String toString(){
    	return name + " " + address + " " + number;
    }//end toString method

    public String getName(){
    	return name;
    }//end getName

    public String getAddress(){
    	return address;
    }//end getAddress

    public void setAddress(String newAddress){
    	address = newAddress;
    }//end setAddress method

    public int getNumber(){
    	return number;
    }//end getNumber


}//end employee class