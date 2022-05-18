import java.util.ArrayList;

public class Users {
    private String name;
    private String nickname;
    private int pass;
    private int id;

    public void setId(int name) {
        this.id = id;
    }
    public  int getId() {
        return  id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public int getPass(){
        return pass;
    }
    public void setPass(int pass){
        this.pass= this.pass;
    }
    public void create (ArrayList<applications> regist, String name, String text)
    {
        applications new_applications = new applications();
        new_applications.setName(name);
        new_applications.setText(text);
        new_applications.setId_create(this.id);
        regist.add( new_applications );


    }
}
