public class Pair {
    private final String key;
    private final String value;

    public Pair ( String key, String value ) {
	this.key = key;
	this.value = value;
    }

    public Pair ( String key, int value ) {
	this.key = key;
	this.value = String.valueOf(value);
    }

    public String toString () {
	String keyValuePair = "'" + key + "': '" + value + "'";
	return keyValuePair;
    }

    public Pair fromString ( String pairString ) {
	String[] params = pairString.split("'");
	Pair pairFromString = new Pair ( params[0], params[2]);
	return pairFromString;
    }

    public String getValue () {
	return value;
    }

    public String getKey () {
	return key;
    }
}
