package user.hired.employees.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int ID;

    @Column(name = "NAME")
    private String Name;

    @Column(name = "EMAIL")
    private String Email;

    @Column(name = "AGE")
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

    //Respective Setters
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
