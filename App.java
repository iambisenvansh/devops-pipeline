public class App {
    public static void main(String[] args) {
        String[] fortunes = {"You will pass this lab!", "Success is in your Jenkinsfile.", "Error 404: Fortune not found."};
        int random = (int) (Math.random() * fortunes.length);
        System.out.println("THE ORACLE SAYS: " + fortunes[random]);
    }
}
