package ru.tcreator;

public class Main {
    static public void main(String ...args) {
        try {
            Person mom = new PersonBuilder()
                    .setName("Анна")
                    .setSurname("Вольф")
                    .setAge(31)
                    .build();
            Person son = mom.newChildBuilder()
                    .setName("Антошка")
                    .build();
            System.out.println("У " + mom + " есть сын, " + son);
        } catch (FiledValueHasSetException | IllegalArgumentException e ) {
            System.out.println(e.getMessage());
        }
        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException | FiledValueHasSetException e) {
            e.printStackTrace();
        }
    }

}
