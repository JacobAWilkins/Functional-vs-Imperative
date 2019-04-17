// Jacob Wilkins

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class functional {

  // Sum of squares lambda
	static UnaryOperator<Long>
		sumOfSquares = (Long i) -> i == 0 ? 0 : i*i + functional.sumOfSquares.apply(i-1);

  // Pell numbers lambda
	static UnaryOperator<Long>
		pell = (Long i) -> i < 2 ? i : 2 * functional.pell.apply(i-1) + functional.pell.apply(i-2);

  // Powers lambda
	static BinaryOperator<Long>
		powers = (Long i, Long j) -> j == 0 ? i-1 : (i-1) + i * functional.powers.apply(i, j-1);

  public static void main(String[] args) {
  
    for (Long i = 0L; i <= 15; i++) {
      System.out.format("sumOfSquares(%d) is %d\n", i, sumOfSquares.apply(i));
    }

    for (Long i = 0L; i <= 15; i++) {
      System.out.format("pell(%d) is %d\n", i, pell.apply(i));
    }

    for (Long i = 2L; i <= 10; i++) {
      for (Long j = 1L; j <= 10; j++) {
        System.out.format("powers(%d, %d) is %d\n", i, j, powers.apply(i, j));
      }
    }
    
  }
  
}
