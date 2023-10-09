package Interface;

public class test {
    public static void main(String[] args) {
        Users user1 = new Users("Serik", "Serikov");
        Users user2 = new Users("Serik", "Serikov");

        Users[] users = {user1, user2};

        UserBeanImp userBeanImp = new UserBeanImp(users);

        userBeanImp.getAllUsers();
    }
}
