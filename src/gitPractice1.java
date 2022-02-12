public class gitPractice1 {
    public static void main (String[]args){
        String str = "My name is Amelia";
        int k = 0;
        for(int i =0; i < str.length(); i++){
            k = i;
            while(k != 0) {
                System.out.print(" ");
                k--;
            }
            System.out.println(str.charAt(i));
        }

    }
}
