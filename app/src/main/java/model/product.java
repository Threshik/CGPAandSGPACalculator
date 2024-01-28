package model;

public class product{
    private int sem;
    private String course;

    private  int credits;


    public product(String course, int credits) {
        this.course = course;
        this.sem = sem;
        this.credits = credits;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }


}
