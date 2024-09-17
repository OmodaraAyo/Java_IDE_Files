package practice;

import java.util.ArrayList;
import java.util.List;

public class SplitStringStep {

    public static List<String> isSplitStringStep(String userInput){
        if(userInput.length() % 2 != 0) userInput = userInput + "_";
        else userInput = userInput;
        List<String> output = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < userInput.length(); i+=2){
            output.add("'" + userInput.charAt(i) + userInput.charAt(i +1) + "'");
//            if(i != userInput.length() - 2) sb.append(" ");
        }
        return  output;
    }
}