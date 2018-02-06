package service;

/**
 * Created by ВАСЯ on 06.02.2018.
 */
public class TestBean {

    private String name;

    public TestBean() {

    }

    public TestBean(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }
    public  void setName(String name) {
        this.name = name;

    }
}
