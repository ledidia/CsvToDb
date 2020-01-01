public interface DBOperation {
  String URL_CONNECTION_DB="jdbc:mysql://localhost:3306/geospatial";
     String USER_DB="root";
    String PASSWORD_DB="root";
    public static final String INSERT_QUERY="INSERT INTO  `geospatial`.`weather_data` ("
            + "`day` ,"
            + "`temperature` ,"
            + "`pressure` ,"
            + "`windSpeed`)"
            + "VALUES ";
    void conectDB();
    void insertDB(String value);
}
