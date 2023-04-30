package Spring_1;

public class Driver {
   private Transport transport;
   private String name;

   public Transport getTransport() {
      return transport;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Driver(Transport transport, String name) {
      this.transport = transport;
      this.name = name;
   }

   public void startTheTransport() {
      System.out.println(name + " сел в " + transport.getMarka());
   }

}
