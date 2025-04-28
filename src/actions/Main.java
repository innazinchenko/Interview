package actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println(" <inputFile> <outputFile> <actionName>");
        }

        String inputFile = args[0];
        String outputFile = args[1];
        String actionName = args[2];

        try {
            List<String> lines = Files.readAllLines(Paths.get(inputFile));

            Action action = Actions_Case.getAction(actionName);

            List<String> processedLines = action.execute(lines);

            Files.write(Paths.get(outputFile), processedLines);

            System.out.println("Action: " + actionName + " was completed successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
