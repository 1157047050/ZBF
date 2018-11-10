package 反射;

public class User {
    private String name;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private void aVoid(){
        System.out.println("=======运行私有方法=============");
    }
}
