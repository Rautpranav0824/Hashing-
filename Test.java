public class Test {
    public static void main(String[] args) {
        int[] hash = new int[10];
        String abc = "abc";
        char ch = abc.charAt(0);
        hash[ch-'a']=5;
        System.out.println(hash[ch-'a']);
    }
}
