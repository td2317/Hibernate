import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NewClass {
    public static void main(String[] args) {
        Configuration config = new Configuration().configure();
        SessionFactory factory = config.buildSessionFactory();
        System.out.println("Hibernate SessionFactory created successfully");
    }
}

