package maltepe.edu.tr.oop;

public class Prof extends Person{
    private String prfName,prfdepartment;
    private int prfage;
    public Prof( String prfName,String prfdepartment,int prfage) {
        this.prfName=prfName;
        this.prfage=prfage;
        this.prfdepartment=prfdepartment;
    }

    public static void who(){System.out.println("this is a proffesor");}

    public  String getName(){return prfName;}
    public String getdepartment(){return prfdepartment;}
    public int getage(){return prfage;}
}
