---
layout: essay
type: essay
title: Coding Standards... Why?
# All dates must be YYYY-MM-DD format!
date: 2020-02-13
labels:
  - Software Engineering
  - Java
  - C
  - Codeing Standards
---

## Coding in High School

When I first started coding in high school for my VEX robotics team, I had not even heard of coding standards.  While I had some idea of what made code look nice, I tended to just do things so that I could read my code more easily.  This however did not carry over to others trying to read my code.  Now, most of the time this was not a problem, I could read my code and was the only person that needed to.  This code ended up becoming a largely uncommented and unformatted mess of non-descript function calls.

```c
AutoD (-60, 60, 470, 470);						// turn left///
	wait10Msec(100);

	Lower (-30, 1150, 15);									// Lower arm
	wait10Msec(30);

	AutoD (60, 60, 80, 80);								// Forward
	wait10Msec(50);

	SensorValue[Claw] = 1;								// Open claw score first skyrise
	wait10Msec(70);

	AutoD (-80, -80, 80, 80);							// Reverse
	wait10Msec(50);

	Lower (-40, 1125, 0);									// Lower arm
	wait10Msec(30);

	AutoD (60, -60, 250, 250);						// turn right///
	wait10Msec(50);
```

When I did run into problems however was when trying to show my code to other people.  Although I knew exactly what everything did, when I asked one of the older students how to do something, I often found I had to spend extra time explaining what each aspect of my code did in order for them to have to context to help me.  This was not only a result of poor code formatting, but also as a result of everyone there being somewhat inexperienced.  At this time, none of us even thought of coming up with or following a pre-existing coding standard.

## Poor Code in ICS 111

In my first coding class in University, this pattern continued, the only ‘Coding standard’ we had was ‘code neatly formatted and commented’.  As a result of the slack rules, I ended up not putting too much thought into how my code was formatted.  Similarly to high school this was not an issue, when working alone, it was not until I had to work in a group on our final project that this became a problem.  When trying to implement some of the methods described by my group members, I found our code wildly hard to follow as the format could change from one method to the next.

## Introduction to Formal Coding Standards

The second coding class that I took at UH was the first time that I was introduced to any formal coding standards.  In this class we were working in Java and had to use a formatter called CheckStyle admittingly, I hatted using this at first however, looking back at any of that code now, I can easily figure out what a method did due to the forced Java Doc comments.  While these were tedious to write at the time, it is very easy to go and look back at what a method does and what each of its parameters take.  Granted I still might not know what an individual line in the code does, but I can still use the method without knowing exactly how it works.

```java
  /**
   * Helper method for solveSudoku that keeps track of the current row and column.
   * 
   * @param sudoku the sudoku to be solved.
   * @param row the row of the value to try.
   * @param column the column of the value to try.
   * @return true if the sudoku is solved.
   */
  public static boolean recurse(int[][] sudoku, int row, int column) {
    recursions++;
    if (row > 15) {
      return checkSudoku(sudoku, false);
    }
    int nextRow = row;
    int nextColumn = column + 1;
    if (nextColumn > 15) {
      nextColumn = 0;
      nextRow++;
    }
    if (sudoku[row][column] != -1) {
      return recurse(sudoku,nextRow, nextColumn);
    }
    ArrayList<Integer> legalValuesArray = legalValues(sudoku, row, column);
    if (legalValuesArray == null) {
      return false;
    }
    for (Integer i : legalValuesArray) {
      sudoku[row][column] = i;
      if (recurse(sudoku,nextRow, nextColumn)) {
        return checkSudoku(sudoku, false);
      } else {
        sudoku[row][column] = -1;
      }
    }
    return false;
}
```

## ESLint

Now using EsLint, while I may be annoyed by it when trying to finish a WOD on time, I believe it is over all beneficial to my coding style and readability.  For the most part, I do not run into any errors coding the wat that I usually do, it is however helpful to see when I am messing up.  I do find it especially useful with writing Javascript, this is because the language is so loose that I may do something that while completely legal, may not be correct or cause problems.  Specifically, ESLint has helped me with finding errors in my underscore functions, as I am not completely comfortable with functional programming, ESLint might find something wrong with the way that I have formatted something that also causes an error in the way the code runs. 
 
