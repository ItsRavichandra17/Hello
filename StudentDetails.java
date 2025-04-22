public class StudentDetails 
{
	static String instituteName="Prashanthi High School";
	String name;
	int id;
	StudentDetails(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args)
       {
		
      StudentDetails std1=new StudentDetails("Ravi",001);
      System.out.println("Institute Name:"+instituteName+"\nStudent name:"+std1.name+"\nStudent Id:"+std1.id);
      StudentDetails std2=new StudentDetails("Bhanu",002);
      System.out.println("Institute Name:"+instituteName+"\nStudent name:"+std2.name+"\nStudent Id:"+std2.id);
      StudentDetails std3=new StudentDetails("Ashar",003);
      System.out.println("Institute Name:"+instituteName+"\nStudent name:"+std3.name+"\nStudent Id:"+std3.id);
	}
}