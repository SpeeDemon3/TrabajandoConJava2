package Args;

import java.util.HashMap;

public class OptionsParse {
    private HashMap<String, String> options = new HashMap();
    private String[] args;

    private OptionsParse() {
    }

    public OptionsParse(String[] args) {
        this.args = args;
    }

    public void addOption(String option) {
        options.put(option, "");
    }

    public String getOption(String option) {
        return options.get(option);
    }

    public void setOptionValue(String option, String value) {
        options.replace(option, value);
    }

    public void parse() {
        for (int i = 0; i < args.length; i++) {
            String option = args[i].replace("-", "");
            if (options.containsKey(option)) {
                setOptionValue(option, args[i + 1]);
            }
        }
    }

}