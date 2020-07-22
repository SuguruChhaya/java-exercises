/**
 * stringslicing
 */
public class stringslicing {

    public static void main(String[] args) {
        //*When index slicing a string, use .substring(index1, index2)
        System.out.println("abc".substring(1, 3));
        //!A weird thing is that if there is only one value like 0, it returns from that index to the end.
        System.out.println("abc".substring(0));    
        System.out.println("abc" == "abc");   
        //*A different way to do this is:
        System.out.println("abc".equals("abc"));
        String a = "abcd";
        System.out.println(a.substring(0,3));
        System.out.println(a.substring(0,3)== "abc");
        //?Apparently, the substring method creates a new string and comparisons result to false
        String b = a.substring(0, 3);
        System.out.println(a.substring(0,3).equals("abc"));
        //*This shows that a substring, even if it is stored by a variable doesn't equal to other strings. I have to use the .equals method.
        System.out.println(b == "abc");

        //*Deleting a item in a string by index.
        //System.out.println(a.replace());
        //*The following program can remove the nth item from a string
        int n = 1;
        System.out.println(a.substring(0, n) + a.substring(n+ 1));

        
    }
}