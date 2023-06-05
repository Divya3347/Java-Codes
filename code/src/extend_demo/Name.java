package extend_demo;

public class Name{
    
    String fname , lname ;
    public String getfname(){
        return fname;
    }

    public void setfname(String fname){
        this.fname = fname;
    }

    public String getlname(){
        return lname;
    }

    public void setlname(String lname){
        this.lname = lname;
    }
    
    @Override
    public String toString(){
        return ("First Name = " + getfname() + "Last Name = " + getlname());
}
}
