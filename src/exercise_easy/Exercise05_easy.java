package exercise_easy;

import javax.swing.*;

public class Exercise05_esy { // class start - Make an algorithm to read three integers, store them in variables,
    // and display the sum, subtraction, multiplication and average of the three numbers entered
        public Integer calculateSum (int firstValue, int secondValue, int thirdValue) {
            int sum = firstValue + secondValue + thirdValue;
            return sum;
        }
        public Integer calculateSubtraction (int firstValue, int secondValue, int thirdValue){
            int subtraction= secondValue - firstValue;
            return subtraction;
        }
        public Integer calculateMultiplication (int firstValue, int secondValue, int thirdValue){
            int multiplication = firstValue * secondValue *thirdValue;
            return multiplication;
}
        public Integer calculateMedia (int firstValue, int secondValue, int thirdValue){
            int media = multiplication / 3;
            return media;
        }

} // class end