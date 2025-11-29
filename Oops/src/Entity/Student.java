package Entity;

public class Student {
    private String name;
    private String roll;
    private int marks;
    
    public Student()
    {

    }

    public Student(String name, String roll, int marks)
    {
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }

    public String getName()
    {
        return this.name;
    }

    public String getRoll()
    {
        return this.roll;
    }

    public int getMarks()
    {
        return this.marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }


}
