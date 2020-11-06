public class Palindrom {
    static boolean foo(int i, String str){
        if(i==str.length()-i-1 && str.length()%2!=0) {
            return true;
        }
        if(i==str.length()/2-1 && str.length()-i-1==str.length()/2 && str.length()%2==0 && str.charAt(i)==str.charAt(str.length()-i-1)) {
            return true;
        }
        if(str.charAt(i)==str.charAt(str.length()-i-1)) {
            return foo(i + 1, str);
           // System.out.println(str.charAt(i)+" !!! "+ str.charAt(str.length()-i-1));
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(foo(0,"afada"));
    }

}
