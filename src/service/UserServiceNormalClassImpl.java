package service;

import entity.User;
import lombok.RequiredArgsConstructor;
import repository.UserRepository;
import service.command.FilterByAgeOlderThanCommand;
import service.command.SortByAgeDscCommand;

import java.util.List;

@RequiredArgsConstructor
public class UserServiceNormalClassImpl implements UserService {
  private final UserRepository repository;

  @Override
  public List<User> sortByAgeDsc() {
    SortByAgeDscCommand sortByAgeDscCommand = new SortByAgeDscCommand();
    return repository.findAll()
        .stream()
        .sorted(sortByAgeDscCommand)
        .toList();
  }

  @Override
  public List<User> filterByAgeOlderThan(int age) {
    FilterByAgeOlderThanCommand filterByAgeOlderThanCommand = new FilterByAgeOlderThanCommand(age);
    return repository.findAll()
        .stream()
        .filter(filterByAgeOlderThanCommand)
        .toList();
  }
}
