package service;

import entity.User;
import lombok.RequiredArgsConstructor;
import repository.UserRepository;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

@RequiredArgsConstructor
public class UserServiceAnonymousClassImpl implements UserService {
  private final UserRepository repository;

  @Override
  public List<User> sortByAgeDsc() {
    return repository.findAll()
        .stream()
        .sorted(new Comparator<User>() {
          @Override
          public int compare(User u1, User u2) {
            return Integer.compare(u2.age(), u1.age());
          }
        })
        .toList();
  }

  @Override
  public List<User> filterByAgeOlderThan(int age) {
    return repository.findAll()
        .stream()
        .filter(new Predicate<User>() {
          @Override
          public boolean test(User user) {
            return user.age() >= age;
          }
        })
        .toList();
  }
}
