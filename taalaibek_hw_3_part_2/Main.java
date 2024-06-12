package com.example.taalaibek_hw_3_part_2;
import java.util.Comparator;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(1, "Player One", new ArrayList<>(Arrays.asList(10, 20, 30)));
        Player player2 = new Player(2, "Player Two", new ArrayList<>(Arrays.asList(15, 25, 35)));
        Player player3 = new Player(3, "Player Three", new ArrayList<>(Arrays.asList(20, 30, 40)));
        Player player4 = new Player(4, "Player Four", new ArrayList<>(Arrays.asList(25, 35, 45)));
        Player player5 = new Player(5, "Player Five", new ArrayList<>(Arrays.asList(30, 40, 50)));
        Player player6 = new Player(6, "Player Six", new ArrayList<>(Arrays.asList(35, 45, 55)));
        Player player7 = new Player(7, "Player Seven", new ArrayList<>(Arrays.asList(40, 50, 60)));
        Player player8 = new Player(8, "Player Eight", new ArrayList<>(Arrays.asList(45, 55, 65)));
        Player player9 = new Player(9, "Player Nine", new ArrayList<>(Arrays.asList(50, 60, 70)));
        Player player10 = new Player(10, "Player Ten", new ArrayList<>(Arrays.asList(55, 65, 75)));

        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);
        players.add(player9);
        players.add(player10);

        players.forEach(player -> System.out.println(player));


        players.sort(Comparator.comparingInt(Player::getNumber).reversed());

        System.out.println("Отсортированные игроки по номеру (по убыванию):");
        players.forEach(player -> System.out.println(player));
    }
}

