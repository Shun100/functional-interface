package service;

import entity.User;
import lombok.RequiredArgsConstructor;
import repository.UserRepository;

import java.util.Comparator;
import java.util.List;

@RequiredArgsConstructor
public class UserServiceLambdaImpl implements UserService {
  private final UserRepository repository;

  @Override
  public List<User> sortByAgeDsc() {
    return repository.findAll()
        .stream()
        .sorted(Comparator.comparing(User::age).reversed())
        .toList();
  }

  @Override
  public List<User> filterByAgeOlderThan(int age) {
    return repository.findAll()
        .stream()
        .filter(user -> user.age() >= age)
        .toList();
  }
}
