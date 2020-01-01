import java.util.Scanner;
public class ReadFromConsole extends  ValidDate {
    public String readData() {
        Scanner scanner = new Scanner(System.in);
        String values = "";
        String line="";
        while(!(line =scanner.nextLine()).equals("0")){
            if (isValid(line.split(","))){
                values+=",("+line+")";
            }
        }
        return values;
    }
}
