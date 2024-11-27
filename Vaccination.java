package Eligiblefordose;

abstract class Vaccine {
    int age;
    String nationality;
//constructor to initialize age and nationality
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }
//concrete method for first dose
    public void firstDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("First dose administered. Please pay 250 INR.");
        } else {
            System.out.println("Not eligible for first dose.");
        }
    }
//concrete method for second dose
    public void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted) {
            System.out.println("Second dose administered.");
        } else {
            System.out.println("Please complete the first dose first.");
        }
    }
    //abstract method for booster dose

    public abstract void boosterDose();
}

//implementation class for booster dose
class VaccinationSuccessful extends Vaccine {
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        System.out.println("Booster dose administered. You are fully vaccinated!");
    }
}

//main class to test the vaccination process

public class Vaccination {

	public static void main(String[] args) {
		//instantiate vaccinationSuccessful class data for a user
		int age = 20;
		String nationality="Indian";
		//instantiate vaccinationsuccessful class
		VaccinationSuccessful person1=new VaccinationSuccessful(age,nationality);
		//scenario 1:first dose
		person1.firstDose();
		//scenario 2: second dose
		person1.secondDose(true);
		//scenario 3:booster dose
		person1.boosterDose();
	}

}
