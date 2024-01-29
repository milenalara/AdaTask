package be.com.ada.pooii.Repository;

import be.com.ada.pooii.Domain.BaseTask;

import java.util.List;

public interface Repository {
  void save(BaseTask task);
  BaseTask getById(int id);
  List<BaseTask> getAll();
  void update(int id, BaseTask newTask);
  void delete(int id);
}
