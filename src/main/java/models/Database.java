package models;
import org.sql2o.*;
public class Database {

    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-35-169-188-58.compute-1.amazonaws.com:5432/d2gvrj136a2r78", "ynkxmmwxgxmsqu", "33fbd2b96bbdd6a58c359e703e7bace66e398327c5d445e5cc58c7023681afb2");

//   public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "postgres", "12345");

//   postgres://ynkxmmwxgxmsqu:33fbd2b96bbdd6a58c359e703e7bace66e398327c5d445e5cc58c7023681afb2@
//   // ec2-35-169-188-58.compute-1.amazonaws.com:5432/d2gvrj136a2r78

}
