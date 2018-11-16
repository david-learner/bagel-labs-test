package example02;

import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        Nodes nodes = NodeConverter.convertToNodes(StringUtils.convertToHashMap(userInput));
        nodes.sort();

        System.out.println(nodes.print());
    }
}
