import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConf.class);

       Transport transport1 = context.getBean(Car.class);
        transport1.startTheTransport();
        Transport transport2 = context.getBean(Bus.class);
        transport2.startTheTransport();
        Transport transport3 = context.getBean(Pickup.class);
        transport3.startTheTransport();


        Driver driver1 = context.getBean("driver", Driver.class);
        driver1.startTheTransport();
        Driver driver2 = context.getBean("driver2", Driver.class);
        driver2.startTheTransport();
        Driver driver3 = context.getBean("driver3", Driver.class);
        driver3.startTheTransport();
    }


}
