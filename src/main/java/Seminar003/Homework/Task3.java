package Seminar003.Homework;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<String> solarSystem = new ArrayList<>();
        Random random = new Random();
        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        for (int i = 0; i < 30; i++) {
            solarSystem.add(solarSystemPlanets[random.nextInt(0, solarSystemPlanets.length)]);
        }
        System.out.println(solarSystem);

        Set<String> set = new LinkedHashSet<>(solarSystem);


        List<String> originSolarSistem = new ArrayList<>(set);

        System.out.println(originSolarSistem);

    }
}