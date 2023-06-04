/**
 * 
 */
package com.alonso.lambdas.comparator;

import java.util.Comparator;

/**
 * @author Jalonso98
 *
 */
public class PersonNameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
