class Student
{
    int id;
    String name;
    float stipend;

    Student(){}

    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    Student(int id, String name, float stipdend){
        this.id=id;
        this.name=name;
        this.stipend=stipdend;
    }
    void displayDetails(){
        System.out.println(this.id + " | " + this.name + " | " + this.stipend);
    }
}
public class OverloadMain
{
    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student(45, "Kieza");
        Student st3=new Student(234, "Kiara", 10000);

        st1.displayDetails();
        st2.displayDetails();
        st3.displayDetails();
    }
}