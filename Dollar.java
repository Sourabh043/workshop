package converter;
import java.util.*;
public class Dollar{
public void Convert(){
double inr,usd,doll;
System.out.println("\nDollar to INR");
Scanner in=new Scanner(System.in);
System.out.print("Enter INR to convert into USD : ");
inr=in.nextDouble();
System.out.print("Enter Current USD reate : ");
doll=in.nextDouble();
usd=inr/doll;
System.out.println("\n INR="+inr+"\n USD="+usd);
}
}
// Compute.java
import Converter.Dollar;
public class ompute {
public static void main(String s[]){
Dollar d=new Dollar();
d.Convert();
}
}
