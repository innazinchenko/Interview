package actions;

import java.util.List;

    public interface Action {
        List<String> execute(List<String> lines);
    }
