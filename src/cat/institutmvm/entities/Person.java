package cat.institutmvm.entities;

public class Person {
    private String Fname;
    private String Lname;
    private String Position;

    public Person(String fname, String lname, String position) {
        setFname(fname);
        setLname(lname);
        setPosition(position);
    }

    public String getFname() {
        return Fname;
    }
    public String getLname() {
        return Lname;
    }
    public String getPosition() {
        return Position;
    }

    public void setFname(String fname) {
        Fname = fname;
    }
    public void setLname(String lname) {
        Lname = lname;
    }
    public void setPosition(String position) {
        Position = position;
    }

    public String toString(){
        return String.format("First name: %s\n Last Name: %s\n Position: %s", this.Fname, this.Lname, this.Position);
    }
}
