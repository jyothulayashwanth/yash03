package com.yash;
class Stu{
	
	int id;
	String Name;
	int year;
	String Branch;
	public Stu(int id, String name, int year, String branch) {
		super();
		this.id = id;
		Name = name;
		this.year = year;
		Branch = branch;
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", Name=" + Name + ", year=" + year + ", Branch=" + Branch + "]";
	}	
}

public class Test{
	public static void main(String [] a) {
		
Stu s1 = new Stu(01,"Mani",3,"CSG");
System.out.println(s1);
Stu s2 = new Stu(01,"Deepak",3,"CSG");
System.out.println(s2);
Stu s3 = new Stu(01,"Venu Gopal",3,"CSG");
System.out.println(s3);
Stu s4 = new Stu(01,"Rahul",3,"CSG");
System.out.println(s4);
	}
}