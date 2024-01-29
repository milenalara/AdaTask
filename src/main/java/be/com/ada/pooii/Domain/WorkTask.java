package be.com.ada.pooii.Domain;

import java.time.LocalDateTime;

public class WorkTask extends BaseTask {
  String project;
  public WorkTask(String title, String description, LocalDateTime creation, LocalDateTime deadline, String project) {
    super(title, description, creation, deadline);
    this.project = project;
  }
}
