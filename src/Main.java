package userManagement;
public class User {
    private String username;
    private String password;
    private String role;

    public User() {
    }

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public User(String username,String password){
        this.username=username;
        this.password=password;
        this.role='user';

    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public void login(){
        System.out.println("Пользователь"+ username + "зарегестрирован)");
    }
    public void logout(){
        System.out.println("Пользователь"+ username+ "вышел из системы)");
    }
    public static void main(String[] args) {
        // Заполнение списка пользователями из консоли
        List<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter username:");
            String username = scanner.nextLine();

            System.out.println("Enter password:");
            String password = scanner.nextLine();

            System.out.println("Choose role (admin/user):");
            String role = scanner.nextLine();

            users.add(new User(username, password, role));
        }

        for (User user : users) {
            System.out.println(user.getUsername() + " " + user.getPassword() + " " + user.getRole());
        }

        scanner.close();
    }
}