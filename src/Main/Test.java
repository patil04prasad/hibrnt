package Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Hutl.Utl;
import Model.Addr;
import Model.Std;

public class Test 
{
	public static void main(String args[])
	{
		Addr a=new Addr();
		a.setLoc("A");
		a.setPer("D");
		
		Std s=new Std();
		s.setName("Avi");
		s.setRno(1);
		//s.setA(a);
		
		SessionFactory sf=Utl.getsf();
		Session ss=sf.openSession();
		
		//ss.save(a);
		ss.save(s);
		
		ss.beginTransaction().commit();
	}
}
