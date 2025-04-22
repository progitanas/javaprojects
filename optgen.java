import java.util.Random;

public class otp{
    static char[] OTP(int len){
        System.out.println("Generating OTP using Random() :");
        System.out.print("You OTP is :");

        String numbers = "0123456789";
        Random otprand = new Random();

        char[] otp = new char[len];
        for(int i = 0; i<len; i++){
            otp[i] = numbers.charAt(otprand.nextInt(numbers.length()));
        }
        return otp;
    }
    public static void main(String[] args) {
        int length = 6;
        System.out.println(OTP(length));
    }
}
