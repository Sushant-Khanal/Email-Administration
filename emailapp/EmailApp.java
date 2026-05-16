package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email em1 = new Email("Sushant", "Khanal");
        

        em1.setAlternateEmail("sk@gmail.com");
        
        System.out.println(em1.showInfo());
        System.out.println("Alternate Email: " + em1.getAlternateEmail());



    }
    
}
