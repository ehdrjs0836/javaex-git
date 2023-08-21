package ChallengeCh8;

public class Setting {
  static DataAccessObject exchange() { //Dependency
    return new MySqlDao();
          //new OracleDao()
  }
}
