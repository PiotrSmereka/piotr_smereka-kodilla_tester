public class User {
    String userName;
    int userAge;

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public int getAge() {
        return userAge;
    }

    public String getName() {
        return userName;
    }

    public static void main(String[] args) {


        User user1 = new User("Katarzyna", 21);
        User user2 = new User("Alex", 17);
        User user3 = new User("Borys", 30);
        User user4 = new User("Ula", 10);
        User user5 = new User("Bolek", 20);
        User user6 = new User("Ania", 23);
        User[] users = new User[]{user1, user2, user3, user4, user5, user6};

    }

        public int usersAgeAndAverage (User[]users){
            int average = 0;
            for (int i = 0; i < users.length; i++) {
                average = average + users[i].getAge();
            }
            average = average / users.length;
            return average;
    }



        public void displayUsersBelowAverageAge (User[]users, int average){
            for (int j = 0; j < users.length; j++) {
                if (users[j].getAge() < average) {
                    System.out.println(users[j].getName());
                }
                }
            }
        }


