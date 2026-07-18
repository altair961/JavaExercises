package chapter01;

public class Exercise11 {

	public static void main(String[] args) {
		double seconds = 365 * 24 * 60 * 60;
		double births = seconds / 7;
		double deaths = seconds / 13;
		double immigrants = seconds / 45;
		double yearPopulationDelta = births + immigrants - deaths;
		double afterFirstYear = 312_032_486 + yearPopulationDelta;
		double afterSecondYear = afterFirstYear + yearPopulationDelta;
		double afterThirdYear = afterSecondYear + yearPopulationDelta;
		double afterFourthYear = afterThirdYear + yearPopulationDelta;
		double afterFifthYear = afterFourthYear + yearPopulationDelta;
		
		System.out.printf("Population after 5 years: %.2f%n", afterFifthYear);

	}

}
