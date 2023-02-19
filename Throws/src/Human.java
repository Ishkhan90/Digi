public class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name)  {
        if (name.matches("[a-z]+"))
            this.name=name;
        else
            throw new NameException("Human name should be lower case");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if (age>=18 && age<=100)
        this.age = age;
        else
            throw new AgeException("age should be 18-100 numbers: "+age);
    }
}
