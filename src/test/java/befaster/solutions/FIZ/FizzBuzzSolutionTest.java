package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

  public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void setUp() {
      fizzBuzzSolution = new FizzBuzzSolution();
    }

    @Test
    public void compute_deluxe() {
      assertThat(fizzBuzzSolution.isDeluxe(33), equalTo(true));
      assertThat(fizzBuzzSolution.isDeluxe(3), equalTo(true));
      assertThat(fizzBuzzSolution.isDeluxe(35), equalTo(true));
    }

    @Test
    public void compute_fake_deluxe() {
      assertThat(fizzBuzzSolution.fizzBuzz(33), equalTo("fizz fake deluxe"));
      assertThat(fizzBuzzSolution.fizzBuzz(45), equalTo("buzz deluxe"));
    }
  }
