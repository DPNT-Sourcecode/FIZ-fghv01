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
      assertThat(fizzBuzzSolution.isDeluxe(111), equalTo(true));
      assertThat(fizzBuzzSolution.isDeluxe(3343), equalTo(false));
      assertThat(fizzBuzzSolution.isDeluxe(3), equalTo(false));
    }

    @Test
    public void compute_fake_deluxe() {
      assertThat(fizzBuzzSolution.fizzBuzz(111), equalTo("fake deluxe"));
    }
  }
