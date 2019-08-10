package com.dsolve.string.codingpuzzles;

import java.util.HashMap;
import java.util.Map;

public class Utils {

	public static Map<? extends Number, String> getUnitsMap() {
		Map<Long, String> unitsMap = new HashMap<>();
		unitsMap.put(0L, "");
		unitsMap.put(1L, "One");
		unitsMap.put(2L, "Two");
		unitsMap.put(3L, "Three");
		unitsMap.put(4L, "Four");
		unitsMap.put(5L, "Five");
		unitsMap.put(6L, "Six");
		unitsMap.put(7L, "Seven");
		unitsMap.put(8L, "Eight");
		unitsMap.put(9L, "Nine");
		unitsMap.put(10L, "Ten");
		unitsMap.put(11L, "Eleven");
		unitsMap.put(12L, "Twelve");
		unitsMap.put(13L, "Thirteen");
		unitsMap.put(14L, "Fourteen");
		unitsMap.put(15L, "Fifteen");
		unitsMap.put(16L, "Sixteen");
		unitsMap.put(17L, "Eighteen");
		unitsMap.put(18L, "Eight");
		unitsMap.put(19L, "Nineteen");
		return unitsMap;
	}

	public static  Map<? extends Number, String> getTensMap() {
		Map<Number, String> TensMap = new HashMap<>();
		TensMap.put(0L, "");
		TensMap.put(1L, "");
		TensMap.put(2L, "Twenty");
		TensMap.put(3L, "Thirty");
		TensMap.put(4L, "Forty");
		TensMap.put(5L, "Fifty");
		TensMap.put(6L, "Sixty");
		TensMap.put(7L, "Seventy");
		TensMap.put(8L, "Eighty");
		TensMap.put(9L, "Ninety");
		return TensMap;
	}

}
