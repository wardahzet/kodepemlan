import java.util.Scanner;

public class SuratKaisar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.nextLine();
        int geser = sc.nextInt();
        for (int i = 0; i < kata.length(); i++){
            System.out.print(sandi(kata.charAt(i),geser));
        }
    }

    static char sandi (char huruf, int geser){
        if (huruf + geser > 'z') {
            huruf = (char) (huruf - 26);
        }
        if (huruf < 'a' && huruf + geser > 'Z') {
            huruf = (char) (huruf - 26);
        }
        if (huruf == ' ') return ' ';
        return (char) (huruf + geser);
    }
}
