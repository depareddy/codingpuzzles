package com.dsolve.string.codingpuzzles;

import java.util.Map;
import java.util.Optional;

/**
 * Hello world!
 *
 */
public class App {
	
	public final Map<? extends Number,String> unitsMap;
	public final Map<? extends Number,String> tensMap;
	
	App()
	{
		unitsMap=Utils.getUnitsMap();
		tensMap=Utils.getTensMap();
	}


	public Optional<String>  speak(long n) {
		if (n < 0) {
			return Optional.of("Minus " + speak(-n).get());
		}
		else if(n<20) {
			return Optional.of(unitsMap.get(n).toLowerCase());
		}
		else if(n<100)
		{			
			
			return Optional.of(tensMap.get(n/10).toLowerCase()+((n%10!=0)?" "	:"")	+unitsMap.get(n%10).toLowerCase());	
		}
		else if(n<1000)
		{			
			return Optional.of(unitsMap.get(n / 100).toLowerCase() + " hundred" + ((n % 100 != 0) ? " and " : "") + speak(n % 100).get());

		}
		else if(n>=1000 && n<1000000)
		{			
			return Optional.of((speak(n / 1000)).get() + " thousand" + ((n % 1000 != 0) ? " " : "") + speak(n % 1000).get());

		}
		else if(n>=1000000 && n< 1000000000 )
		{
			return Optional.of(speak((n / 1000000)).get() + " million" + ((n % 1000000 != 0) ? " " : "") + speak(n % 1000000).get());
		}
		else if(n>1000000000)
		{
			return Optional.of(speak((n / 1000000000)).get() + " billion" + ((n % 1000000000 != 0) ? " " : "") + speak(n % 1000000000).get());
		}
		return Optional.empty();

	}
	 
}
