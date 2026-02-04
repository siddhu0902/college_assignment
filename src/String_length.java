public class String_length {
    public static String reverse1(String s1){
        String s2 = "";
        int len1=s1.length();
        for(int i=1;i<len1+1;i++){
            s2 = s2+s1.substring(len1-i,len1+1-i);
        }
        return s2;
    }
    public static void main(String[] args){
        String name1="Welcome";
        String name1_rev = reverse1(name1);
        System.out.println(name1+"-"+name1_rev);
    }
}
