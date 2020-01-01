import weather.Weather;

import java.util.Date;

public class App {
    public static final String csvFile = "C:\\Users\\crm0194\\IdeaProjects\\CsvToDb\\data.csv";
    public static void main(String[] args)  {
        ReadData readData = new ReadDataFromFile(csvFile);
        String values = readData.readData();
            if (values.length()>0) {
                DBOperation conectDB = new DBOperationImpl();
                conectDB.conectDB();
              conectDB.insertDB(values.substring(1));
            }
        }
}
