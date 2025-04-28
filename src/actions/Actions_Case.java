package actions;
import java.util.HashMap;
import java.util.Map;



public class Actions_Case {
    private static final Map<String, Action> actions = new HashMap<>();

    static {
        actions.put("sort", new  Action_Sort());
        actions.put("reverse", new Action_Reverse());
        actions.put("shuffle", new Action_Shuffle());
    }

    public static Action getAction(String actionName) {
        Action action = actions.get(actionName.toLowerCase());
        if (action == null) {
            throw new IllegalArgumentException("Error");
        }
        return action;
    }
}
