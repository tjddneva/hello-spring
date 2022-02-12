package hello.hellospring.controller;

public class MemberForm {
    private String name;

    public String getName() { //alt insert 로 constructor, getter setter 등등
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
