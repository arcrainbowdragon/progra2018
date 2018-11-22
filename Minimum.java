import java.util.Arrays;
public class Minimum{
	public static int arrayMin(int[] inputArray){
          //Ihr Code hier:
	    int len = inputArray.length;
	    if ( len == 1 ) {
		return inputArray[0];
	    } else {
		if ( inputArray[0] < inputArray[1] ) {
		    return arrayMin( copyOfRange(inputArray, 2, len ) + inputArray[0]);
		} else {
		    return arrayMin( copyOfRange(inputArray, 2, len ) + inputArray[1]);
		}
	    }
	} 
}
