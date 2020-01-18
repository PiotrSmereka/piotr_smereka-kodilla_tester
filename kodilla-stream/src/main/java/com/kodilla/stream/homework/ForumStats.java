package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgPostsUnder40 = UsersRepository.getUsersList()
                .stream()
                .filter(w -> w.getAge()< 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts for users under 40yo: " + avgPostsUnder40);

        double avgPostsOver40 = UsersRepository.getUsersList()
                .stream()
                .filter(w -> w.getAge()>=40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts for users over 40yo: " + avgPostsOver40);
    }
}
