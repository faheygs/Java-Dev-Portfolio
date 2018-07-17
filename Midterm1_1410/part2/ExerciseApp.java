package part2;

public class ExerciseApp {

	public static void main(String[] args) {
		String[] bikes = {"mountain", "city", "road", "kids"};
		StringBuilder sb = new StringBuilder();
		int count = 0;
		
		System.out.print("Participants brought ");
		for (String b: bikes) {
			
			if(count == bikes.length -1){
				sb.append(" - even " + b + " bikes");
				
			} else {
				sb.append(b + " bikes and ");
			}
			count++;
		}
		
		System.out.println(sb);
	}

}
