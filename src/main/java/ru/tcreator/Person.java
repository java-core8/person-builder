package ru.tcreator;

public class Person {
    private final String name;
    protected final String surname;
    protected String address;
    private int age;

    /**
     * Constructor
     * @param name {@link String}
     * @param surname {@link String}
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * Constructor
     * @param name {@link String}
     * @param surname {@link String}
     * @param age {@link int}
     */
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    /**
     * Constructor
     * @param name {@link String}
     * @param surname {@link String}
     * @param address {@link String}
     */
    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    /**
     * Constructor
     * @param name {@link String}
     * @param surname {@link String}
     * @param age {@link int}
     * @param address {@link String}
     */
    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    /**
     * getter name
     * @return name {@link String}
     */
    public String getName() {
        return name;
    }

    /**
     * getter surname
     * @return surname {@link String}
     */
    public String getSurname() {
        return surname;
    }

    /**
     * getter address
     * @return address {@link String}
     */
    public String getAddress() {
        return address;
    }

    /**
     * getter age
     * @return age {@link int}
     */
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


    /**
     * return {@link PersonBuilder} with set surname and address fields
     * @return PersonBuilder {@link PersonBuilder}
     * @throws {@link FiledValueHasSetException}
     */
    public PersonBuilder newChildBuilder() throws FiledValueHasSetException {
        return new PersonBuilder().setSurname(surname).setAddress(address);
    }
}
