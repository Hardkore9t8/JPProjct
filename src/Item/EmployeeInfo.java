package Item;

import java.util.Scanner;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;

  public EmployeeInfo() {
    this.name = name;
  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  private void setName() {
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  private String inputName() {
    String nameString;
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your first and last name: ");
    nameString = scan.nextLine();
    scan.close();
    return nameString;
  }

  private void createEmployeeCode(StringBuilder name) {
    if (checkName(name)) {//valid ,include space
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
    } else //invalid or no space
    {
      code = "guest";
    }
  }

  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") > 0) {//valid
      return true;
    } else {
      return false;
    }
  }
}


