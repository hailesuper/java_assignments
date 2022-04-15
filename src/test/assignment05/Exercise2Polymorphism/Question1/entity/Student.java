package test.assignment05.Exercise2Polymorphism.Question1.entity;

public class Student implements IStudent {
    private static int counter;
    private int id;
    private String name;
    private int group;

    public Student(String name, int group) {
        this.name = name;
        this.group = group;
        this.id = ++counter;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public void diemDanh() {
        System.out.println(name + " điểm danh.");
    }

    @Override
    public void hocBai() {
        System.out.println(name + " học bài.");
    }

    @Override
    public void donVeSinh() {
        System.out.println(name + " dọn vệ sinh.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group=" + group +
                '}';
    }
}
