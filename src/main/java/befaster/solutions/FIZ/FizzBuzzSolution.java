package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String answer = null;
        if (isFizz(number)) {
            answer = "Fizz ";
        }
        if (isBuzz(number)) {
            answer += "Buzz";
        }
        if (null != answer) {
            return answer.trim();
        }
        return number.toString();
    }

    // No remainder after division by three
    private boolean isFizz(Integer number) {
        return number % 3 == 0;
    }

    // No remainder after division by five
    private boolean isBuzz(Integer number) {
        return number % 5 == 0;
    }

}
