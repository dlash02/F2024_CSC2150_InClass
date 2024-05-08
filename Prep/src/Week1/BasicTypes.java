package Week1;

public class BasicTypes {
    public static void main(String[] args) {
        byte  myByte = 126;
        System.out.printf("\n B1:%s", myByte);
        System.out.printf("\n B2:%s", ++myByte);
        System.out.printf("\n B3:%s", ++myByte);

        int myNum = Integer.MAX_VALUE;
        System.out.printf("\n MyNum1:%s", myNum);
        System.out.printf("\n MyNum2:%s", ++myNum);
        System.out.printf("\n MyNum3:%s", ++myNum);

        String myName = "George";
        myName += "y";
        System.out.printf("\n myName=%s", myName);

        double myHourlyRate = 22.50;
        myHourlyRate += 1;
        System.out.printf("\nHourly Rate:%s", myHourlyRate);
        double maxDouble = Double.MAX_VALUE;
        System.out.printf("\n Max_Double:%s", maxDouble);
    }
}
