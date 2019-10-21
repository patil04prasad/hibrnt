package Model;

import javax.persistence.Entity;

@Entity
public class Addr 
{
	private String loc;
	private String per;
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getPer() {
		return per;
	}
	public void setPer(String per) {
		this.per = per;
	}
}
