import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class App {

    static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) {
    
      LinkedList<Bag> b=new LinkedList<>();
      b.add(new Bag(" LV", " black", 600, " handbag", 10, 4.5));
      b.add(new Bag(" Chanel", " black",  600, " CarryBag", 10,  1.5));
      b.add(new Bag(" Hermes", " white",  500, " Clutch", 15, 3.5));
      b.add(new Bag(" Dior", " pink",  700, " TrollyBag", 13,  2.6));
      b.add(new Bag(" MCQueen", " red-dark", 400, " Satchel", 20,  3.2));
      b.add(new Bag(" Chanel", " black-bright", 300, " Crossbody", 30, 3.1));
      b.add(new Bag(" Hermes", " sky-blue", 800, " Shoulder Bag", 18, 2.5));
      b.add(new Bag(" MCQueen", " black", 900, " Clutch", 15,  3.3));
      b.add(new Bag(" Dior", " black",  1000, " Laggage", 30,  4.2));
      b.add(new Bag(" AmericanTraveller", " black", 2000, " Parse", 5,  3.7));

      // System.out.println(b);

  System.out.println("Enter your choice");
  System.out.println("1 for sorting bag as brand");
  System.out.println("2 for sorting bag as color");
  System.out.println("3 for sorting bag as price");
  System.out.println("4 for sorting bag as type");
  System.out.println("5 for sorting bag as rating");
  System.out.println("6 for sorting bag as discount");
  int s=sc.nextInt();
  switch (s) {
      case 1:
              System.out.println("Choice your brand");
              System.out.println("LV");
              System.out.println("Chanel");
              System.out.println("Dior");
              System.out.println("MCQueen");
              System.out.println("Hermens");
              // String b=sc.nextLine();
              // if(getbrand.toString.getbrand(b).equalsto.getbrand)

              System.out.println("Sorting  bag as brand");
              Collections.sort(b, new BrandSort());    // brand
              System.out.println(b);
              break;
      case 2:         
              System.out.println("Sorting bag as color");
              Collections.sort(b, new ColorSort());   // color
              System.out.println(b);
              break;
      case 3: 
              System.out.println("Sorting bag as price");
              Collections.sort(b, new AppBagSort());  // price
              System.out.println(b);  
              break;
      case 4: 
              System.out.println("Sorting bag as Type");  
              Collections.sort(b, new TypeSort());     // type of bag
              System.out.println(b); 
              break;
      case 5: 
              System.out.println("Sorting bag as Rating"); 
              Collections.sort(b, new RatingSort());    // rating
              System.out.println(b); 
              break;
      case 6:
             System.out.println("Sorting bag as Discount");    
             Collections.sort(b, new DiscountSort());   // Discount
             System.out.println(b); 
             break;              
      default:
             System.out.println("Invalid Choice");
              break;
  }
  }
}
