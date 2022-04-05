package maltepe.edu.tr.oop;

public class SporCenter implements Do_sport {
    private String Site;

    public SporCenter(String site){
        this.Site=site;

    }

    //Person p,p1,p2;
    public void Swimmingpool(Person name) {
        System.out.println(name.getName()+" is swimming");
    }


    public void Footbalfield(Person name) {
        System.out.println(name.getName()+" playing footbal");

    }
    public void goSpor(){};


}
