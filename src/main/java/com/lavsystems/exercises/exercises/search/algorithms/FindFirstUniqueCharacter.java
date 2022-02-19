/*
 * Copyright 2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lavsystems.exercises.exercises.search.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * This Class contains search algorithms for Strings.
 * 
 * @author lavSystems.
 */
public class FindFirstUniqueCharacter{

	/**
	 * This method retrieve the index of the unique character in String.
	 * 
	 * @param source {@link String}
	 * 
	 * @return int index, retrieve the index of the unique character in String
	 * otherwise -1;
	 */
	public static int findIndex(String source) {
		int response = -1;
		Map<String, Integer> myMap = new HashMap<>();
		
		for(char c : source.toCharArray()) {
			if(null == myMap.get(String.valueOf(c))) {
				myMap.put(String.valueOf(c), 1);
			}else {
				myMap.put(String.valueOf(c), myMap.get(String.valueOf(c)) +1 );
			}
		}
		
		for(int i = 0;i <= source.length();i++ ) {
			String character = String.valueOf(source.charAt(i));
			if(myMap.get(character) == 1) {
				return i;
			}
		}
		
		return response;
	}
}
