public class Student {
    private String name, classes;

    Student() {
        this.name = "John";
        this.classes = "C02";
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String diplay(){
        return this.name +" ; "+ this.classes;
    }
}
