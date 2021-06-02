package ru.tcreator;

public interface PersonBuilderInterface {
    Person build() throws IllegalArgumentException;
    PersonBuilder setName(String name) throws FiledValueHasSetException;
    PersonBuilder setSurname(String surname) throws FiledValueHasSetException;
    PersonBuilder setAge(int age) throws FiledValueHasSetException;
    PersonBuilder setAddress(String address) throws FiledValueHasSetException;
}
