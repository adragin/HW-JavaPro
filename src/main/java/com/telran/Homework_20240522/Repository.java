package com.telran.Homework_20240522;

public class Repository {
    private int index;
    private Person[] storage;
    private int count;

    public Repository(int count) {
        this.count = count;
        this.storage = new Person[this.count + 1];
        this.index = 0;
    }

    public void append(String personName, int personAge) {
        storage[index] = new Person(personName, personAge);
        index += 1;
    }

    public void append(Person person) {
        storage[index] = person;
        index += 1;
    }

    /**
     * Получение Person по указанному id
     *
     * @param id - идентификатор пользователя
     * @return Person
     */
    public Person getPersonById(int id) {
        if (id < 0 || id >= index) {
            return null;
        }
        return storage[id];
    }

    public void removePersonById(int id) {
        if (id >= 0 && id < index) {
            for (int i = id; i < index - 1; i++) {
                storage[i] = storage[i + 1];
            }
            storage[index - 1] = null;
            index -= 1; // куда потом добавлять
        }
    }

    public void removePerson(Person person) {
        int indexToRemove = -1;
        for (int i = 0; i < index; i++) {
            if (storage[i].equals(person)) {
                indexToRemove = i;
                break;
            }
        }
        removePersonById(indexToRemove);
    }

    public int size() {
        return index;
    }


}
