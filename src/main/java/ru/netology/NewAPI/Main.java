package ru.netology.NewAPI;

public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        post.name = "Сергей";
        post.surname = "Петренко";
        post.patronymic = "Викторович";
        post.passport = "1598 № 423670";
        post.phone = "+79502467140";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 12;
        post.birthday.month = 2;
        post.birthday.year = 1998;


    }
}