import java.util.ArrayList;

public class PCVS {
    private ArrayList<HealthcareCentre> PCVSHealthcareCentres; // array list to hold collection healthcare centre
    private ArrayList<User> PCVSUsers;
    private ArrayList<Vaccine> PCVSVaccines;


    /*
    * Constructor
    * */
    public PCVS() {
        PCVSHealthcareCentres = new ArrayList<>(); // instantiate a new array object
        PCVSHealthcareCentres.add(new HealthcareCentre("Balimed Hospital", "Jl. Mahendradatta No.57 X"));
        PCVSHealthcareCentres.add(new HealthcareCentre("RSIA Puri Bunda", "Jl. Gatot Subroto VI No.19"));
        PCVSHealthcareCentres.add(new HealthcareCentre( "Prima Medika Hospital", "Jl. Raya Sesetan No.10"));

        PCVSUsers = new ArrayList<>();

        PCVSVaccines = new ArrayList<>();
        PCVSVaccines.add(new Vaccine("JNJ", "Janssen Pharmaceutical Companies", "Johnson & Johnson"));
        PCVSVaccines.add(new Vaccine("ASZ", "AstraZeneca, University of Oxford", "AstraZeneca"));
        PCVSVaccines.add(new Vaccine("MOD", "Moderna, NIAID", "Moderna"));

    }

    // USER COLLECTION
    public ArrayList<User> getPCVSUsers() {
        return PCVSUsers;
    }

    public void setPCVSUser(ArrayList<User> PCVSUsers) {
        this.PCVSUsers = PCVSUsers;
    }

    public void addUser(User newUser)
    {
        PCVSUsers.add(newUser);
    }

    public String getAllPatient() {
        String all = "";
        for (int i = 0; i < PCVSUsers.size(); i++) { // looping
            all += i+1  + ". " + PCVSUsers.get(i) + "\n";
        }
        return all;
    }
    // USER COLLECTION END


    // HEALTHCARE COLLECTION
    public ArrayList<HealthcareCentre> getPCVSHealthcareCentres() { // getter
        return PCVSHealthcareCentres;
    }

    public String getAllHealthcareCentres() {
        String all = "";
        for (int i = 0; i < PCVSHealthcareCentres.size(); i++) { // looping
            all += i+1  + ". " + PCVSHealthcareCentres.get(i).getCentreName() + "\n";
        }
        return all;
    }
    public String debuggHealthcare() {
        String all = "";
        for (int i = 0; i < PCVSHealthcareCentres.size(); i++) { // looping
            all += i+1  + ". " + PCVSHealthcareCentres.get(i) + "\n";
        }
        return all;
    }
    // HEALTHCARE COLLECTION END

    //VALIDATION USER LOGIN
    public String findUser(String username, String password)
    {
        for (int i = 0; i < getPCVSHealthcareCentres().size(); i++)
        {
            HealthcareCentre HC = getPCVSHealthcareCentres().get(i);
            for(int j =0; j < HC.getAdministrators().size(); j++) {
                if (HC.getAdministrators().get(j).getUsername().equals(username))
                    if(HC.getAdministrators().get(j).getPassword().equals(password))
                        return HC.getCentreName();
            }
        }
        return null;
    }
    // VALIDATION USER LOGIN END


    //VACCINE
    public String getAllVaccines() {
        String all = "";
        for (int i = 0; i < PCVSVaccines.size(); i++) { // looping
            all += i+1  + ". " + PCVSVaccines.get(i).getVaccineID() + "\n";
        }
        return all;
    }

    public String DebuggVaccine() {
        String all = "";
        for (int i = 0; i < PCVSVaccines.size(); i++) { // looping
            all += i+1  + ". " + PCVSVaccines.get(i) + "\n";
        }
        return all;
    }

    public ArrayList<Vaccine> getPCVSVaccines() {
        return PCVSVaccines;
    }

    //VACIINE END






    /*
    * DEBUGG
    * */






}

