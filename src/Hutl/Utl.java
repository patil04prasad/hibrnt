package Hutl;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import Model.Addr;
import Model.Std;

public class Utl 
{
	private static StandardServiceRegistry r;
	private static SessionFactory sf;
	public static SessionFactory getsf()
	{
		if(sf==null)
		{
			Map<String, Object>m=new HashMap<String, Object>();
			m.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			m.put(Environment.USER,"root");
			m.put(Environment.PASS,"root");
			m.put(Environment.URL,"jdbc:mysql://localhost:3306/hi5");
			m.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
			m.put(Environment.HBM2DDL_AUTO,"update");
			m.put(Environment.SHOW_SQL,"true");
			
			r=new StandardServiceRegistryBuilder().applySettings(m).build();
			
			MetadataSources mds=new MetadataSources(r);
			
			mds.addAnnotatedClass(Std.class);
			mds.addAnnotatedClass(Addr.class);
			
			Metadata md=mds.getMetadataBuilder().build();
			
			sf=md.getSessionFactoryBuilder().build();
		}
		return sf;
	}
}
