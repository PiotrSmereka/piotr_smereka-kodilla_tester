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


