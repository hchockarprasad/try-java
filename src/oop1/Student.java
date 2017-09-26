//periskar
import java.util.Scanner;

class Student{
	public static void main(String a[]){
		int n;
		System.out.println("\nEnter Number of students : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String rollno[] = new String[n];
		String name[] = new String[n];
		float cgpa[] = new float[n];
		String prg_name[] = new String[n];	
		String skl_name[] = new String[n];
		String pro_name[] = new String[n];	
		for(int i=0;i<n;i++){
			System.out.println("\nEnter Registration Number : ");	
			rollno[i] = sc.next();
			sc.nextLine();
			System.out.println("\nEnter Name : ");
			name[i] = sc.nextLine();	
			System.out.println("\nEnter CGPA : ");
			cgpa[i] = sc.nextFloat();
			sc.nextLine();
			System.out.println("\nEnter Programme Name : ");
			prg_name[i] = sc.next();
			sc.nextLine();
			System.out.println("\nEnter School Name : ");
			skl_name[i] = sc.nextLine();
			System.out.println("\nEnter Proctor Name : ");
			pro_name[i] = sc.nextLine();
		}
		for(int i=0;i<n;i++){
			System.out.println("\nRegistration Number : "+rollno[i]+"\nName : "+name[i]+"\nCGPA : "+cgpa[i]+"\nProgramme Name : "+prg_name[i]);
			System.out.println("School Name : "+skl_name[i]+"\nProctor Name : "+pro_name[i]);
		}
		sc.close();
	}
}