package com.ProgramConcepts;

	import javax.swing.JOptionPane;
import java.text.DecimalFormat;

        public class Main
        {
            public static void main(String [] args){
                double score1, score2, score3;
                String grade1, grade2, grade3;
                int i = 0;
                while( i == 0){
                    DecimalFormat fmt = new DecimalFormat("0.##");

                    grade1 = JOptionPane.showInputDialog("Enter the first score: ");
                    grade2 = JOptionPane.showInputDialog("Enter the second score: ");
                    grade3 = JOptionPane.showInputDialog("Enter the third score: ");


                    score1 = Double.parseDouble(grade1);
                    score2 = Double.parseDouble(grade2);
                    score3 = Double.parseDouble(grade3);

                    double avg = average(score1, score2, score3);


                    JOptionPane.showConfirmDialog(null,"These are the grades for each test:\n\n"
                            + "Test 1: " + grades(score1)
                            + "\nTest 2: " + grades(score2)
                            + "\nTest 3: " + grades(score3)
                            + "\n\nThe average score is: " + fmt.format(avg) + "\nAverage Letter Grade: " + grades(avg));

                    int value = JOptionPane.showConfirmDialog(null, "Do you want to average another set of scores?");

                    if(value == JOptionPane.YES_OPTION){
                        i = 0;
                    }
                    else{
                        i = 1;
                    }

                }

            }

            public static double average (double score1, double score2, double score3){
                double avg = (score1 + score2 + score3)/3;
                return avg;

            }

            public static String grades (double grades){
                String grade;
                if(grades >= 90){
                    grade = "A";
                }
                else if(grades >= 80){
                    grade = "B";

                }
                else if(grades >= 70){
                    grade = "C";

                }
                else if(grades >= 60){
                    grade = "D";

                }
                else {
                    grade = "F";

                }
                return grade;
            }

        }
        -
