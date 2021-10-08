package Encapsulation;

public class Encapsulation1 {

	private String empname;
	private int empage;
	private int Ssn;

	public static void main(String[] args) {

		Encapsulation1 e1 = new Encapsulation1();
		e1.setEmpname("Krishna");
		e1.setEmpage(25);
		e1.setSsn(123456);
		System.out.println("Employee name : "     + e1.getEmpname());
		System.out.println("Employee age : " + e1.getEmpage());
		System.out.println("Employee ssn number : " + e1.getSsn());
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

	public int getSsn() {
		return Ssn;
	}

	public void setSsn(int ssn) {
		Ssn = ssn;
	}

}
