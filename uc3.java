public class uc3{
	public static void main(String[] args){
		int IS_PART_TIME=1;
		int EMP_RATE_PER_HOUR = 20;
		int emphrs = 0;
		int empwage = 0; 
		double empcheck = Math.floor(Math.random()*10) % 2;

		if(empcheck == IS_PART_TIME)
			emphrs = 8;
		else
			emphrs = 0;
			empwage = emphrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage: " + empwage);
		}
}
