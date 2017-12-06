package firstProjectJava;

public class EmailApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstProject em1  = new FirstProject();
		em1.setAlternateEmail("nice@gmail.com");
		String alternateEmail = em1.getAlternateEmail();
		em1.showInfo();
		System.out.println(em1.showInfo());
		
	}
	
}