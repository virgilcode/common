package com.virgil.collect;

import java.util.Stack;

/**
 * Created by sunvirgil on 17/03/2017.
 */
/*解决类似问题
 *思路 碰到操作数入栈 操作符两个出栈
 *["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 *["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class EvaluateSolution {
    public static int slotion(String[] args) {
        int res=0;
        String operators="+-*/";
        Stack<String> stack=new Stack<String>();
        for(String str:args){
            if(!operators.contains(str))
        }
        return 0;
    }
}
