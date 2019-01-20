package rocks.zipcode.quizweek7.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Person {

    private Long id = Long.MIN_VALUE;
    private String name = "";
    private Address address = new Address();

    public Person() {
    }

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        Person person2 = (Person) obj;

        if (nullCheck(this.id, person2.id)) {
            if (nullCheck(this.name, person2.name)) {
                return nullCheck(this.address, person2.address);
            }
        }

        return false;
    }

    private boolean nullCheck(Object id1, Object id2) {
        if (id1 == null && id2 == null) {
            return true;
        } else return id1 != null & id2 != null && id1.equals(id2);
    }

    @Override
    public String toString() {
        return "Person{id=" + this.id + ", "
                + "name=\'" + this.name+ "\', "
                + "address=" + this.address.toString() + "}";
    }
}