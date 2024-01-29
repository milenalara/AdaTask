package be.com.ada.pooii.Domain;

import java.time.LocalDateTime;

public class StudyTask extends BaseTask {
  String subject;

  public StudyTask(String title, String description, LocalDateTime creation, LocalDateTime deadline, String subject) {
    super(title, description, creation, deadline);
    this.subject = subject;
  }
}
