package maltepe.edu.tr.oop;

public class Lab3Main {
    public static void main(String[] args) {


    SporCenter center1= new SporCenter("pool");
    SporCenter center2=new SporCenter("football site");

    Person p;
    Person p1= new Prof("Asaf Varol","CE",45);
    Person p2= new Student("Safak Atan","CE",22);
    Person.who();
    Student.who();
    Prof.who();


       center1.Swimmingpool(p1);
       center2.Footbalfield(p2);

    }}
