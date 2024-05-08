package Week1;


import java.util.Scanner;

public class FirstOne {
    public static void main(String[] args) {
        int age = getAge();
        System.out.printf("\n Age:%s", age);
        if ( age > 16 ){
            System.out.printf("\n You can drive");
        } else {
            System.out.printf("\n You cannot drive");
        }
        if ( age > 21 && age < 100 ){
            System.out.printf("\n You can drink ");
        } else if ( age >= 100 ){
            System.out.printf("\n You really should not be drinking though you can");
        } else {
            System.out.printf("\n You cannot drink");
        }
    }

    private static int getAge() {
        int age = 0;
        Scanner s = new Scanner(System.in);
        final int MIN_AGE = 0;
        final int MAX_AGE = 140;
        boolean gotGoodAge = false;
        while ( !gotGoodAge){
            System.out.printf("\n Enter Age ->");
            if ( age < MIN_AGE || age > MAX_AGE ){
                System.out.printf("\n Error: age:%s must be from %s to %s", MIN_AGE, MAX_AGE);
            } else {
                gotGoodAge = true;
            }
            try{
                age = s.nextInt();
            } catch ( Exception e){
                System.out.printf("\n Age:%s must be an int", age);
            }
        }
        return age;
    }
}
