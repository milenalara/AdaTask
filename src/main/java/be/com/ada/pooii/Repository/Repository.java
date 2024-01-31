package be.com.ada.pooii.Repository;

import be.com.ada.pooii.Domain.Task;

import java.util.List;

public interface Repository {
  void save(Task task);
  Task getById(int id);
  List<Task> getAll();
  void update(int id, Task newTask);
  void delete(int id);
}
