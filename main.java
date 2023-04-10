public class UserInfoPrinter {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java UserInfoPrinter [name] [age] [occupation]");
            return;
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        String occupation = args[2];

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
    }
}
