package Recursive;

public class Rekursion {

    public Rekursion() {
    }

    //Opgave 1:
    public int pow(int x, int n) {
        int i = 1;
        for (int j = 0; j < n; j++) {
            i = i * x;
        }
        return i;
    }
    public int powR(int x, int n) {
        if (n == 0) return 1;
        return x * powR(x, n-1);
    }

    //Opgave 2:
    public int fak(int n) {
        int result = n;
        for (int i = 1; i < n; i++) {
            result = result * (n-i);
        }
        return result;
    }
    public int fakR(int n) {
        if (n == 0) return 1;
        return n * fakR(n-1);
    }

    //Opgave 3:
    public int fib(int n) {
        int result = 0;
        int first = 0;
        int second = 1;
        if (n == 1) return 0;
        if (n == 2) return 1;
        for (int i = 0; i < n-1; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
    public long fibR(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibR(n-1) + fibR(n-2);
    }

    //Opgave 4:
    public static int countR(String str, char a) {
        int result = 0;
        if (str.length() > 0)
            result = countR(str.substring(1), a) + ((str.charAt(0) == a) ? 1 : 0);
        return result;
    }
    public static int count(String str, char ch) {
        int result = 0;
        if (str.length() > 0)
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) result++;
            }
        return result;
    }

    //Opgave 5:
    public int countNumbR(int[] arrTal, int length , int n){
        if (length > 0) return countNumbR(arrTal, length - 1, n) + ((n == arrTal[length]) ? 1 : 0);
        return 0;
    }

    //Opgave 6:
    public String reverseDisplay(String value) {
        return reverseDisplay(value,0);
    }
    public String reverseDisplay(String value, int index) {
        if (value.length()-1 >= index) {
            return reverseDisplay(value, index + 1) + value.charAt(index);
        }
        return "";
    }
    public String reverseString(String value, int index){
        String str = "";
        for (int i = index; i >= 0; i--) {
            str += value.charAt(i);
        }
        return str;
    }

    //Opgave 7:
    public void arrReverseR(int[] arrR, int start, int end){
        if (start < end){
            int temp = arrR[start];
            arrR[start] = arrR[end];
            arrR[end] = temp;
            arrReverseR(arrR,start+1,end-1);
        }
    }

    //Opgave 8:
    public String dec2HexIterativt(int value){
        if (value == 0)
            return "";
        else {
            String hexString = "";
            int checkExp = 0;
            int trueExp = 0;
            int hexVal;
            boolean loop = true;
            while (loop) {
                if ((value/Math.pow(16, checkExp)) >= 1) {
                    trueExp = checkExp;
                    checkExp++;
                }else{
                    loop = false;
                    while (trueExp != -1){
                        hexVal = (int)(value/Math.pow(16, trueExp));
                        hexString += dec2HexChar(hexVal);
                        value = (int)(value - hexVal*Math.pow(16, trueExp));
                        trueExp--;
                    }
                }
            }
            return hexString;
        }
    }
    public char dec2HexChar(int value) {
        if (value >= 10 && value <=15)
            return (char)('A' + value - 10);
        else
            return (char)('0' + value);
    }
    public String dec2Hex(int value) {
        if (value == 0)
            return "";
        else {
            return dec2Hex(value / 16) + dec2HexChar(value % 16);
        }
    }

    //Extra opgave:
    public boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        else if (s.charAt(0) != s.charAt(s.length() -1)) return false;
        else return isPalindrome(s.substring(1, s.length() -1));
    }
}
