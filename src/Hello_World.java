import java.util.Scanner;


/**
 * @author Muthuu SVS jr
 *
 */
public class Hello_World {

	
	/*Excution of program, 
	 * 1.Recieves UserInput for boys and girls
	 * 2. Calculates total students in class
	 * 3. Recieves userinput for number of classes
	 * 4.Calculates total no. of students in school
	 * 5. Recieves userinput for no. of subjects
	 * 6. Calculates no. of teachers total
	 * 7.Valditates if every input value is positive
	 * 8.Incorparates addition, subtraction, multiplication, and division methods
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		double boys, girls, totalClass, schoolTotal, NoOfClasses;
		Scanner userinput = new Scanner (System.in);
		
		System.out.println("Enter number of boys");
		boys = GetANumb(userinput);
		System.out.println("Enter number of girls");
		girls = GetANumb(userinput);
		
	    totalClass=addNumb(boys,girls);
		System.out.println("Total students in class" +totalClass);
		
		System.out.println("Enter Number of Classes");
		NoOfClasses = GetANumb(userinput);
		schoolTotal = multNumb(NoOfClasses,totalClass);
		System.out.println("Total Number of students in School = "+schoolTotal);
		
		double Teachers, subjects;
		System.out.println("Enter Number of Subjects");
		subjects = GetANumb(userinput);
		
		Teachers = divNumb(multNumb(NoOfClasses,totalClass),subjects);
		System.out.print("There are "+Teachers);
		System.out.print("Teachers");
		userinput.close();
		double faculty;
		faculty = subNumb(divNumb(schoolTotal,Teachers),0);
		
	}

	/**Checks whether given number is positive or not
	 * @param userinput gets a number from userinput
	 * @return
	 */
	private static double GetANumb(Scanner userinput)
	{
		double ANumber=0.0;
		String inputvalue = userinput.next();
		while( Double.parseDouble(inputvalue) <= 0)
		{
			System.out.println("This is not a positive number, Try Again");
			inputvalue = userinput.next();
		}
		ANumber = Double.parseDouble(inputvalue);
		return ANumber;
	}

	/**Add 2 numbers together passed as parameters first number and second number
	 * @param firstNumb 
	 * @param secondNumb
	 * @return
	 */
	public static double addNumb(double firstNumb, double secondNumb)
	{
		double totalValue = 0.0;
		totalValue=firstNumb+secondNumb;
		return totalValue;
	}
	
	/** Subtracts 2 numbers together passed as parameters first number and second number
	 * @param fNumb
	 * @param sNumb
	 * @return
	 */
	public static double subNumb(double fNumb, double sNumb)
	{
		double TotalV=0.0;
		TotalV=fNumb-sNumb;
		return TotalV;
	}
	
	/**Multiplys  2 numbers together passed as parameters first number and second number
	 * @param fNumb
	 * @param sNumb
	 * @return
	 */
	public static double multNumb(double fNumb, double sNumb)
	{
		double TotalV = 0.0;
		TotalV= fNumb * sNumb;
		return TotalV; 
	}
	
	/**Divides 2 numbers together passed as parameters first number and second number
	 * @param fNumb
	 * @param sNumb
	 * @return
	 */
	public static double divNumb(double fNumb, double sNumb)
	{
		double TotalV = 0.0;
		TotalV = fNumb/sNumb;
		return TotalV;
	}


}

