public class Pair {
    private static final String key;
    private static final String value;
    
    public Pair ( String key; String value ) {
	this.key = key;
	this.value = value;
    }

    public Pair ( String key; int value ) {
	this.key = key;
	this.value = Integer.toString(value);
    }
    
    public String getKey () {
	return this.key;
    }

    public String getValue () {
	return this.value;
    }

    public String toString () {
	String ebnfOutput = "";
    }
}
