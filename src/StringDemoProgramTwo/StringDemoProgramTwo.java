
package StringDemoProgramTwo;

/**
 *
 * @author nayeem
 */
public class StringDemoProgramTwo {
    public static void main(String[]args)
    {
    String fname="Mohammad";
    String lname="Nayeem";
    String FullName=fname.concat(lname);
    System.out.println(FullName);
    int length=FullName.length();
    System.out.println(length);
    String UpperCase=FullName.toUpperCase();
    System.out.println(UpperCase);
    String LowerCase=FullName.toLowerCase();
    System.out.println(LowerCase);
    boolean m=fname.startsWith("M");
    System.out.println(m);
    boolean n=fname.startsWith("N");
    System.out.println(n);
    
    
    
    
    
    
    
    }
    
}
