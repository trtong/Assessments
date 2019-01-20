package rocks.zipcode.quiz5.collections;

import rocks.zipcode.quiz5.objectorientation.Spice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spices =  new ArrayList<>();

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<Class<? extends Spice>, Integer> spiceCount = new HashMap<>();

//        for (int i = 0; i < spices.size(); i++) {
//            spiceCount.putIfAbsent(spices.get(i), 1);
//        }
        for (Spice s: spices
             ) {
            if (spiceCount.keySet().contains(s.getClass())) {
                spiceCount.put(s.getClass(), spiceCount.get(s.getClass()) + 1);
            } else {
                spiceCount.put(s.getClass(), 1);
            }
        }
        return (Map<SpiceType, Integer>) spiceCount;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
