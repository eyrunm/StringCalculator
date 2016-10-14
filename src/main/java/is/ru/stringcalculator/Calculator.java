package is.ru.stringcalculator;
import java.lang.IllegalArgumentException;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		if(text.contains(",")){
			return sum(splitNumbers(text));
		}
		if ( text.contains("-") )
		{
			throw new IllegalArgumentException("Negatives not allowed!");
		}
		if(text.contains("\n")){
			return sum(splitNumbersNewLine(text));
		}
		else
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",");
	}
	private static String[] splitNumbersNewLine(String numbers){
	    return numbers.split("\n");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }



}