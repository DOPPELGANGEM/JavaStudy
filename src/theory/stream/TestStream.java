package theory.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestStream {
	public static void main(String[] args) {
		// stream()이 없을때 목록에서 여성만 골라내려면 아래와 같이 for loop를 사용해야 한다.
//		System.out.println("여성목록");
//		for(People people : People.getPeopleList()) {
//			if(people.getGender() == 2) {
//				System.out.println(people);
//			}
//		}
		
		// stream()을 사용하면 filter를 사용하여 여성만 골라낼 수 있다.
		List<People> femaleList = People.getPeopleList().stream().filter(people -> people.getGender() == 2).collect(Collectors.toList());
		System.out.println("여성목록:");
		femaleList.forEach(System.out::println);
		
		// stream()에서 제공하는 sorted()를 사용하면 원하는 필드로 정렬을 할 수 있다.
		List<People> sortedList = People.getPeopleList().stream().sorted(Comparator.comparing(People::getAge)).collect(Collectors.toList());
		System.out.println("나이순 목록");
		sortedList.forEach(System.out::println);
		
		// stream()에서 제공하는 allMatch를 사용하면 모든 항목이 조건을 만족하는지 확인할수있다.
		boolean allMatch = People.getPeopleList().stream().allMatch(people -> people.getAge() > 12);
		System.out.println("나이가 모두 12보다 많은가?");
		System.out.println(allMatch);
		
		// stream()에서 제공하는 anyMatch를 사용하면 조건을 만족하는 항목이 하나라도 있는지 확인할 수 있다.
		boolean anyMatch = People.getPeopleList().stream().anyMatch(people -> people.getAge() > 19);
		System.out.println("나이가 19보다 많은 사람이 있는가?");
		System.out.println(anyMatch);
		
		// stream()에서 제공하는 noneMatch를 사용하면 조건을 만족하는 항목이 하나도 없는지 확인할 수 있다.
		boolean noneMatch = People.getPeopleList().stream().noneMatch(people -> people.getAge() > 19);
		System.out.println("나이가 19 보다 많은 사람이 있는가?");
		System.out.println(noneMatch);
		
		// stream()에서 제공하는 max를 사용하면 특정 필드를 기준으로 가장 큰 값을 가져올 수 있다.
		Optional<People> maxPeople = People.getPeopleList().stream().max(Comparator.comparing(People::getAge));
		if(maxPeople.isPresent()) {
			System.out.println("나이가 제일 많은 사람은?");
			System.out.println(maxPeople.get());
		}
		
		// stream()에서 제공하는 min을 사용하면 특정 필드를 기준으로 가장 작은 값을 가져올 수 있다.
		Optional<People> minPeople = People.getPeopleList().stream().min(Comparator.comparing(People::getAge));
		if(minPeople.isPresent()) {
			System.out.println("나이가 제일 적은 사람은?");
			System.out.println(minPeople.get());
		}
		
		// stream()에서 제공하는 collect와 Collectors.groupingBy를 사용하면 특정한 필드로 그룹을 만들어 맵을 만들 수 있다.
		Map<Integer, List<People>> groupByGender = People.getPeopleList().stream().collect(Collectors.groupingBy(People::getGender));
		System.out.println("남성/여성 목록");
		groupByGender.forEach((gender, peopleList) -> {
			System.out.println(gender);
			peopleList.forEach(System.out::println);
		});
		
		// 복합적으로 사용하는 것도 가능한데 아래는 목록에서 여성들 중 가장 나이가 많은 사람의 이름을 반환하는 코드이다.
		Optional<String> oldestWomanName = People.getPeopleList().stream().filter(people -> people.getGender() == 2).max(Comparator.comparing(People::getAge)).map(People::getName);
		System.out.println("여성들 중 가장 나이가 많은 사람의 이름은?");
		oldestWomanName.ifPresent(System.out::println);
	}
}




































