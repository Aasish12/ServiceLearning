package ServiceModel.Types;

public class HoursType {
    private int hourId;

    public HoursType() {}

    public HoursType(int hourId) {
        this.hourId = hourId;
    }

    /* Gets */
    public int getHourId() { return this.hourId; }

    /* Sets */

    @Override
    public String toString() {
        return " HourId : " + this.hourId;
    }
}
