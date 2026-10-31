package repository;

import entity.User;

import java.util.List;

public class UserRepository {
  private final List<User> users = List.of(
      new User(1, "Alice", 20),
      new User(2, "Bob", 30),
      new User(3, "Charley", 25),
      new User(4, "David", 32)
  );

  public List<User> findAll() {
    return users;
  }
}
