public class calcswitch {
    public static void main(String[] args){
        System.out.println("Calculator using switch");
        int a = 10;
        int b = 5;
        char operator = '+';
        switch(operator){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
    
}