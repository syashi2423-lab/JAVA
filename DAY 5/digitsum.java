import java.io.*;
import java.util.*;
class UserMainCode{
    public int digitSum(int input1){
    
    boolean isNegative = input1 < 0;                   
 
    input1 = Math.abs(input1);                       


    while (input1 > 9) {
        int sum = 0;

        while (input1 > 0) {
            sum += input1 % 10;
            input1 /= 10;
        }

        input1 = sum;
    }

    return isNegative ? -(int) input1 : (int) input1;    
}