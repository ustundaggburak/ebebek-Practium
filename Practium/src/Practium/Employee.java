package Practium;

public class Employee {

	private final int YIL = 2021;
	private String name;
	private double salary, workHours;
	private int hireYear;

	public Employee (String name, double salary, double workHours, int hireYear) { //Constructor kurucu method
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	
	public double tax() { //Calisana ait vergi hesaplanmasi
		if (salary > 1000) {
			return salary*0.03;
		}
		else{
			return 0;
		}
	}
	
	public double bonus() { //Calisana ait ek mesai bonusu
		if (workHours > 40) {
			return  (workHours-40)*30;
		}
		else {
			return 0;
		}
	}
	
	public double raiseSalary() { //Calisanin seneye gore aldigi zam miktari
		if (YIL - hireYear < 10) {
			 return salary*0.05;
		}
		else if(YIL - hireYear >= 10 && YIL - hireYear < 20) {
			return  salary*0.10;
		}
		else {
			return  salary*0.15;
		}
	}
	
	public String toString() { //Hesaplamalar ve Cikti
		return "Adi : " + name + '\n' +
			   "Maasi : " + salary + '\n' +
			   "Calisma Saati : " + workHours + '\n' +
			   "Baslangic Yili : " + hireYear + '\n' +
			   "Vergi : " + tax() + '\n' +
			   "Bonus : " + bonus() + '\n' +
			   "Maas Artisi : " + raiseSalary() + '\n' +
			   "Vergi ve Bonuslar ile birlikte maas : " + (salary - tax() + bonus()) + '\n' +
			   "Toplam Maas : " + (salary - tax() + bonus() + raiseSalary());
	}
}
