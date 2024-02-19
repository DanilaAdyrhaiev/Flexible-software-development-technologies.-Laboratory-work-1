package org.nau.Task1;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getTable());
    }
    public static String getTable() {
        List<Animal> animals = new AnimalService().generateTenAnimals();
        StringBuilder tableBuilder = new StringBuilder();
        String[] header = {"ID", "Kind", "Age", "Name", "Owner`s name"};

        tableBuilder.append("+---------------+---------------+---------------+---------------+---------------+\n");

        for (String columnHeader : header) {
            tableBuilder.append(String.format("| %-14s", columnHeader)); // Здесь мы устанавливаем ширину 13 символов для каждого столбца
        }
        tableBuilder.append("|\n");

        tableBuilder.append("+---------------+---------------+---------------+---------------+---------------+\n");

        for (Animal animal : animals) {
            String id = String.valueOf(animal.getId());
            String kind = animal.getKind();
            String age = String.valueOf(animal.getAge());
            String name = animal.getName();
            String ownerName = animal.getOwnerName();

            tableBuilder.append(String.format("| %-14s| %-14s| %-14s| %-14s| %-14s|%n", id, kind, age, name, ownerName)); // Здесь также устанавливаем ширину 13 символов для каждого значения
        }

        tableBuilder.append("+---------------+---------------+---------------+---------------+---------------+\n");

        return tableBuilder.toString();
    }
}
