public class TestUser {
    public static void main(String[] args) {


        User user1 = new User("Katarzyna", 21);
        User user2 = new User("Alex", 17);
        User user3 = new User("Borys", 30);
        User user4 = new User("Ula", 10);
        User user5 = new User("Bolek", 20);
        User user6 = new User("Ania", 23);
        User[] users = new User[]{user1, user2, user3, user4, user5, user6};

        int average = user1.usersAgeAndAverage(users);
        System.out.println("Average user age" + " "+ average +" " + "years.");
        System.out.println("Users below average age:");
        user1.displayUsersBelowAverageAge(users,average);

    }
}
