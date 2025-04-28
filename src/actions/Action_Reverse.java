package actions;

import java.util.Collections;
import java.util.List;


public class Action_Reverse implements Action {

    @Override
    public List<String> execute(List<String> lines) {
        Collections.reverse(lines);
        return lines;
    }
}

