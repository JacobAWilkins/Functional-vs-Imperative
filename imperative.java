/*H***************************************************************************
* FILENAME :        imperative.java
*
* DESCRIPTION :
*       Finds sum of sqaures, pell numbers, and powers for numbers 1-15
*
* NOTES :
*       The purpose of this code is to demonstrate
*       imperative programming with simple calculations.
*
*       Copyright 2018, Jacob Wilkins.  All rights reserved.
* 
* AUTHOR :    Jacob Wilkins        START DATE :    27 Nov 18
*
*H*/

public class hmwk_04_imperative {

  // Sum of squares
	static Long sumOfSquares(Long i) {
		if (i == 0) {
      return i;
		}
		return i*i + sumOfSquares(i - 1);
	}

  // Pell numbers
	static Long pell(Long i) {
		if (i < 2) {
      return i;
    }
		return 2 * pell(i - 1) + pell(i - 2);
	}


  // Powers
	static Long powers(Long i, Long j) {
		if (j == 0) {
      return i - 1;
    }
		return (i - 1) + i * powers(i, j - 1);
	}

  public static void main( String[] args ) {
  
    for (Long i = 0L; i <= 15; i++) {
      System.out.format("sumOfSquares(%d) is %d\n", i, sumOfSquares(i));
    }

    for (Long i = 0L; i <= 15; i++) {
      System.out.format("pell(%d) is %d\n", i, pell(i));
    }

    for (Long i = 2L; i <= 10; i++) {
      for (Long j = 1L; j <= 10; j++) {
        System.out.format("powers(%d, %d) is %d\n", i, j, powers(i, j));
      }
    }
    
  }
  
}
