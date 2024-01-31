package be.com.ada.pooii.Domain;

import java.util.Date;

public class PersonalTask extends Task {
  private String category;

  public PersonalTask(String title, String description, Date creation, Date deadline, String category) {
    super(title, description, creation, deadline);
    this.category = category;
  }
  public PersonalTask(int id, String title, String description, Date creation, Date deadline, String category) {
    super(id, title, description, creation, deadline);
    this.category = category;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  @Override
  public String toString() {
    return "\nId: " + this.getId() +
        "\nTítulo: " + this.getTitle() +
        "\nDescrição: " + this.getDescription() +
        "\nData de criação: " + this.getCreationDate() +
        "\nDeadline: " + this.getDeadline() +
        "\nCategoria: " + this.getCategory() +
        "\n";
  }
}
