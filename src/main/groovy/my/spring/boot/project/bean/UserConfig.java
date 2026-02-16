package my.spring.boot.project.bean;

public class UserConfig {

    private String name;
    private String className;

    public UserConfig() {}

    public void setName(String name){
        this.name = name;
    }

    public void setClassName(String className){
        this.className = className;
    }

    public String getName(){
        return name;
    }

    public String getClassName(){
        return className;
    }
}
