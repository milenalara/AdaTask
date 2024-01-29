package be.com.ada.pooii.Repository;

import be.com.ada.pooii.Domain.BaseTask;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository implements Repository {
  List<BaseTask> tasks;

  public TaskRepository() {
    this.tasks = new ArrayList<>();
  }
  @Override
  public void save(BaseTask task) {
    tasks.add(task);
    System.out.println("Tarefa criada");
  }

  @Override
  public BaseTask getById(int id) {
    return tasks.get(id);
  }

  @Override
  public List<BaseTask> getAll() {
    return this.tasks;
  }

  @Override
  public void update(int id, BaseTask newTask) {
    tasks.set(id, newTask);
    System.out.println("Tarefa alterada");
    System.out.println(newTask.toString());
  }

  @Override
  public void delete(int id) {
    tasks.remove(id);
    System.out.println("Tarefa removida");
  }
}
