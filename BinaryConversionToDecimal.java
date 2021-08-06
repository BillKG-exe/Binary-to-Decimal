//Billy Ouattara
//CSP 26B - Fall 2020
//Take Home Final Exam - Question 01

import java.util.Scanner;

public class BinaryConversionToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        String binStr = "";

        while(!isValid) {
            System.out.print("Enter a binary string:\t");
            binStr = input.nextLine();
            isValid = isValidBinary(binStr);
        }

        System.out.print(binStr +" into decimal is: ");
        System.out.println(bin2Dec(binStr));
    }

    public static int bin2Dec(String binaryString) {
        if(binaryString.length() > 0) {
            BinQueue queue = new BinQueue(binaryString);
            int val = queue.dequeue() * (int)Math.pow(2, queue.power());
            return val + bin2Dec(queue.toString());
        }
        return 0;
    }

    public static boolean isValidBinary(String str) {
        for(int index = 0; index < str.length(); index++) {
           char binChar = str.charAt(index);
           if(binChar == ' ') {
               continue;
           } else if(!Character.isDigit(binChar)) {
               System.out.println("ERROR: Binary string is invalid\n");
               return false;
           } else if(binChar != '1' && binChar != '0'){
               System.out.println("ERROR: Binary contains only 1's and 0's\n");
               return false;
           }
        }
        return true;
    }
}