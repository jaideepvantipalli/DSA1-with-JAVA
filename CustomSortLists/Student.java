import java.util.*;
public class Student{
	int rollno,marks;
	String sname,branch;
	double cgpa;
	Student(int rollno,String sname,String branch,int marks,double cgpa){
	this.rollno=rollno;
	this.sname=sname;
	this.branch=branch;
	this.marks=marks;
	this.cgpa=cgpa;
	}
    public String toString() {
            return "Name: " + sname +
                   ", Roll No: " + rollno +
                   ", branch: " + branch +
                   ", Marks: " + marks +
                   ", CGPA: " + cgpa;
    }
}
class Main{
	public static void main(String[] args){
	ArrayList<Student> al = new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of records:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
		System.out.println("Enter student "+i+" roll no :");
		int rno=sc.nextInt();
		System.out.println("Enter student "+i+" name :");
		String name=sc.next();
		System.out.println("Enter student "+i+" branch :");
		String br=sc.next();
		System.out.println("Enter student "+i+" marks :");
		int marks=sc.nextInt();
		System.out.println("Enter student "+i+" cgpa :");
		double gpa=sc.nextDouble();
		Student s1= new Student(rno,name,br,marks,gpa);
		al.add(s1);
	}
	System.out.println("Before Sorting");
	for(Student s1:al){
		System.out.println(s1);
	}
while(true){
System.out.println("1.SortByRollnoAscending");
System.out.println("2.SortByRollnoDescending");
System.out.println("3.SortByNameAscending");
System.out.println("4.SortByNameDescending");
System.out.println("5.SortByBranchAscending");
System.out.println("6.SortByBranchDescending");
System.out.println("7.SortByMarksAscending");
System.out.println("8.SortByMarksDescending");
System.out.println("9.SortByCgpaAscending");
System.out.println("10.SortByCgpaDescending");
System.out.println("11.Exit");
System.out.println("Enter sorting CHOICE : ");
int choice=sc.nextInt();
switch (choice) {
  case 1:
    Collections.sort(al,new SortByRollnoAscending());
    break;
  case 2:
    Collections.sort(al,new SortByRollnoDescending());
    break;
  case 3:
    Collections.sort(al,new SortByNameAscending());
    break;
  case 4:
    Collections.sort(al,new SortByNameDescending());
    break;
  case 5:
    Collections.sort(al,new SortByBranchAscending());
    break;
  case 6:
    Collections.sort(al,new SortByBranchDescending());
    break;
  case 7:
    Collections.sort(al,new SortByMarksAscending());
    break;
	case 8:
    Collections.sort(al,new SortByMarksDescending());
    break;
  case 9:
    Collections.sort(al,new SortByCgpaAscending());
    break;
  case 10:
    Collections.sort(al,new SortByCgpaDescending());
    break;
	case 11:
	System.exit(0);
   default:
   System.out.println("Enter valid Choice!!!!");
}
System.out.println("After Sorting");
	for(Student s1:al){
		System.out.println(s1);
	}
}
}
sc.close();
}