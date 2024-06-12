package miniProjects;

public class isPrimeNumber {
    public static void main(String[] args) {
        int number = 10;
        boolean isPrime = true;
        for (int i = 2; i<number; i++){
            if (number % i == 0){
                isPrime = false;
            }
        }
        if (isPrime == true){
            System.out.println("Sayı asaldır");
        }
        else{
            System.out.println("Sayı asal değildir");
        }
        }
    
    }

    
