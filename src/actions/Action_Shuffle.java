package actions;

import java.util.Collections;
import java.util.List;


public class Action_Shuffle implements Action {
    @Override
    public List<String> execute(List<String> lines) {
        Collections.shuffle(lines);
        return lines;
    }
}
