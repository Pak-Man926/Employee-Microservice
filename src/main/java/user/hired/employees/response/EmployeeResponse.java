package user.hired.employees.response;

public class EmployeeResponse
{
    private int ID;
    private String Name;
    private String Email;
    private int Age;

    //Respective Getters
    public int getID()
    {
        return ID;
    }

    public String getName()
    {
        return Name;
    }

    public String getEmail()
    {
        return Email;
    }

    public int getAge()
    {
        return Age;
    }

    //Respective Setter
    public void setID(int ID)
    {
        this.ID = ID;
    }

    public void setName(String name)
    {
        this.Name = name;
    }

    public void setEmail(String email)
    {
        this.Email = email;
    }

    public void setAge(int age)
    {
        this.Age = age;
    }
}
