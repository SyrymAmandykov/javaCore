package Interface;

public class UserBeanImp implements UserBean{

    private Users[] users;

    public UserBeanImp(){
    }
    public UserBeanImp(Users[] users){
        this.users = users;
    }

    public Users[] getUsers() {
        return users;
    }

    public void setUsers(Users[] users) {
        this.users = users;
    }

    public void getAllUsers(){
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getName() + " " + users[i].getSurname());
        }
    }

    public void getUsersByName(String name){
        for (int i = 0; i < users.length; i++){
            if (users[i].getName().equalsIgnoreCase(name)){
                System.out.println(users[i].getName() + " " + users[i].getSurname());
            }
        }
    }

    public void getUsersBySurname(String surname){
        for (int i = 0; i < users.length; i++){
            if (users[i].getSurname().equalsIgnoreCase(surname)){
                System.out.println(users[i].getName() + " " + users[i].getSurname());
            }
        }
    }
}
