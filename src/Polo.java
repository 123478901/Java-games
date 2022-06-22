class VW
{
   String colour= "red";
  String transmission = " manual";
   int modelYear= 2019;
}


public class Polo extends VW
{
    public Polo ( String name){
      System.out.println("This here is the car: " + name);
    }
   public static void main(String[] args) {
   Polo trendline =new Polo( "POLO");
    System.out.println(" Below are the cars stats:");
    System.out.println(trendline.transmission + trendline.colour + trendline.modelYear);
    }
} 
         
 