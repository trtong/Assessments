package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character delimeter;
    private StringBuilder sb;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        sb = new StringBuilder();
    }

    public StringAssembler append(String str) {
        sb.append(str);
        sb.append(delimeter);
        return this;
    }

    public String assemble() {
        return sb.toString().substring(0, sb.toString().length()-1);
    }
}
