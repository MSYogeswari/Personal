import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        boolean flag = false;
        String outputstring = "";
        if(number >= 100 && number <= 999) {
            int digit1 = number / 100;

            switch (digit1) {
                case 1:
                    outputstring = outputstring + "One hundred ";
                    break;
                case 2:
                    outputstring = outputstring + "Two hundred ";
                    break;
                case 3:
                    outputstring = outputstring + "Three hundred ";
                    break;
                case 4:
                    outputstring = outputstring + "Four hundred ";
                    break;
                case 5:
                    outputstring = outputstring + "Five hundred ";
                    break;
                case 6:
                    outputstring = outputstring + "Six hundred ";
                    break;
                case 7:
                    outputstring = outputstring + "Seven hundred ";
                    break;
                case 8:
                    outputstring = outputstring + "Eight hundred ";
                    break;
                case 9:
                    outputstring = outputstring + "Nine hundred ";
                    break;
            }
            int digit2 = number % 100;
        switch (digit2) {
            case 1:
                outputstring = outputstring + "and one";
                flag = true;
                break;
            case 2:
                outputstring = outputstring + "and two";
                flag = true;
                break;
            case 3:
                outputstring = outputstring + "and three";
                flag = true;
                break;
            case 4:
                outputstring = outputstring + "and four";
                flag = true;
                break;
            case 5:
                outputstring = outputstring + "and five";
                flag = true;
                break;
            case 6:
                outputstring = outputstring + "and six";
                flag = true;
                break;
            case 7:
                outputstring = outputstring + "and seven";
                flag = true;
                break;
            case 8:
                outputstring = outputstring + "and eight";
                flag = true;
                break;
            case 9:
                outputstring = outputstring + "and nine";
                flag = true;
                break;
            case 10:
                outputstring = outputstring + "and ten";
                flag = true;
                break;
            case 11:
                outputstring = outputstring + "and eleven";
                flag = true;
                break;
            case 12:
                outputstring = outputstring + "and twelve";
                flag = true;
                break;
            case 13:
                outputstring = outputstring + "and thirteen";
                flag = true;
                break;
            case 14:
                outputstring = outputstring + "and fourteen";
                flag = true;
                break;
            case 15:
                outputstring = outputstring + "and fifteen";
                flag = true;
                break;
            case 16:
                outputstring = outputstring + "and sixteen";
                flag = true;
                break;
            case 17:
                outputstring = outputstring + "and seventeen";
                flag = true;
                break;
            case 18:
                outputstring = outputstring + "and eighteen";
                flag = true;
                break;
            case 19:
                outputstring = outputstring + "and nineteen";
                flag = true;
                break;
        }
        if(digit2 /10 == 2)
            outputstring = outputstring + "and twenty ";
            if(digit2 /10 == 3)
                outputstring = outputstring + "and thirty ";
            if(digit2 /10 == 4)
                outputstring = outputstring + "and fourty ";
            if(digit2 /10 == 5)
                outputstring = outputstring + "and fifty ";
            if(digit2 /10 == 6)
                outputstring = outputstring + "and sixty ";
            if(digit2 /10 == 7)
                outputstring = outputstring + "and seventy ";
            if(digit2 /10 == 8)
                outputstring = outputstring + "and eighty ";
            if(digit2 /10 == 9)
                outputstring = outputstring + "and ninety ";

int digit3 = number %10;
if(flag == false) {
    switch (digit3) {
        case 1:
            outputstring = outputstring + "one";
            break;
        case 2:
            outputstring = outputstring + "two";
            break;
        case 3:
            outputstring = outputstring + "three";
            break;
        case 4:
            outputstring = outputstring + "four";
            break;
        case 5:
            outputstring = outputstring + "five";
            break;
        case 6:
            outputstring = outputstring + "six";
            break;
        case 7:
            outputstring = outputstring + "seven";
            break;
        case 8:
            outputstring = outputstring + "eight";
            break;
        case 9:
            outputstring = outputstring + "nine";
            break;

    }
}}
        else
            System.out.println("Invalid Number!");
        System.out.println(number + "-" + outputstring);
    }
}
