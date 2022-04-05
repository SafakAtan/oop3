package maltepe.edu.tr.oop;

public class Student extends Person{
    private String stName,stdepartment;
    private int stage;
    public Student(String stName,String stDepartment,int stage) {
        this.stName=stName;
        this.stdepartment=stdepartment;
        this.stage=stage;}

    public static void who(){System.out.println("this is a student");}

    public  String getName(){return stName;}
    public String getdepartment(){return stdepartment;}
    public int getage(){return stage;}
}
