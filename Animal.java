class Animal 
{
	void show()
	{
		System.out.println("This is Animal class");
	}
}
class Dog extends Animal
{
	 Dog()
	 {
		 super.show();
	 }
	 void show()
	 {
		 System.out.println("This is DOG class");
	 }
	 public static void main(String s[])
	 
	 {
		 Dog d=new Dog();
		 d.show();
	 }
}


