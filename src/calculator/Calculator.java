package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
class Calculator {

    String calculate(String[] expression) {
        System.out.println(expression[0]);
        System.out.println(expression[1]);
        System.out.println(expression[2]);

        Double a = Double.parseDouble(expression[0]);
        Double b = Double.parseDouble(expression[2]);


        // int result = a + b;
        double result;    // int - integer ; double- plavajusaja
        switch (expression[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                return "error";

            // vozvrasaet osibku, esli net  znaka
        }
        // esli vipolnjaem , tolko 2 deistvija , to pisem
        if (expression.length < 4) {
            return String.valueOf(result);
        }
        Double c = Double.parseDouble(expression[4]);
        switch (expression[3]) {
            case "+":
                result = result + c;
                break;
            case "-":
                result = result - c;
                break;
            case "*":
                result = result * c;
                break;
            case "/":
                result = result / c;
                break;
            default:
                return "error";
        }
        return String.valueOf(result);

        // valueOf -- preobrazuet iz cifr v teksts

    }

}
