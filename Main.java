import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Recursividade r = new Recursividade();
        System.out.println(r.Fatorial(5));
        System.out.println(r.Somatorio(5));
        System.out.println(r.Fibonacci(6));
        System.out.println(r.RecursivoSomatorio(1, 5));
        System.out.println(r.isPal("ovo"));
        System.out.println(r.convBase2(10));
        int[] array = {1,2,3,4,5};
        ArrayList<Integer> ArrayInt = new ArrayList<>();
        ArrayInt.add(110);
        ArrayInt.add(12);
        ArrayInt.add(3);
        ArrayInt.add(6);
        ArrayInt.add(2);
        String ab = "abcdef";
        String cd = "cd";


        System.out.println(r.calculaSomatorioArray(array, array.length-1));
        System.out.println(r.findBiggest(ArrayInt, ArrayInt.size() - 1));
        System.out.println(r.findSubString(ab,cd, 0, 0));
    }
    //1 Fatorial
}
    class Recursividade{
        
    
    public int Fatorial(int n){
        if(n == 0){
            return 1;
        }
        return n * Fatorial(n-1);
    }


    //2

    public int Somatorio(int n){
        if(n == 0){
            return 0;
        }
        return n + Somatorio(n-1);
    }

    //3

    public int Fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }


    //4

    public int RecursivoSomatorio(int k, int j) {
        if(k == j){
            return k;
        }
        return k + RecursivoSomatorio(k+1, j);

    }

    //5

    public boolean isPal(String palavra){
        if(palavra.length() == 0 || palavra.length() == 1){
            return true;
        }
        if(palavra.charAt(0) == palavra.charAt(palavra.length()-1)){
            return isPal(palavra.substring(1, palavra.length()-1));
        }
        return false;
    } 

    //6

    public String convBase2(int n){
        if(n < 0 ){
            return "Número inválido";
        }
        
        if(n == 0){
            return "0";
        }
        if(n == 1){
            return "1";
        }
        return convBase2(n/2) + n%2;
    }

    //7

    public int calculaSomatorioArray(int[] array, int n){
        if(n == 0){
            return array[0];
        }
        return array[n] + calculaSomatorioArray(array, n-1);
    }

    //8

    public int findBiggest(ArrayList<Integer> array, int n){
        if(n == 0) {
            return array.get(n);
        }

        if (array.get(n) > findBiggest(array, n - 1)) {
            return array.get(n);
        } else {
            return findBiggest(array, n - 1);
        }
    }

    //9

    public boolean findSubString(String str, String match, int n1 , int n2)  {
        if (str.length() < match.length()) {
            return false;
        }
        
        if (str.length() == n1) {
            return false;
        }
        
        if (match.length() == n2) {
            return true;
        }

        if(str.charAt(n1) == match.charAt(n2)) {
            return findSubString(str, match, n1+1, n2+1);
        }

        return findSubString(str, match, n1+1, 0);
    }  
}
