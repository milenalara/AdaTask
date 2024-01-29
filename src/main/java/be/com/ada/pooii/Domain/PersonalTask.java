package be.com.ada.pooii.Domain;

import java.time.LocalDateTime;

public class PersonalTask extends BaseTask {
  String category;
  public PersonalTask(String title, String description, LocalDateTime creation, LocalDateTime deadline, String category) {
    super(title, description, creation, deadline);
    this.category = category;
  }
}
