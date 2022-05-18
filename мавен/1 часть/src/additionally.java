import java.util.ArrayList;

public class additionally {
    public void add(ArrayList registered, String name, String nickname, int pass, int id)
    {

        Users new_users= new Users();
        new_users.setNickname(nickname);
        new_users.setName(name);
        new_users.setPass(pass);
        new_users.setId(id);
        registered.add(new_users);
    }
    public void del(ArrayList<Users> registered, String name,String nickname, int pass)
    {
        for (int i=0;i<registered.size();i++){

            if(registered.get(i).getName().equals(name) && registered.get(i).getNickname().equals(nickname) && registered.get(i).getPass()==pass)
            {
                registered.remove(i);
            }
        }
    }
}
