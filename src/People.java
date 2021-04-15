import java.util.Scanner;

public class People {
    private String name;
    private String dateOfBirth;
    private double Id;
    public People(){};

    public People(String name, String dateOfBirth, double id) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void inputPersoninfo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the name");
        this.name=scanner.nextLine();
        System.out.println("enter date of birth");
        this.dateOfBirth=scanner.nextLine();
        System.out.println("enter id");
        this.Id=scanner.nextDouble();
    }
    public void showInputPersonInfo(){
        System.out.printf("ho te %s","ngay sinh %s","CMND %s",name,dateOfBirth,Id);
    }
    public double getId() {
        return Id;
    }

    public void setId(double id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", Id=" + Id +
                '}';
    }
}
