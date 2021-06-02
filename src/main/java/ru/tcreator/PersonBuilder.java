package ru.tcreator;

public class PersonBuilder implements PersonBuilderInterface{
    private String name;
    private String surname;
    private String address;
    private int age = -1;


    PersonBuilder() {}

    /**
     * setter for name
     * @param name {@link String}
     * @return {@link PersonBuilder}
     * @throws FiledValueHasSetException
     */
    @Override
    public PersonBuilder setName(String name) throws FiledValueHasSetException {
        if(this.name == null) {
            this.name = name;
        } else {
            throw new FiledValueHasSetException("Поле name уже было установлено");
        }
        return this;
    }

    /**
     * Building new Person objects with with filled fields
     * @return {@link Person}
     * @throws {@link IllegalArgumentException}
     */
    @Override
    public Person build() throws IllegalArgumentException {
        if(name != null && surname != null) {
            if(address != null && age != -1) {
                return new Person(name, surname, age, address);
            } else if(age != -1) {
                return new Person(name, surname, age);
            } else if(address != null) {
                return new Person(name, surname, address);
            }
            return new Person(name, surname);
        } else {
            throw new IllegalArgumentException("Недостаточно аргументов для создания объекта");
        }
    }


    /**
     * setter for surname
     * @param surname {@link String}
     * @return {@link PersonBuilder}
     * @throws FiledValueHasSetException if filed was been set earlier
     */
    @Override
    public PersonBuilder setSurname(String surname) throws FiledValueHasSetException{
        if(this.surname == null) {
            this.surname = surname;
        } else {
            throw new FiledValueHasSetException("Поле surname уже было установлено");
        }
        return this;
    }

    /**
     * setter for surname
     * @param age {@integer}}
     * @return {@link PersonBuilder}
     * @throws FiledValueHasSetException if filed was been set earlier
     */
    @Override
    public PersonBuilder setAge(int age) throws FiledValueHasSetException, IllegalArgumentException {
        if(this.age == -1) {
            if(age < 1 || age > 150) {
                throw new IllegalArgumentException("Возраст должен быть больше 0 и меньше 150");
            }
            this.age = age;
        } else {
            throw new FiledValueHasSetException("Поле age уже было установлено");
        }
        return this;
    }

    /**
     * setter for surname
     * @param address {@link String}
     * @return {@link PersonBuilder}
     * @throws FiledValueHasSetException if filed was been set earlier
     */
    @Override
    public PersonBuilder setAddress(String address) throws FiledValueHasSetException {
        if(this.address == null) {
            this.address = address;
        } else {
            throw new FiledValueHasSetException("Поле address уже было установлено");
        }
        return this;
    }
}
