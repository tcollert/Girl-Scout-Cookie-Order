package cookies;

public class CookieOrder {

    String varietyOfCookie;
    int numBoxes;

    public CookieOrder(String varietyOfCookie, int numBoxes) {
        this.varietyOfCookie = varietyOfCookie;
        this.numBoxes = numBoxes;
    }

    public String getVarietyOfCookie() {
        return this.varietyOfCookie;
    }

    public int getNumBoxes() {
        return this.numBoxes;

    }
}