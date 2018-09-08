package befaster.solutions.SUM;

public class SumSolution {

    public int compute(int x, int y) {
        if(inRange(x) && inRange(y)) {
            return x + y;
        }
        return -1;
    }

    private boolean inRange(int a) {
        if (a >= 0 && a<= 100) {
            return true;
        }
        return false;
    }

}
