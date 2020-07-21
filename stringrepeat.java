public class stringrepeat{
    public static void main(String[] args){
        //*To repeat a string n times
        String a = "abc";
        //*This only works in new versions of java though
        System.out.println(a.repeat(3));
        //*A break statement works exactly like in python

        //*How to find the index of a substring in java
        String test = "abcdabc";

        //*The indexOf() method returns the first occurence of a substring
        System.out.println(test.indexOf("ab"));
        //*To search after a specific index, add an argument
        System.out.println(test.indexOf("ab", 3));
        //*If the substring doesn't exist, an int of -1 will be returned
        System.out.println(test.indexOf("e"));
        //Try https://codingbat.com/prob/p186759 using this method
        
    }
}