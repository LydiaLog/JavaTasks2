
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("kim" , 1200000, "0101111111");
		Employee e2 = new Employee("lee" , 1000000, "0101124422");
		Employee e3 = new Employee("park" , 120000, "0101115713");
		Manager m1 = new Manager("choi", 3000000, "01020406948", 800000);
		Manager m2 = new Manager("yoon", 3200000, "01029573948", 900000);
		Manager m3 = new Manager("shin", 3400000, "01090484948", 700000);
		
		e1.calIncome();
		e2.calIncome();
		e3.calIncome();
		e1.display();
		e2.display();
		e3.display();
		
		e1.setData(2000000);
		e1.calIncome();
		e1.display();
		
		e2.setData(3000000);
		e2.calIncome();
		e2.display();
		
		e3.setData(4000000);
		e3.calIncome();
		e3.display();
		
		System.out.println( e1.getPay() );
		System.out.println( e2.getPay() );
		System.out.println( e3.getPay() );
		
		System.out.println(Employee.getEmployeeCount());
		
		m1.calIncome();
		m2.calIncome();
		m3.calIncome();
		m1.display();
		m2.display();
		m3.display();
		
		m1.setData(4000000);
		m1.calIncome();
		m1.display();
		
		m2.setData(5000000);
		m2.calIncome();
		m2.display();
		
		m3.setData(6000000);
		m3.calIncome();
		m3.display();
		
		System.out.println( m1.getPay() );
		System.out.println( m2.getPay() );
		System.out.println( m3.getPay() );
		
		System.out.println(Employee.getEmployeeCount());
		

	}

}
