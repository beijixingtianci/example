public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age < 0){
            System.out.println("not right age! Please input again");
        }else{
            this.age = age;
        }

    }

}

没好果子

class Test2{
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(20);
        person.setName("유흠");
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}

class test3{
     System.out.println("cnmd");
      System.out.println("我来修改一下，要重修过");
}