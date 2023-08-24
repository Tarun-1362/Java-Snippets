package Interfaces;


	class Student extends Person
	{
		int rollno;
		int marks;
		

		Student(String name, int age, int height, int weight,int rollno,int marks) {
			super(name, age, height, weight);
			this.rollno=rollno;
			this.marks=marks;
			
			// TODO Auto-generated constructor stub
		}
		public static void main(String[] args) 
		{
			Student S1= new Student("tarun", 22, 6, 70, 3, 879);
			System.out.println(S1.name);
			System.out.println(S1.age);
			System.out.println(S1.height);
			System.out.println(S1.weight);
			System.out.println(S1.rollno);
			System.out.println(S1.marks);


		}

}
