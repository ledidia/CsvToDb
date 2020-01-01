import au.com.bytecode.opencsv.CSVReader;
import weather.EarthWeatherValidator;
import weather.Weather;
import weather.WeatherValidator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadDataFromFile extends ValidDate {
    private String fileName;
    public ReadDataFromFile(String fileName){
        this.fileName=fileName;
    }
    public String readData() {
        String values = "";
        try {
            CSVReader   reader = new CSVReader(new FileReader(fileName));
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (isValid(nextLine)) {
                    WeatherValidator weatherValidator= new EarthWeatherValidator();
                    try {
                      if( weatherValidator.isValid(new Weather(new SimpleDateFormat("dd-MM-yyyy").parse(nextLine[0]),Integer.parseInt(nextLine[1]),Integer.parseInt(nextLine[2]),Integer.parseInt(nextLine[3])))){
                          values += ",('" + nextLine[0] + "','" + nextLine[1] + "','" + nextLine[2] + "','"+ nextLine[3] +"')";
                      }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return values;
    }
}
