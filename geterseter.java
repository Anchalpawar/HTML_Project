class twomethod
{
	private String a;
	private int age;
	 void set(String b)
	{
		a=b;
	}

	String gett()
	{
		return a;
	}

void sett(int ages)
{
	age=ages;
}
int get()

{
	return age;
}
class geterseter
{
	
	public static void main(String[]args)
	{
	twomethod obje=new twomethod();
	obje.set("Anchal Panwar");
	twomethod obj2=new twomethod();
	obj2.sett(26);
	System.out.println(obje.gett());
	System.out.println(obj2.get());
	}

	}
}
