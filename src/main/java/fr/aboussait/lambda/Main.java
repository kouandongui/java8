package fr.aboussait.lambda;

public class Main {

	public static void main(String[] args) {
		IManagerStream managerStream = new ManagerStream();
		//managerStream.displayPerson(managerStream.getAll()); 
		//managerStream.displayPerson(managerStream.getMineur()); 
		//managerStream.getMineur();
		
		System.out.println("majeur");
		managerStream.getMajor().forEach(p->System.out.println(p));
		System.out.println("mineur");
		managerStream.getMineur().forEach(p->System.out.println(p));
		System.out.println("is isParallel ArrayList ? " + managerStream.getAll().isParallel());
		

	}

}
