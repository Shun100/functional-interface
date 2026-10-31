import repository.UserRepository;
import service.UserService;
import service.UserServiceAnonymousClassImpl;
import service.UserServiceLambdaImpl;
import service.UserServiceNormalClassImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  private static final int AGE = 25;
  private static final UserRepository repository = new UserRepository();

  public static void main(String[] args) {
    UserService userServiceLambdaImpl = new UserServiceLambdaImpl(repository);
    UserService userServiceAnonymouseClassImpl = new UserServiceAnonymousClassImpl(repository);
    UserService userServiceNormalClassImpl = new UserServiceNormalClassImpl(repository);

    System.out.println(userServiceLambdaImpl.sortByAgeDsc().toString());
    System.out.println(userServiceAnonymouseClassImpl.sortByAgeDsc().toString());
    System.out.println(userServiceNormalClassImpl.sortByAgeDsc().toString());

    System.out.println(userServiceLambdaImpl.filterByAgeOlderThan(AGE).toString());
    System.out.println(userServiceAnonymouseClassImpl.filterByAgeOlderThan(AGE).toString());
    System.out.println(userServiceNormalClassImpl.filterByAgeOlderThan(AGE).toString());
  }
}