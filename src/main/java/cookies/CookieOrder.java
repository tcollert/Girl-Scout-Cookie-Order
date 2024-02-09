package cookies;

public class CookieOrder {

    String varietyOfCookie;
    int numBoxes;

    private String variety;
    private String localVariety;
    private int localNumBoxes;

    public CookieOrder(String varietyOfCookie, int numBoxes) {
        this.varietyOfCookie = varietyOfCookie;
        this.numBoxes = numBoxes;
    }

    public String getVarietyOfCookie() {
        return this.varietyOfCookie;
    }

    public void setVarietyOfCookie(String varietyOfCookie) {
        this.varietyOfCookie = varietyOfCookie;
    }

    public int getNumBoxes() {
        return this.numBoxes;
    }

    public void setNumBoxes(int numBoxes) {
        this.numBoxes = numBoxes;

    }
}
