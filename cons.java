class SprCls
{
	SprCls()
	{
		System.out.println("SUPER CLASS");
	}
	SprCls(String nm)
	{
		System.out.println(nm);
	}
	SprCls(int nm)
	{
		System.out.println(nm);
	}
 void displ()
 {
	 
	 System.out.println("Display() of SUPER CLASS");
 }
}
class Sub extends SprCls
{
	Sub()
	{
		super(111);
		System.out.println("SUB CLASS");
	}
	void displ()
   {
	 
	 System.out.println("Display() of SUB CLASS");
   }
   public static void main (String s1[])
   {
	   Sub s=new Sub();
	   s.displ();
   }
}
