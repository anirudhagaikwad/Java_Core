
public class InterfaceJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XYZBank objXYZBank=new XYZBank();
		objXYZBank.simpleInterestMethod(); // call abstract implement method
		objXYZBank.compoundInterestMethod(); // call abstract implement method
		objXYZBank.callStaticMethodFromInterface(); // call method from XYZBank
		objXYZBank.simpleInterestDefaultMethod(); // call default method from Interface SimpleInterest
		
		

	} //end main()

} // end class

/*
 * Interface have abstract methods & public access modifier by default
 * Interface have default and static method with body (java 8 : default,static method & java 9 : private method)
 * Interface support multiple inheritance 
 * It can be used to achive loose coupling
 * All methods declare inside interface are implicitly public and abstract
 * All variable declare inside interface are implicitly public,static and final
 * Interface support nested interface
 * Interface can not initiate (Object can not create)
 * Inheritance of interface use 'extends' keyword
 * To implement interface in class use  'implements' keyword
 * 
 */


/*
 * Write program to perform operation of simple intrest and coumpound intrest using concept of interface
 * 
 */

interface SimpleInterest
{
	/*
	 * P : Principal Amount
	 * R : Rate Per Annum
	 * T : Time in Years
	 * simpleInterest=(PxRxT)/100
	 */
	
	double HOME_LOAN_INTEREST_RATE = 9; // 9% PER ANNUM
	double PERSONAL_LOAN_INTEREST_RATE = 18; // 18% PER ANNUM
	double VEHICLE_LOAN_INTEREST_RATE = 14; // 14% PER ANNUM
	
	
// abstract method
	void simpleInterestMethod(); 
	
// default method
	default void simpleInterestDefaultMethod()
	{
		System.out.println("Its Default Method");
		simpleInterestPrivateMethod(60000,3); // calling private method
		
	}
	
// static method
	static void simpleInterestStaticMethod(double p,double r,double t)
	{
		double simpleInterest=(p*r*t)/100;
		System.out.println("Simple interest from static method : "+"("+p+"x"+r+"x"+t+")"+"/100 = "+simpleInterest);
	}
	
// private method	
	
	private void simpleInterestPrivateMethod(double p,double t)
	{
		double simpleInterest=(p*HOME_LOAN_INTEREST_RATE*t)/100;
		System.out.println("Simple interest from private method: "+"("+p+"x"+HOME_LOAN_INTEREST_RATE+"x"+t+")"+"/100 = "+simpleInterest);
		
	}
	
} // end interface SimpleInterest



interface CompoundInterest
{
	/*
	 * P : Principal Amount
	 * R : Rate Per Annum
	 * T : Time in Years
	 * N : Number of times that interest is compound per unit T
	 * 
	 *  P(1+R/N)-P
	 */
	
// abstract method
		void compoundInterestMethod(); 	
} // end interface CompoundInterest


interface Interest extends SimpleInterest,CompoundInterest
{
	
} // end interface Interest


class XYZBank implements Interest
{
	double XYZBank_HOME_LOAN_INTEREST_RATE = 11; // 11% PER ANNUM
	double XYZBank_PERSONAL_LOAN_INTEREST_RATE = 22; // 22% PER ANNUM
	double XYZBank_VEHICLE_LOAN_INTEREST_RATE = 18; // 18% PER ANNUM
	
	// abstract method implement 
		public void simpleInterestMethod()
		{
			double p=400000;
			double t=5;
			double simpleInterest=(p*XYZBank_PERSONAL_LOAN_INTEREST_RATE*t)/100;
			System.out.println("Simple interest from abstract method implement  "+"("+p+"x"+XYZBank_PERSONAL_LOAN_INTEREST_RATE+"x"+t+")"+"/100 = "+simpleInterest);
			
		}
	
	// abstract method implement 
		public void compoundInterestMethod()
		{
			double p=400000;
			double t=5;
			int n=3;
			double amount=p*Math.pow(1+(XYZBank_PERSONAL_LOAN_INTEREST_RATE/n),n*t);
			double cinterest=amount-p;
			System.out.println("Compound interest from abstract method implement : "+cinterest);
		}
		
	// call Static Method from interface
		void callStaticMethodFromInterface()
		{
			SimpleInterest.simpleInterestStaticMethod(3000000, XYZBank_HOME_LOAN_INTEREST_RATE,20);
		}
	
} // end class





