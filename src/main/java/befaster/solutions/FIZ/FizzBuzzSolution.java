package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String answer = "";
        if (isFizz(number)) {
            answer = "fizz ";
        }
        if (isBuzz(number)) {
            answer += "buzz ";
        }
        if (isDeluxe(number)) {
            answer += "deluxe";
        }
        if (!answer.isEmpty()) {
            return answer.trim();
        }
        return number.toString();
    }

    // No remainder after division by three
    private boolean isFizz(Integer number) {
        return (number % 3 == 0) || number.toString().contains("3");
    }

    // No remainder after division by five
    private boolean isBuzz(Integer number) {
        return number % 5 == 0 || number.toString().contains("5");
    }

    // No remainder after division by five
    boolean isDeluxe(Integer number) {
        if (number < 10) {
            return false;
        }
        final String numberAsString = number.toString();
        for (int i = 0; i < numberAsString.length(); i++) {
            if(numberAsString.charAt(0) != numberAsString.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
