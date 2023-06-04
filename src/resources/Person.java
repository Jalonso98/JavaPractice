/**
 * 
 */
package resources;

import java.util.Random;

/**
 * @author Jalonso98
 *
 */
public class Person {
	private String name;
	private Integer age;
	
	public Person(String name) {
		this.name = name;
		this.age = new Random().nextInt(100);
	}

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}