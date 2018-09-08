package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String answer = "";
        if (isFizz(number)) {
            answer = "fizz ";
        }
        if (isBuzz(number)) {
            answer += "buzz";
        }
        if (!answer.isEmpty()) {
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
