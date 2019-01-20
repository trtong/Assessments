package rocks.zipcode.quizweek7.objectorientation.animals;

import rocks.zipcode.quizweek7.objectorientation.Address;
import rocks.zipcode.quizweek7.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 */
public class Animal {

    private Person owner = new Person();
    private Long id;

    public Animal() {
    }



    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
        this.id = id;
        this.owner = owner;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
    }

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Address getAddress() {
        return getOwner().getAddress();
    }

    public void setAddress(Address address) {
        getOwner().setAddress(address);
    }
}
