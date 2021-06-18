import java.util.HashMap;
import java.util.Map;

public class TemplateOutput {

    public static void main(String[] args) {
        Map<String, String> variables = new HashMap<>();
        variables.put("firstName", "John");
        variables.put("lastName", "Doe");
        variables.put("middleName", "Richard");
        variables.put("city", "London");
        String template = "Hello, my name is {{firstName}} {{middleName}} {{lastName}}. I live in {{city}}";

        System.out.println(renderTemplate(template, variables));
    }

    public static String renderTemplate(String template, Map<String, String> variables) {

        while (template.contains("{")) {
            int index1 = template.indexOf('{') + 2;
            int index2 = template.indexOf('}');
            String key = template.substring(index1, index2);
            String value = variables.get(key);
            template = template.replace("{{" + key + "}}", value);
        }
        return template;
    }

}
