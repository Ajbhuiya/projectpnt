package encapsulation;

public class Student {
    private String stName="Abdul";
    private int stID= 123;
    private String sDob="01/15/1990";
    private int stEnrolled=3;

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getStID() {
        return stID;
    }

    public void setStID(int stID) {
        this.stID = stID;
    }

    public String getsDob() {
        return sDob;
    }

    public void setsDob(String sDob) {
        this.sDob = sDob;
    }

    public int getStEnrolled() {
        return stEnrolled;
    }

    public void setStEnrolled(int stEnrolled) {
        this.stEnrolled = stEnrolled;
    }





}
