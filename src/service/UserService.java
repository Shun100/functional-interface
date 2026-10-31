package service;

import entity.User;

import java.util.List;

public interface UserService {
  List<User> sortByAgeDsc();
  List<User> filterByAgeOlderThan(int age);
}
