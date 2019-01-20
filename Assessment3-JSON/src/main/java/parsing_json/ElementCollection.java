package parsing_json;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ElementCollection extends ArrayList<Element> {

    public ElementCollection() {
        super();
    }

    public ElementCollection(ArrayList<Element> result) {
        this.addAll(result);
    }

    public Element findByAtomicNumber(int atomic_number) {
        for (Element e: this) {
            if (e.getNumber() == atomic_number) {
                return e;
            }
        }
        return null;
    }

    public Element findByName(String name) {
        for (Element e: this
        ) {
            if (e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }

    public ElementCollection where(String fieldName, Object value /*String*/){

        Class<Element> el = Element.class;
        ElementCollection collToReturn = new ElementCollection();
        for (Element e: this) {
            try {
                Field f = el.getDeclaredField(fieldName);
                f.setAccessible(true);
                Object valueToCheck = f.get(e);

                if (valueToCheck.equals(value)) {
                    collToReturn.add(e);
                }
            } catch (NoSuchFieldException nsfe) {
                return new ElementCollection();
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            }
        }
        return collToReturn;
    }
}
