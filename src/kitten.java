class cats{
   static boolean stripes= true; static String eyes= "green";
static int legs= 4; static boolean indoor= true; 
}
   

public class kitten extends cats {
    static  String kittenName = "Kiera";
    static int kittenAge= 5;
    static double mouseEaten = 3.5;

    public static void main(String[] args) {
        System.out.print("Here we have my little five year old kitten whose name is " + kittenName ) ;
        System.out.print(". As I have said she is "); System.out.print( kittenAge);
        System.out.print( " and well she's always satiated, which I guess isn't surprising given the approximate number of mice she eats per day: " ); System.out.print(mouseEaten);
    }  
}

// add another class with tiger maybe and code that and from there also see what public static method I will put, also my main could maybe go to my cats then I have a differnt method for kitten so that I don't have to worry even if I comment it out.