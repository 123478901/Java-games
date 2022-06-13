class VW{
  static String colour= "red";
static  String transmission = " manual";
  static int modelYear= 2019;
}


public class cars extends VW{
    public cars ( String name){
      System.out.println("This here is the car: " + name);
    }
   public static void main(String[] args) {
    new cars( "POLO");
    System.out.println("Below are the cars stats:");
    System.out.println(colour + transmission+ modelYear);
    }
  }
 
  //  public static void main(String[] args) {
           
         
 