package actions;

import java.util.Collections;
import java.util.List;

public class Action_Sort implements Action {
        @Override
        public List<String> execute (List<String> lines) {
            Collections.sort(lines);
            return lines;
        }
    }

