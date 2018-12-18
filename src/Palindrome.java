public class Palindrome {
    public boolean ispalindrome(String one, String two){
        int i       =   0;
        int laenge  =   two.length();
            one     =   one.toLowerCase();
            two     =   two.toLowerCase();
        if (one.length()    !=  laenge){
            System.out.println("These two don't even have the same length!");
            return false;
        }
        while (i    <   laenge){
                if (one.charAt(i)    !=  two.charAt((laenge-1)-i)){
                    System.out.println("Not a palindrome.");
                    return false;
                }
                i++;
            }
        System.out.println("It is indeed a palindrome!");
        return true;
    }
}