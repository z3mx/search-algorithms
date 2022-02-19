package com.lavsystems.exercises.exercises.search.algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;



/**
 * 
 * @author Luis Antonio
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class FindFirstUniqueCharacterTest {

	/**
	 * Given
	 * When
	 * Then
	 */
	@Test
	public void testFindFirstUniqueCharacter() {
		String stringTest = "aabcdd";
		int index = FindFirstUniqueCharacter.findIndex(stringTest);
		Assert.assertEquals(2, index);
	}
}
