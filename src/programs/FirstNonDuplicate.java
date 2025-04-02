package programs;

public class FirstNonDuplicate {

    public static void main(String[] args) {

        char ch = 'e';
        int frequency = 2; // Assume 'e' appears twice
        String repeated = String.valueOf(ch).repeat(frequency);
        System.out.println("Repeated:"+repeated);

        String s = "Anand";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        s = s.toLowerCase();
        for (Character ch: s.toCharArray() ) {
            if(getCount(ch, s) < 2 ){
                return s.indexOf(ch);
            }
        }

        return 0;
    }

    static long getCount(Character ch, String s){
        return s.chars().filter(c -> c == ch ).count();
    }
}
