package basicprogs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
class Person{
	int id;
	String name;
	String city;
	public Person(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public String getCity() {
        return city;
    }
	public String getName() {
        return name;
    }
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
	
}
public class LaunchStreamDemo 
{

	public static void main(String[] args)
	{
		List<Person> person=new ArrayList<>();
		person.add(new Person(1,"vijay","new york"));
		person.add(new Person(2,"amar","London"));
		person.add(new Person(3,"jaani","new york"));
		person.add(new Person(4,"sahadev","California"));
		person.add(new Person(5,"sami","new york"));
		person.add(new Person(6,"ramana","California"));
		Map<String, Set<String>> map=person.stream().collect(Collectors.groupingBy(Person::getCity,
				Collectors.mapping(Person::getName,Collectors.toSet())));
		System.out.println(map);
		
		
	}
}
