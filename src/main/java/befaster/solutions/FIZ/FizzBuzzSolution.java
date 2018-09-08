package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public static final String FIZZ_NUMBER = "3";
    public static final String BUZZ_NUMBER = "5";

    public String fizzBuzz(Integer number) {
        String answer = "";
        if (isFizz(number)) {
            answer = "fizz ";
        }
        if (isBuzz(number)) {
            answer += "buzz ";
        }
        if (isDeluxe(number)) {
            if (number % 2 != 0) {
                answer += "fake ";
            }
            answer += "deluxe";
        }
        if (!answer.isEmpty()) {
            return answer.trim();
        }
        return number.toString();
    }

    // No remainder after division by three or contains three
    private boolean isFizz(Integer number) {
        return (number % 3 == 0) || number.toString().contains(FIZZ_NUMBER);
    }

    // No remainder after division by five or contains five
    private boolean isBuzz(Integer number) {
        return number % 5 == 0 || number.toString().contains(BUZZ_NUMBER);
    }

    // Combination of fizz and buzz, but fizz or buzz numbers have to be inside the base number
    boolean isDeluxe(Integer number) {
        if ((number % 3 == 0) && number.toString().contains(FIZZ_NUMBER)
            || (number % 5 == 0) && number.toString().contains(BUZZ_NUMBER)) {
            return true;
        }
        return false;
    }

}
