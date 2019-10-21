package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Std 
{
	@Id
	private int rno;
	private String name;
	
	@OneToOne
	private Addr a;

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Addr getA() {
		return a;
	}

	public void setA(Addr a) {
		this.a = a;
	}
}
