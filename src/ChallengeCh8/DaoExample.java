package ChallengeCh8;

public class DaoExample {
  public static void dbWork(DataAccessObject dao) {
    dao.select();
    dao.insert();
    dao.update();
    dao.delete();
  }

  public static void main(String[] args) {
    //dbWork(new OracleDao());
    dbWork(Setting.exchange()); //외부에서 의존성 주입(스프링에서 중요함)
  }
}

interface DataAccessObject {
  void insert();
  void select();
  void update();
  void delete();
}

class OracleDao implements DataAccessObject {
  String dbName = "OracleDB";
  @Override
  public void insert() {
    System.out.println(dbName +"에 삽입");
  }

  @Override
  public void select() {
    System.out.println(dbName +"에 검색");
  }

  @Override
  public void update() {
    System.out.println(dbName +"에 수정");
  }

  @Override
  public void delete() {
    System.out.println(dbName +"에 삭제");
  }
}

class MySqlDao implements DataAccessObject {
  String dbName = "MysqlDB";
  @Override
  public void insert() {
    System.out.println(dbName +"에 삽입");
  }

  @Override
  public void select() {
    System.out.println(dbName +"에 삽입");
  }

  @Override
  public void update() {
    System.out.println(dbName +"에 삽입");
  }

  @Override
  public void delete() {
    System.out.println(dbName +"에 삽입");
  }
}