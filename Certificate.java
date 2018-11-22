public class Certificate {
    private Algorithm algo;
    private Pair[] keyValuePairs;
    private String signature;

    public Certificate ( Algorithm algo, Pair ... pairs) {
	this.algo = algo;
	this.keyValuePairs = pairs;
    }

    public String getValue ( String key ) {
	String value = null;
	for ( String pair : keyValuePairs ) {
	    if ( pair.getKey() == key ){
		value = pair.getValue();
	    }
	}
	return value;
    }

    public Certificate fromstring ( String certString ) {
	params = certString.split(";");
	Algorithm algo = new Algorithm;
	switch ( params[0] ) {
	    case "HMAC_MD5":
		algo = HMAC_MD5;
		break;
	    
	    case "HMAC_SHA256":
		algo = HMAC_SHA256;
		break;
	    
	    case "HMAC_SHA1":
		algo = HMAC_SHA1;
		break;
	}
	
	String[] keyValueStrings = params[1].split(",");
	Pair[] keyValuePairs = new Pair[keyValueStrins.length];
	int num = 0;
	for ( String pair : keyValueStrings ) {
	    keyValuePairs[k] = new Pair.fromString( pair );
	}
	
	String signature = params[2];

	return Certificte( algo, keyValuePairs );
    }
}
