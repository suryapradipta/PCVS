import java.util.ArrayList;
import java.util.Objects;

public class Patient extends User{
    private String ICPassport;

    private ArrayList<Vaccination> vaccinations;

    public Patient() {
        this("unknown", "unknown", "unknown", "unknown", "unknown");
    }

    public Patient(String username, String password, String email, String fullName, String ICPassport) {
        super(username, password, email, fullName);
        this.ICPassport = ICPassport;
        this.vaccinations = new ArrayList<>();
    }

    public ArrayList<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(Vaccination newVaccinations) {
        this.vaccinations.add(newVaccinations);
    }




    public String getICPassport() {
        return ICPassport;
    }

    public void setICPassport(String ICPassport) {
        this.ICPassport = ICPassport;
    }

    /*public boolean equals(Object obj)
    {
        if (this == obj) // same object
            return true;
        if (!(obj instanceof Patient)) // not correct class!
            return false;
        Patient rhs = (Patient) obj; // downcast
        if ((this.ICPassport == rhs.ICPassport))
            return true;		// employee number is unique
	    else			// so it is same employee
            return false;
    }*/





    @Override
    public String toString() {
        return super.toString() +
            "\nIC Passport: " + ICPassport;
    }
}
