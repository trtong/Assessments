package rocks.zipcode.quizweek7.collections;

import rocks.zipcode.quizweek7.objectorientation.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 28/11/2018.
 */
public class Family implements Iterable<Person> {
    private ArrayList<Person> family = new ArrayList<>();
    /**
     * @param newFamilyMember - person object to be added to family
     */
    public void add(Person newFamilyMember) {
        family.add(newFamilyMember);
    }

    /**
     * @param newFamilyMember - family member to be evaluated
     * @return true if `newFamilyMember` is a member of this family
     */
    public Boolean contains(Person newFamilyMember) {
        return family.contains(newFamilyMember);
    }

    /**
     * @param newFamilyMember - family member to be removed
     */
    public void remove(Person newFamilyMember) {
        family.remove(newFamilyMember);

    }

    /**
     * @param index - index of family member to be retrieved
     * @return family member at the specified index
     */
    public Person get(int index) {
        return family.get(index);
    }

    /**
     * @param predicate - expression to evaluate for filtering
     * @return all `Person` objects whose `predicate` evaluation returns `true`
     */
    public List<Person> where(Predicate<Person> predicate) {

        return family.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    /**
     * @param startingCharacter - starting character of `Person` name
     * @return List of person objects whose name starts with the specified character
     */
    public List<Person> whereNameStartsWith(String startingCharacter) {
        return family.stream()
                .filter(person -> person.getName().substring(0,1).equalsIgnoreCase(startingCharacter))
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<Person> iterator() {
        return family.iterator();
    }

    @Override
    public void forEach(Consumer<? super Person> action) {

    }

    @Override
    public Spliterator<Person> spliterator() {
        return null;
    }
}
