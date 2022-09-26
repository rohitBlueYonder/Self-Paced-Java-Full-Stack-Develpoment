package fundamentals;

public class DecisioningConditions {
    public static void main(String[] args) {
        //switch case

        String str = "b";
        switch (str){
            case "ROHIT":
                System.out.println("its ROHIT");
                break;
            case "rohit":
                System.out.println("its rohit");
                break;
            case "a":
            case "b":
            case "c":
                System.out.println("Alphabets");
                break;
            case "Rohit":
                System.out.println("its Rohit");
                break;
            case "rOHIT":
                System.out.println("its rOHIT");
                break;
            default:
                System.out.println("Invalid arguments");
        }

    // Ternary operator
        String n;
        n = (5%2 ==0)? "Even": "Odd";
        System.out.println(n);



    }
}
