import java.util.Comparator;
import java.util.Objects;

public class Bag implements Comparator<Bag>{
    private String brand;
    private String color;
    private int price;
    private String type;
    private int discount;
    private double rating;

    // @Override
    public String toString(){
      return "\nbrand"+brand+"\ncolor"+color+"\nprice"+price+"\ntype"+type+"\ndiscount"+discount+"\nrating"+rating;
    }

    public Bag(String brand, String color, int price, String type, int discount, double rating)
    {
        this.brand=brand;
        this.color=color;
        this.price=price;
        this.type=type;
        this.discount=discount;
        this.rating=rating;
    }

    public String getbrand()
    {
      return brand;
    }
    public void setbrand(String brand)
    {
     this.brand=brand;
    }

    public String getcolor()
    {
      return color;
    }
    public void setcolor(String color)
    {
      this.color=color;
    }

    public int getprice()
    {
     return price;
    }
     public void setprice(int price)
    {
     this.price=price;
    }

    public String gettype()
    {
     return type;
    }
     public void settype(String type)
    {
     this.type=type;
    }

    public int getdiscount()
    {
     return discount;
    }
    public void setdiscount(int discount)
    {
      this.discount=discount;
    }

    public double getrating()
    {
      return rating;
    }
     public void setrating(double rating)
    {
       this.rating=rating;
    }
    
     @Override
    public int hashCode()
    {
      return Objects.hash(brand,color,price,type,discount,rating);

    }
   @Override
   public boolean equals(Object obj){
    if(this == obj)
    return true;
    if(obj == null || getClass() != obj.getClass())
    return false;
    Bag bag=(Bag) obj;
    return brand.equals(bag.brand) && color.equals(bag.color) && Double.compare(price, bag.price) == 0 && type.equals(bag.type) && Double.compare(rating, bag.rating) == 0 && discount == bag.discount;
   }

    @Override
    public int compare(Bag a1, Bag a2){
      if(a1.getbrand()==a2.getbrand())
      {
        return 1;
      }else{
        return 0;
      }
    }

   
}