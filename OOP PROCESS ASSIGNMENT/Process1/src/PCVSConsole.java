import java.util.Scanner;

public class PCVSConsole {

    private static Scanner input = new Scanner(System.in);
    public static PCVS pcvs = new PCVS();
    public static void main(String[] args) {



        int menu = 0;
        while (menu != 7) {
            System.out.println("\nVaccination Menu:");
            System.out.println("\t1. Sign up");
            System.out.println("\t2. Record new vaccine batch");
            System.out.println("\t3. ");
            System.out.println("\t4. ");
            System.out.println("\t5. ");
            System.out.println("\t6. Get all patient");
            System.out.println("\t7. Quit the program.");
            System.out.print("Menu of choices: ");
            menu = input.nextInt();
            input.nextLine();

            String username, password, email, fullName, ICPassport;
            char category;

            switch (menu) {
                case 1 -> {
                    System.out.println("\nCreate your Healthcare Administrator account");
                    System.out.println(pcvs.getAllHealthcareCentres());
                    System.out.println("Press 0 to sign up as Patient");
                    System.out.print("Select the healthcare centre: ");
                    int choice = input.nextInt();
                    input.nextLine();
                    if(choice == 0) {
                        category = 'p';
                        System.out.println("\nCreate your Patient account");
                        signUpUser(category);
                    }
                    else if(choice == 1) {
                        category = 'a';
                        System.out.println("\n" + pcvs.getPCVSHealthcareCentres().get(0));
                        signUpUser(category);

                    }

                }
                case 4 -> {
                    System.out.println(pcvs.getPCVSHealthcareCentres().get(0).getCentreName());
                }
                case 5-> {
                    System.out.println(pcvs.getPCVSHealthcareCentres().get(0));
                }
                case 6 -> {
                    System.out.println(pcvs.getAllPatient());
                }


            }
        }
    }

    public static Integer count = 0;
    public static String generateStaffID() {

        String res5 = count.toString().length() == 1 ? ("00" + count)
            : count.toString().length() == 2 ? ("0" + count) : count.toString();
        count = count + 1;
        String finalResult = "ADM" + res5;
        return finalResult;
    }

    public static void signUpUser(char category) {
        Patient newPatient = new Patient();
        Administrator newAdmin = new Administrator();


        System.out.print("Enter username: ");
        if(category == 'p')
            newPatient.setUsername(input.nextLine());
        else if(category == 'a')
            newAdmin.setUsername(input.nextLine());

        System.out.print("Enter password: ");
        if(category == 'p')
            newPatient.setPassword(input.nextLine());
        else if(category == 'a')
            newAdmin.setPassword(input.nextLine());

        System.out.print("Enter email: ");
        if(category == 'p')
            newPatient.setEmail(input.nextLine());
        else if(category == 'a')
            newAdmin.setEmail(input.nextLine());

        System.out.print("Enter full name: ");
        if(category == 'p')
            newPatient.setFullName(input.nextLine());
        else if(category == 'a')
            newAdmin.setFullName(input.nextLine());

        if(category == 'p') {
            System.out.print("Enter IC or passport: ");
            newPatient.setICPassport(input.nextLine());
            pcvs.addUser(newPatient);
            System.out.println();
            System.out.println(newPatient);
            System.out.println("\nSign up success! A Patient account is created.");
        }

        else if(category == 'a') {
            newAdmin.setStaffID(generateStaffID());
            pcvs.addUser(newAdmin);
            System.out.println();
            System.out.println(newAdmin);
            pcvs.getPCVSHealthcareCentres().get(0).setAdministrator(newAdmin);
            System.out.println("\nSign up success! A Healthcare Administrator account is created.");
            System.out.println(pcvs.getPCVSHealthcareCentres().get(0));

        }







    }





}
