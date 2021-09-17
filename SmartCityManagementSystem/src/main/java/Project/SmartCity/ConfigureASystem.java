package Project.SmartCity;

//import Project.SmartCity.Customer.CustomerDirectory;
//import Project.SmartCity.DeliveryMan.DeliveryManDirectory;
//import Project.SmartCity.Employee.Employee;
//import Project.SmartCity.Employee.EmployeeDirectory;
//import Project.SmartCity.Order.OrderDirectory;
//import Project.SmartCity.Restaurant.Menu;
//import Project.SmartCity.Restaurant.RestaurantDirectory;
//import Project.SmartCity.Role.AdminRole;
//import Project.SmartCity.Role.CustomerRole;
//import Project.SmartCity.Role.DeliverManRole;
//import Project.SmartCity.Role.SystemAdminRole;
//import Project.SmartCity.UserAccount.UserAccount;
import Project.Employee.Employee;
import Project.Employee.EmployeeDirectory;import Project.Employee.Employer;
import Project.Employee.EmployerDirectory;
import Project.Person.Person;
import Project.Person.PersonDirectory;
import Project.Role.AdminRole;
import Project.Role.BusinessOwnerRole;
import Project.Role.CommuterRole;
import Project.Role.CustomerRole;
import Project.Role.DeliverManRole;
import Project.Role.DoctorRole;
import Project.Role.FacultyRole;
import Project.Role.GeneralUserRole;
import Project.Role.ManagerRole;
import Project.Role.PatientRole;
import Project.Role.PharmacistRole;
import Project.Role.Role;
import Project.Role.ShopAdminRole;
import Project.Role.StudentRole;
import Project.Role.SystemAdminRole;
import Project.Role.TheatreAdminRole;
import Project.Role.TourGuideRole;
import Project.Role.TouristRole;
import Project.SmartCity.EducationalInstitution.School;
import Project.SmartCity.EducationalInstitution.SchoolDirectory;
import Project.SmartCity.EducationalInstitution.University;
import Project.SmartCity.EducationalInstitution.UniversityDirectory;
import Project.SmartCity.EducationalRoles.Faculty;
import Project.SmartCity.EducationalRoles.Student;
import Project.SmartCity.Establishment.Item;
import Project.SmartCity.Establishment.JobOrganization;
import Project.SmartCity.Establishment.JobOrganizationDirectory;
import Project.SmartCity.Establishment.Menu;
import Project.SmartCity.Establishment.MenuItem;
import Project.SmartCity.Establishment.Order;
import Project.SmartCity.Establishment.OrderDirectory;
import Project.SmartCity.Establishment.Residence;
import Project.SmartCity.Establishment.ResidenceDirectory;
import Project.SmartCity.Establishment.Restaurant;
import Project.SmartCity.Establishment.RestaurantDirectory;
import Project.SmartCity.Establishment.Shop;
import Project.SmartCity.Establishment.ShopDirectory;
import Project.SmartCity.Establishment.Theatre;
import Project.SmartCity.Establishment.TheatreDirectory;
import Project.SmartCity.EstablishmentRoles.BusinessOwner;
import Project.SmartCity.EstablishmentRoles.BusinessOwnerDirectory;
import Project.SmartCity.EstablishmentRoles.CustomerDirectory;
import Project.SmartCity.EstablishmentRoles.Manager;
import Project.SmartCity.EstablishmentRoles.ManagerDirectory;
import Project.SmartCity.HealthcareRoles.Doctor;
import Project.SmartCity.HealthcareRoles.DoctorDirectory;
import Project.SmartCity.HealthcareRoles.Patient;
import Project.SmartCity.HealthcareRoles.PatientDirectory;
import Project.SmartCity.HealthcareRoles.Pharmacist;
import Project.SmartCity.HealthcareSystem.Appointment;
import Project.SmartCity.HealthcareSystem.Hospital;
import Project.SmartCity.HealthcareSystem.HospitalDirectory;
import Project.SmartCity.HealthcareSystem.Pharmacy;
import Project.SmartCity.HealthcareSystem.PharmacyDirectory;
import Project.SmartCity.HealthcareSystem.Prescription;
import Project.SmartCity.SmartCity;
import Project.SmartCity.TourismRoles.TourGuide;
import Project.SmartCity.TourismRoles.TourGuideDirectory;
import Project.SmartCity.TourismRoles.Tourist;
import Project.SmartCity.TourismRoles.TouristDirectory;
import Project.SmartCity.TourismSystem.Aquarium;
import Project.SmartCity.TourismSystem.AquariumDirectory;
import Project.SmartCity.TourismSystem.Beach;
import Project.SmartCity.TourismSystem.BeachDirectory;
import Project.SmartCity.TourismSystem.Garden;
import Project.SmartCity.TourismSystem.GardenDirectory;
import Project.SmartCity.TourismSystem.Library;
import Project.SmartCity.TourismSystem.LibraryDirectory;
import Project.SmartCity.TourismSystem.Museum;
import Project.SmartCity.TourismSystem.MuseumDirectory;
import Project.SmartCity.TransportationRoles.Commuter;
import Project.SmartCity.TransportationRoles.CommuterDirectory;
import Project.SmartCity.TransportationSystem.Bus;
import Project.SmartCity.TransportationSystem.BusDirectory;
import Project.SmartCity.TransportationSystem.Cruise;
import Project.SmartCity.TransportationSystem.CruiseDirectory;
import Project.SmartCity.TransportationSystem.Flight;
import Project.SmartCity.TransportationSystem.FlightDirectory;
import Project.SmartCity.TransportationSystem.Train;
import Project.SmartCity.TransportationSystem.TrainDirectory;
import Project.UserAccount.UserAccount;
import com.github.javafaker.Faker;
import java.util.Random;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static SmartCity configure(){
        
        SmartCity system = SmartCity.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        system.setEmployeeDirectory(new EmployeeDirectory());
        system.setBusinessOwnerDirectory(new BusinessOwnerDirectory());
        system.setEmployerDirectory(new EmployerDirectory());
        system.setPersonDirectory(new PersonDirectory());
        system.setTheatreDirectory(new TheatreDirectory());
        system.setSchoolDirectory(new SchoolDirectory());
        system.setUniversityDirectory(new UniversityDirectory());
        system.setCustomerDirectory(new CustomerDirectory());
        system.setShopDirectory(new ShopDirectory());
        system.setRestaurantDirectory(new RestaurantDirectory());
        system.setResidenceDirectory(new ResidenceDirectory());
        system.setJobOrganizationDirectory(new JobOrganizationDirectory());

        system.setHospitalDirectory(new HospitalDirectory());
        system.setPharmacyDirectory(new PharmacyDirectory());
        system.setPatientDirectory(new PatientDirectory());
        system.setDoctorDirectory(new DoctorDirectory());

        system.setTourGuideDirectory(new TourGuideDirectory());
        system.setTouristDirectory(new TouristDirectory());
        system.setBeachDirectory(new BeachDirectory());
        system.setGardenDirectory(new GardenDirectory());
        system.setLibraryDirectory(new LibraryDirectory());
        system.setAquariumDirectory(new AquariumDirectory());
        system.setMuseumDirectory(new MuseumDirectory());

        system.setCommuterDirectory(new CommuterDirectory());
        system.setBusDirectory(new BusDirectory());
        system.setTrainDirectory(new TrainDirectory());
        system.setFlightDirectory(new FlightDirectory());
        system.setCruiseDirectory(new CruiseDirectory());
//        
//        system.getRestaurantDirectory().createRestaurant("Restaurant 1", "1460 Tremont", "restaurantAdmin");
//        system.getDeliveryManDirectory().createDeliveryMan("DeliveryMan 1", "1460 Tremont");
//        system.getCustomerDirectory().createCustomer("Customer", "1460 Tremont");
//        Menu menu = new Menu();
//        system.getRestaurantDirectory().getRestaurantList().get(0).setMenu(menu);
//        
//        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
//        Employee employee1 = system.getEmployeeDirectory().createEmployee("customer");
//        Employee employee2 = system.getEmployeeDirectory().createEmployee("restaurantAdmin");
//        Employee employee3 = system.getEmployeeDirectory().createEmployee("deliveryMan");
//        
//        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
//        UserAccount customer = system.getUserAccountDirectory().createUserAccount("customer", "customer", employee1, new CustomerRole());
//        UserAccount restaurantAdmin = system.getUserAccountDirectory().createUserAccount("restaurantAdmin", "restaurantAdmin", employee2, new AdminRole());
//        UserAccount deliveryMan = system.getUserAccountDirectory().createUserAccount("delivery", "delivery", employee3, new DeliverManRole());
//        


        Employee employee15 = system.getEmployeeDirectory().createEmployee("sysadmin");
        Employee employee1 = system.getEmployeeDirectory().createEmployee("businessOwner");
        Employee employee2 = system.getEmployeeDirectory().createEmployee("commuter");
        Employee employee3 = system.getEmployeeDirectory().createEmployee("customer");
        Employee employee4 = system.getEmployeeDirectory().createEmployee("delivery");
        Employee employee5 = system.getEmployeeDirectory().createEmployee("doctor");
        Employee employee6 = system.getEmployeeDirectory().createEmployee("faculty");
        Employee employee7 = system.getEmployeeDirectory().createEmployee("generalUser");
        Employee employee8 = system.getEmployeeDirectory().createEmployee("manager");
        Employee employee9 = system.getEmployeeDirectory().createEmployee("patient");
        Employee employee10 = system.getEmployeeDirectory().createEmployee("pharmacist");
        Employee employee11 = system.getEmployeeDirectory().createEmployee("restaurantAdmin");
        Employee employee12 = system.getEmployeeDirectory().createEmployee("student");
        Employee employee13 = system.getEmployeeDirectory().createEmployee("tourGuide");
        Employee employee14 = system.getEmployeeDirectory().createEmployee("tourist");
        Employee employee16 = system.getEmployeeDirectory().createEmployee("shop");
        Employee employee17 = system.getEmployeeDirectory().createEmployee("theatre");
        
        UserAccount sysadmin1 = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee15, new SystemAdminRole());
        UserAccount businessOwner1 = system.getUserAccountDirectory().createUserAccount("businessOwner", "businessOwner", employee1, new BusinessOwnerRole());
        UserAccount commuter1 = system.getUserAccountDirectory().createUserAccount("commuter", "commuter", employee2, new CommuterRole());
        UserAccount customer1 = system.getUserAccountDirectory().createUserAccount("customer", "customer", employee3, new CustomerRole());
        UserAccount delivery1 = system.getUserAccountDirectory().createUserAccount("delivery", "delivery", employee4, new DeliverManRole());
        UserAccount doctor1 = system.getUserAccountDirectory().createUserAccount("doctor", "doctor", employee5, new DoctorRole());
        UserAccount faculty1 = system.getUserAccountDirectory().createUserAccount("faculty", "faculty", employee6, new FacultyRole());
        UserAccount generalUser1 = system.getUserAccountDirectory().createUserAccount("generalUser", "generalUser", employee7, new GeneralUserRole());
        UserAccount manager1 = system.getUserAccountDirectory().createUserAccount("manager", "manager", employee8, new ManagerRole());
        UserAccount patient1 = system.getUserAccountDirectory().createUserAccount("patient", "patient", employee9, new PatientRole());
        UserAccount pharmacist1 = system.getUserAccountDirectory().createUserAccount("pharmacist", "pharmacist", employee10, new PharmacistRole());
        UserAccount restaurantAdmin1 = system.getUserAccountDirectory().createUserAccount("restaurantAdmin", "restaurantAdmin", employee11, new AdminRole());
        UserAccount student1 = system.getUserAccountDirectory().createUserAccount("student", "student", employee12, new StudentRole());
        UserAccount tourGuide1 = system.getUserAccountDirectory().createUserAccount("tourGuide", "tourGuide", employee13, new TourGuideRole());
        UserAccount tourist1 = system.getUserAccountDirectory().createUserAccount("tourist", "tourist", employee14, new TouristRole());
        UserAccount shop1 = system.getUserAccountDirectory().createUserAccount("shopAdmin", "shopAdmin", employee16, new ShopAdminRole());
        UserAccount theatre1 = system.getUserAccountDirectory().createUserAccount("theatreAdmin", "theatreAdmin", employee17, new TheatreAdminRole());
        
        String[] location = {"41", "-71"};
        system.getCommuterDirectory().createCommuter("commuter");
        system.getBusinessOwnerDirectory().createBusinessOwner("businessOwner");
        system.getTouristDirectory().createTourist("tourist", "Mexico", "SmartCity ManagementSystem");
        system.getTourGuideDirectory().createTourGuide("tourGuide", "Intermediate", "SmartCity ManagementSystem").setName("TourGuide");
        Hospital h = system.getHospitalDirectory().createHospital("SmartCity Public Hospital", location, "hospitalAdmin");
        Patient pa = h.getPatientDirectory().createPatient("patient", "23", "Healthy");
        pa.setName("Patient 1");
        system.getPatientDirectory().getPatientList().add(pa);
        Doctor d = h.getDoctorDirectory().createDoctor("doctor", "Pulmonologist", h.getName());
        d.setName("Doctor 1");
        system.getDoctorDirectory().getDoctorList().add(d);
        Pharmacy p = system.getPharmacyDirectory().createPharmacy("SmartCity Pharmacy", location, "pharmacist");
        p.getPharmacistDirectory().createPharmacist("pharmacist", p.getName(), "SmartCity").setName("Pharmacist 1");
        
        Theatre t = system.getTheatreDirectory().createTheatre("theatreAdmin", "SmartCity Talkies", location);
        Shop s = system.getShopDirectory().createShop("SmartCity Public Shop", location, "shopAdmin");
        Restaurant r = system.getRestaurantDirectory().createRestaurant("SmartCity Restaurant", location, "restaurantAdmin");
//        system.getPersonDirectory().createPerson("customer", "SmartCity Lane 5", "smartcitymanagementsystem@gmail.com", "9876543210", "");
        system.getCustomerDirectory().createCustomer("Customer", "customer");
        
        Faker faker = new Faker();
        Random random = new Random();
//        Employer[] employer = new Employer[10];
//        Employee[] employee = new Employee[50];
//        Person[] person = new Person[50];
//        UserAccount[] useraccount = new UserAccount[50];
//        int count=0;
//        String[] roles = {"Admin", "BusinessOwner", "Commuter", "Customer", "DeliverMan", "Doctor", "Faculty", "Manager", "Patient", "Pharmacist", "Student", "Sysadmin", "Tourist", "TourGuide"};
//        for(int i=0;i<10;i++){
//            employer[i] = system.getEmployerDirectory().createEmployer(faker.company().name(), faker.address().streetAddress());
//            employer[i].employeeDirectory.createEmployee(faker.name().fullName());
//            
//            for(int j=0;j<5;i++){
//                String FullName = faker.name().fullName();
//                employee[count] = employer[i].employeeDirectory.createEmployee(FullName);
//                person[count] = system.getPersonDirectory().createPerson(FullName, faker.address().streetAddress(), faker.bothify("?????###@?????.com"), faker.phoneNumber().cellPhone(), faker.letterify("??????"));
//                String TempRole = roles[random.nextInt(14)];
//                switch(TempRole){
//                    case "Admin": useraccount[count] = system.getUserAccountDirectory().createUserAccount(FullName, faker.bothify("?????##"), employee[count], new AdminRole()); break;
//                    case "BusinessOwner":useraccount[count] = system.getUserAccountDirectory().createUserAccount(FullName, faker.bothify("?????##"), employee[count], new BusinessOwnerRole()); break;
//                    case "Commuter":useraccount[count] = system.getUserAccountDirectory().createUserAccount(FullName, faker.bothify("?????##"), employee[count], new CommuterRole()); break;
//                    case "Customer":useraccount[count] = system.getUserAccountDirectory().createUserAccount(FullName, faker.bothify("?????##"), employee[count], new CustomerRole()); break;
//                    case "DeliverMan":useraccount[count] = system.getUserAccountDirectory().createUserAccount(FullName, faker.bothify("?????##"), employee[count], new DeliverManRole()); break;
//                    case "Doctor":useraccount[count] = system.getUserAccountDirectory().createUserAccount(FullName, faker.bothify("?????##"), employee[count], new DoctorRole()); break;
//                    case "Faculty":useraccount[count] = system.getUserAccountDirectory().createUserAccount(FullName, faker.bothify("?????##"), employee[count], new FacultyRole()); break;
//                    case "Manager":useraccount[count] = system.getUserAccountDirectory().createUserAccount(FullName, faker.bothify("?????##"), employee[count], new ManagerRole()); break;
//                    case "Patient":useraccount[count] = system.getUserAccountDirectory().createUserAccount(FullName, faker.bothify("?????##"), employee[count], new PatientRole()); break;
//                    case "Pharmacist":useraccount[count] = system.getUserAccountDirectory().createUserAccount(FullName, faker.bothify("?????##"), employee[count], new PharmacistRole()); break;
//                    case "Student":useraccount[count] = system.getUserAccountDirectory().createUserAccount(FullName, faker.bothify("?????##"), employee[count], new StudentRole()); break;
//                    case "Sysadmin":useraccount[count] = system.getUserAccountDirectory().createUserAccount(FullName, faker.bothify("?????##"), employee[count], new SystemAdminRole()); break;
//                    case "Tourist":useraccount[count] = system.getUserAccountDirectory().createUserAccount(FullName, faker.bothify("?????##"), employee[count], new TouristRole()); break;
//                    case "TourGuide":useraccount[count] = system.getUserAccountDirectory().createUserAccount(FullName, faker.bothify("?????##"), employee[count], new TourGuideRole()); break;
//                }
//                count++;
//            }
//            count++;
//        }
        
        School[] school = new School[30];
        Student[] student = new Student[40];
        Faculty[] faculty = new Faculty[40];
            String TempUser = faker.name().firstName();
            String[] TempLocation = {"Texas"};
            school[0] = system.getSchoolDirectory().createSchool("St. Mark's School of Texas", TempLocation, TempUser);
            for(int i=0;i<5;i++){
                student[i]=school[0].studentDirectory.createStudent();
            }
            faculty[0] = school[0].facultyDirectory.createFaculty();
            TempUser = faker.name().firstName();
            String[] TempLocation1 = {"New York"};
            school[1] = system.getSchoolDirectory().createSchool("Trinity School", TempLocation1, TempUser);
            for(int i=5;i<10;i++){
                student[i]=school[1].studentDirectory.createStudent();
            }
            faculty[1] = school[1].facultyDirectory.createFaculty();
            TempUser = faker.name().firstName();
            school[2] = system.getSchoolDirectory().createSchool("Horace Mann School", TempLocation1, TempUser);
            for(int i=10;i<15;i++){
                student[i]=school[2].studentDirectory.createStudent();
            }
            faculty[2] = school[2].facultyDirectory.createFaculty();
            TempUser = faker.name().firstName();
            school[3] = system.getSchoolDirectory().createSchool("Collegiate School", TempLocation1, TempUser);
            for(int i=15;i<20;i++){
                student[i]=school[3].studentDirectory.createStudent();
            }
            faculty[3] = school[3].facultyDirectory.createFaculty();
            TempUser = faker.name().firstName();
            school[4] = system.getSchoolDirectory().createSchool("The Brearley School", TempLocation1, TempUser);
            for(int i=20;i<25;i++){
                student[i]=school[4].studentDirectory.createStudent();
            }
            faculty[4] = school[4].facultyDirectory.createFaculty();
            
        
        University[] university = new University[30];
            TempUser = faker.name().firstName();
            String[] TempLocation3 = {"New Jersey"};
            university[0] = system.getUniversityDirectory().createUniversity("Princeton University", TempLocation3, TempUser);
            for(int i=25;i<30;i++){
                student[i]=university[0].studentDirectory.createStudent();
            }
            faculty[4] = university[0].facultyDirectory.createFaculty();
            TempUser = faker.name().firstName();
            String[] TempLocation4 = {"Cambridge"};
            university[1] = system.getUniversityDirectory().createUniversity("Harvard University", TempLocation4, TempUser);
            for(int i=30;i<35;i++){
                student[i]=university[1].studentDirectory.createStudent();
            }
            faculty[4] = university[1].facultyDirectory.createFaculty();
            TempUser = faker.name().firstName();
            String[] TempLocation5 = {"New York"};
            university[2] = system.getUniversityDirectory().createUniversity("Columbia University", TempLocation5, TempUser);
            for(int i=35;i<40;i++){
                student[i]=university[2].studentDirectory.createStudent();
            }
            faculty[4] = university[2].facultyDirectory.createFaculty();
            
            
            
         
        Hospital[] hospital = new Hospital[50];
        Doctor[] doctor = new Doctor[50];
        Patient[] patient = new Patient[200];
        Appointment[] appointment = new Appointment[100];
            TempUser = faker.name().firstName();
            String[] TempLocation6 = {faker.address().state()};
            int TempCountPatient=0, TempCountDoctor=0;
            int j1=random.nextInt(10), j2=random.nextInt(5);
            
            
            String[] TempLocationN = {faker.address().state()};
            hospital[0] = system.getHospitalDirectory().createHospital(faker.medical().hospitalName(), TempLocationN, faker.name().firstName());
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(), String.valueOf(random.nextInt(100)),faker.medical().diseaseName());
            String[] Symptoms1 = {faker.medical().symptoms()};
            appointment[TempCountPatient]=hospital[0].appointmentDirectory.createAppointment(faker.date().toString(), Symptoms1);
            TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(), String.valueOf(random.nextInt(100)), faker.medical().diseaseName());
            String[] Symptoms2 = {faker.medical().symptoms()};
            appointment[TempCountPatient]=hospital[0].appointmentDirectory.createAppointment(faker.date().toString(), Symptoms2);
            TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[0].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            doctor[TempCountDoctor] = hospital[0].doctorDirectory.createDoctor(faker.name().firstName(),"Orthopedist", hospital[0].name); TempCountDoctor++;
            doctor[TempCountDoctor] = hospital[0].doctorDirectory.createDoctor(faker.name().firstName(),"Cardiologist", hospital[0].name); TempCountDoctor++;
            doctor[TempCountDoctor] = hospital[0].doctorDirectory.createDoctor(faker.name().firstName(),"Neurosurgeon", hospital[0].name); TempCountDoctor++;
            doctor[TempCountDoctor] = hospital[0].doctorDirectory.createDoctor(faker.name().firstName(),"Dermatologist", hospital[0].name); TempCountDoctor++;
            doctor[TempCountDoctor] = hospital[0].doctorDirectory.createDoctor(faker.name().firstName(),"Pediatric", hospital[0].name); TempCountDoctor++;
            
            String[] TempLocationN01 = {faker.address().state()};
            hospital[1] = system.getHospitalDirectory().createHospital(faker.medical().hospitalName(), TempLocationN01, faker.name().firstName());
            patient[TempCountPatient]=hospital[1].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            String[] Symptoms3 = {faker.medical().symptoms()};
            appointment[TempCountPatient]=hospital[1].appointmentDirectory.createAppointment(faker.date().toString(), Symptoms3);
            TempCountPatient++;
            patient[TempCountPatient]=hospital[1].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            String[] Symptoms4 = {faker.medical().symptoms()};
            appointment[TempCountPatient]=hospital[1].appointmentDirectory.createAppointment(faker.date().toString(), Symptoms4);
            TempCountPatient++;
            doctor[TempCountDoctor] = hospital[1].doctorDirectory.createDoctor(faker.name().firstName(),"Dermatologist", hospital[0].name); TempCountDoctor++;
            doctor[TempCountDoctor] = hospital[1].doctorDirectory.createDoctor(faker.name().firstName(),"Pediatric", hospital[0].name); TempCountDoctor++;
            patient[TempCountPatient]=hospital[1].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[1].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[1].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[1].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[1].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[1].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[1].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[1].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[1].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            
            
            String[] TempLocationN02 = {faker.address().state()};
            hospital[2] = system.getHospitalDirectory().createHospital(faker.medical().hospitalName(), TempLocationN02, faker.name().firstName());
            patient[TempCountPatient]=hospital[2].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            String[] Symptoms5 = {faker.medical().symptoms()};
            appointment[TempCountPatient]=hospital[2].appointmentDirectory.createAppointment(faker.date().toString(), Symptoms5);
            TempCountPatient++;
            patient[TempCountPatient]=hospital[2].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            String[] Symptoms6 = {faker.medical().symptoms()};
            appointment[TempCountPatient]=hospital[2].appointmentDirectory.createAppointment(faker.date().toString(), Symptoms6);
            TempCountPatient++;
            doctor[TempCountDoctor] = hospital[2].doctorDirectory.createDoctor(faker.name().firstName(),"Cardiologist", hospital[2].name); TempCountDoctor++;
            patient[TempCountPatient]=hospital[2].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[2].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[2].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[2].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[2].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[2].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            
            String[] TempLocationN03 = {faker.address().state()};
            hospital[3] = system.getHospitalDirectory().createHospital(faker.medical().hospitalName(), TempLocationN03, faker.name().firstName());
            patient[TempCountPatient]=hospital[3].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(10)), faker.medical().diseaseName());TempCountPatient++;
            String[] Symptoms7 = {faker.medical().symptoms()};
            appointment[TempCountPatient]=hospital[3].appointmentDirectory.createAppointment(faker.date().toString(), Symptoms7);
            TempCountPatient++;
            patient[TempCountPatient]=hospital[3].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(10)), faker.medical().diseaseName());TempCountPatient++;
            String[] Symptoms8 = {faker.medical().symptoms()};
            appointment[TempCountPatient]=hospital[3].appointmentDirectory.createAppointment(faker.date().toString(), Symptoms8);
            TempCountPatient++;
            doctor[TempCountDoctor] = hospital[3].doctorDirectory.createDoctor(faker.name().firstName(), "Pediatric", hospital[3].name); TempCountDoctor++;
            patient[TempCountPatient]=hospital[3].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(10)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[3].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(10)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[3].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(10)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[3].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(10)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[3].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(10)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[3].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(10)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[3].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(10)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[3].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(10)), faker.medical().diseaseName());TempCountPatient++;    
            
            
            String[] TempLocationN04 = {faker.address().state()};
            hospital[4] = system.getHospitalDirectory().createHospital(faker.medical().hospitalName(), TempLocationN04, faker.name().firstName());
            patient[TempCountPatient]=hospital[3].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(10)), faker.medical().diseaseName());TempCountPatient++;
            String[] Symptoms9 = {faker.medical().symptoms()};
            appointment[TempCountPatient]=hospital[4].appointmentDirectory.createAppointment(faker.date().toString(), Symptoms9);
            TempCountPatient++;
            patient[TempCountPatient]=hospital[3].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(10)), faker.medical().diseaseName());TempCountPatient++;
            String[] Symptoms10 = {faker.medical().symptoms()};
            appointment[TempCountPatient]=hospital[4].appointmentDirectory.createAppointment(faker.date().toString(), Symptoms10);
            TempCountPatient++;
            doctor[TempCountDoctor] = hospital[4].doctorDirectory.createDoctor(faker.name().firstName(),"Cardiologist", hospital[4].name); TempCountDoctor++;
            doctor[TempCountDoctor] = hospital[4].doctorDirectory.createDoctor(faker.name().firstName(),"Neurosurgeon", hospital[4].name); TempCountDoctor++;
            doctor[TempCountDoctor] = hospital[4].doctorDirectory.createDoctor(faker.name().firstName(),"Dermatologist", hospital[4].name); TempCountDoctor++;
            doctor[TempCountDoctor] = hospital[4].doctorDirectory.createDoctor(faker.name().firstName(),"Pediatric", hospital[4].name); TempCountDoctor++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;
            patient[TempCountPatient]=hospital[4].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());TempCountPatient++;

           


            
        Pharmacy[] pharmacy = new Pharmacy[30];
        Pharmacist[] pharmacist = new Pharmacist[30];
        Prescription[] prescription = new Prescription[30];
        int TempCountPahrmacist =0, TempCountPrescription=0;
            for(int i=0;i<3;i++){
                String[] TempLocationN1 = {faker.address().state(), faker.address().state()};
                String PharmacyName = faker.company().name()+"Pharmacy";
                String PharmaUserName = faker.name().firstName();
                pharmacy[i]=system.getPharmacyDirectory().createPharmacy(PharmacyName, TempLocationN1, PharmaUserName);
                pharmacist[TempCountPahrmacist] = pharmacy[i].pharmacistDirectory.createPharmacist(faker.name().firstName(),PharmacyName, PharmaUserName);
                patient[TempCountPatient] = pharmacy[i].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());
                String[] drugs = {faker.medical().medicineName(), faker.medical().medicineName()};
                prescription[TempCountPrescription] = pharmacy[i].prescriptionDirectory.createPrescription(drugs);
                TempCountPatient++; TempCountPahrmacist++; TempCountPrescription++;
                pharmacist[TempCountPahrmacist] = pharmacy[i].pharmacistDirectory.createPharmacist(faker.name().firstName(),PharmacyName, PharmaUserName);
                patient[TempCountPatient] = pharmacy[i].patientDirectory.createPatient(faker.name().firstName(),String.valueOf(random.nextInt(100)), faker.medical().diseaseName());
                String[] drugs2 = {faker.medical().medicineName(), faker.medical().medicineName()};
                prescription[TempCountPrescription] = pharmacy[i].prescriptionDirectory.createPrescription(drugs2);
                TempCountPatient++; TempCountPahrmacist++; TempCountPrescription++;
            }
            
        
            
        Tourist[] tourist = new Tourist[15];
            for(int i=0;i<15;i++){
                 tourist[i] = system.getTouristDirectory().createTourist(faker.name().firstName(),faker.country().name(), faker.company().name()+" Tours & Travels");
            }
        
            
        TourGuide[] tourguide = new TourGuide[50];  
            tourguide[0] = system.getTourGuideDirectory().createTourGuide(faker.name().firstName(), "Highly Experienced", tourist[0].getTourismcompany());
            tourguide[0].setName(faker.name().firstName());
            tourguide[1] = system.getTourGuideDirectory().createTourGuide(faker.name().firstName(), "Intermediate", tourist[1].getTourismcompany());
            tourguide[1].setName(faker.name().firstName());
            tourguide[2] = system.getTourGuideDirectory().createTourGuide(faker.name().firstName(), "Highly Experienced", tourist[0].getTourismcompany());
            tourguide[2].setName(faker.name().firstName());
            tourguide[3] = system.getTourGuideDirectory().createTourGuide(faker.name().firstName(), "Intermediate", tourist[1].getTourismcompany());
            tourguide[3].setName(faker.name().firstName());
            tourguide[4] = system.getTourGuideDirectory().createTourGuide(faker.name().firstName(), "Begginer", tourist[1].getTourismcompany());
            tourguide[4].setName(faker.name().firstName());
            
            
            
        Beach[] beach = new Beach[50];
        Garden[] garden = new Garden[50];
        Library[] library = new Library[50];
        Aquarium[] aquarium = new Aquarium[50];
        Museum[] museum = new Museum[50];
            for(int i=0;i<5;i++){
                String[] TempLoactions = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
                String TempLocations1 = faker.address().state();
                String[] Artifacts = {"Statue of "+faker.ancient().primordial(), faker.ancient().primordial() + "Set", "Painting of "+faker.ancient().primordial()};
                museum[i] = system.getMuseumDirectory().createMuseum(TempLocations1 + "Museum of Arts", TempLoactions, faker.name().firstName(), Artifacts);
                museum[i].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            }
            String[] TempLoactionBeach = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            beach[0] = system.getBeachDirectory().createBeach("Paradise Beach", TempLoactionBeach, faker.name().firstName());
            beach[0].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            String[] TempLoactionGarden = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            garden[0] = system.getGardenDirectory().createGarden("Paradise Garden", TempLoactionGarden, faker.name().firstName());
            garden[0].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            String[] TempLoactionAquarium = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            aquarium[0] = system.getAquariumDirectory().createAquarium("Paradise Aquarium", TempLoactionAquarium, faker.name().firstName());
            aquarium[0].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            
            String[] TempLoactionBeach1 = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            beach[1] = system.getBeachDirectory().createBeach("Paradise Beach", TempLoactionBeach1, faker.name().firstName());
            beach[1].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            String[] TempLoactionGarden1 = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            garden[1] = system.getGardenDirectory().createGarden("Paradise Garden", TempLoactionGarden1, faker.name().firstName());
            garden[1].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            String[] TempLoactionAquarium1 = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            aquarium[1] = system.getAquariumDirectory().createAquarium("Paradise Aquarium", TempLoactionAquarium1, faker.name().firstName());
            aquarium[1].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            
            String[] TempLoactionBeach2 = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            beach[2] = system.getBeachDirectory().createBeach("Nantucket Beach", TempLoactionBeach, faker.name().firstName());
            beach[2].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            String[] TempLoactionGarden2 = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            garden[2] = system.getGardenDirectory().createGarden("Nantucket Garden", TempLoactionGarden, faker.name().firstName());
            garden[2].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            String[] TempLoactionAquarium2 = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            aquarium[2] = system.getAquariumDirectory().createAquarium("Nantucket Aquarium", TempLoactionAquarium, faker.name().firstName());
            aquarium[2].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            
            String[] TempLoactionBeach3 = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            beach[3] = system.getBeachDirectory().createBeach("Cape Cod. Beach", TempLoactionBeach3, faker.name().firstName());
            beach[3].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            String[] TempLoactionGarden3 = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            garden[3] = system.getGardenDirectory().createGarden("Cape Cod. Garden", TempLoactionGarden3, faker.name().firstName());
            garden[3].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            String[] TempLoactionAquarium3 = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            aquarium[3] = system.getAquariumDirectory().createAquarium("Cape Cod. Aquarium", TempLoactionAquarium3, faker.name().firstName());
            aquarium[3].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            
            String[] TempLoactionBeach4 = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            beach[4] = system.getBeachDirectory().createBeach("Boca Chica Beach", TempLoactionBeach4, faker.name().firstName());
            beach[4].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            String[] TempLoactionGarden4 = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            garden[4] = system.getGardenDirectory().createGarden("Boca Chica Garden", TempLoactionGarden4, faker.name().firstName());
            garden[4].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            String[] TempLoactionAquarium4 = {String.valueOf(random.nextInt(100+100)-100), String.valueOf(random.nextInt(100+100)-100)};
            aquarium[4] = system.getAquariumDirectory().createAquarium("Boca Chica Aquarium", TempLoactionAquarium4, faker.name().firstName());
            aquarium[4].setCost(String.valueOf(Math.abs(random.nextInt())%30));
            
            
        
        
        Commuter[] commuter = new Commuter[100]; 
        String[] CommuteMode = {"Train", "Bus", "Cruise", "Flight"};
            for(int i=0;i<20;i++){
                commuter[i] = system.getCommuterDirectory().createCommuter(CommuteMode[random.nextInt(4)]);
            }
        
            
            
        Bus[] bus = new Bus[50];
        Cruise[] cruise = new Cruise[50];
        Flight[] flight = new Flight[50];
        Train[] train = new Train[50];
            for(int i=0;i<10;i++){
                bus[i] = system.getBusDirectory().createBus(String.valueOf(random.nextInt(100)), faker.address().streetName(), faker.address().streetName(), faker.name().firstName());
                cruise[i] = system.getCruiseDirectory().createCruise(String.valueOf(random.nextInt(100)), faker.address().streetName(), faker.address().streetName(), faker.name().firstName());
                flight[i] = system.getFlightDirectory().createFlight(String.valueOf(random.nextInt(100)), faker.address().streetName(), faker.address().streetName(), faker.name().firstName());
                train[i] = system.getTrainDirectory().createTrain(String.valueOf(random.nextInt(100)), faker.address().streetName(), faker.address().streetName(), faker.name().firstName());
            }
            
         
        JobOrganization[] joborganization = new JobOrganization[15];
        BusinessOwner[] businessowner = new BusinessOwner[15];
        Manager[] manager = new Manager[15];
        Employee employee[] = new Employee[30];
        int EmpCount = 0;
            for(int i=0;i<15;i++){
                String[] TempLoactionJob = {faker.address().state()};
                joborganization[i] = system.getJobOrganizationDirectory().createJobOrganization(faker.company().name(), faker.company().industry(), TempLoactionJob, faker.name().firstName());
                //businessowner[i] =  joborganization[i].businessOwnerDirectory.createBusinessOwner();
                manager[i] = joborganization[i].managerDirectory.createManager();
                employee[EmpCount] = joborganization[i].employeeDirectory.createEmployee(faker.name().fullName());
                EmpCount++;
                employee[EmpCount] = joborganization[i].employeeDirectory.createEmployee(faker.name().fullName());
                EmpCount++;
            }
        
        
        Residence[] residence = new Residence[50];
        Restaurant[] restaurant = new Restaurant[50];
        Person[] person = new Person[100];
        Shop[] shop = new Shop[50];
        BusinessOwner[] businessownerRestaurant = new BusinessOwner[50];
        Manager[] managerdirectoryRestaurant = new Manager[50];
        Employee[] employeedirectoryRestaurant= new Employee[100];
        Order[] orderdirectoryRestaurant= new Order[100];
        MenuItem[] menuItem = new MenuItem[250];
        BusinessOwner[] businessownerShop = new BusinessOwner[50];
        Manager[] managerdirectoryShop = new Manager[50];
        Employee[] employeedirectoryShop= new Employee[250];
        Item[] ItemShop = new Item[250];
        
        int MenuCount = 0;
        int PersonCount = 0, employeeCount=0, orderCount=0, MenuCountShop=0, EmployeeCountShop=0;
            for(int i=0;i<15;i++){
                String[] ResidenceLocation = {faker.address().state()};
                residence[i] = system.getResidenceDirectory().createResidence(faker.address().buildingNumber(), ResidenceLocation, faker.name().firstName());
                String PersonName = faker.name().fullName();
                person[PersonCount] = residence[i].personDirectory.createPerson(PersonName, faker.address().fullAddress(), PersonName+"@gmail.com", faker.phoneNumber().cellPhone(), "D:\\Personal\\Wall\\astronaut-nasa-take-me-away-4k-9f.jpg");
                PersonCount++;
                person[PersonCount] = residence[i].personDirectory.createPerson(PersonName, faker.address().fullAddress(), PersonName+"@gmail.com", faker.phoneNumber().cellPhone(), "D:\\Personal\\Wall\\astronaut-nasa-take-me-away-4k-9f.jpg");
                PersonCount++;
                
                
                String[] RestaurantLocation = {String.valueOf(random.nextInt(100+100)-100)};
                restaurant[i] = system.getRestaurantDirectory().createRestaurant(faker.company().name(), RestaurantLocation, faker.name().firstName());
                menuItem[MenuCount] = restaurant[i].menu.addItem(faker.food().dish(), String.valueOf(random.nextInt(4000)), String.valueOf(random.nextInt(30)));
                MenuCount++;
                menuItem[MenuCount] = restaurant[i].menu.addItem(faker.food().dish(), String.valueOf(random.nextInt(4000)), String.valueOf(random.nextInt(30)));
                MenuCount++;
                menuItem[MenuCount] = restaurant[i].menu.addItem(faker.food().dish(), String.valueOf(random.nextInt(4000)), String.valueOf(random.nextInt(30)));
                MenuCount++;
                menuItem[MenuCount] = restaurant[i].menu.addItem(faker.food().dish(), String.valueOf(random.nextInt(4000)), String.valueOf(random.nextInt(30)));
                MenuCount++;
                menuItem[MenuCount] = restaurant[i].menu.addItem(faker.food().dish(), String.valueOf(random.nextInt(4000)), String.valueOf(random.nextInt(30)));
                MenuCount++;
                businessownerRestaurant[i] = restaurant[i].businessOwnerDirectory.createBusinessOwner(faker.name().firstName());
                managerdirectoryRestaurant[i] = restaurant[i].managerDirectory.createManager();
                employeedirectoryRestaurant[employeeCount] = restaurant[i].employeeDirectory.createEmployee(faker.name().fullName());
                employeeCount++;
                employeedirectoryRestaurant[employeeCount] = restaurant[i].employeeDirectory.createEmployee(faker.name().fullName());
                employeeCount++;
                
                
                
                String[] ShopLocation = {faker.address().streetAddress()};
                shop[i]=system.getShopDirectory().createShop(faker.company().name(), ShopLocation, faker.name().firstName());
                businessownerShop[i] = shop[i].businessOwnerDirectory.createBusinessOwner(faker.name().firstName());
                managerdirectoryShop[i] = shop[i].managerDirectory.createManager();
                employeedirectoryShop[EmployeeCountShop] = shop[i].employeeDirectory.createEmployee(faker.name().fullName());
                EmployeeCountShop++;
                employeedirectoryShop[EmployeeCountShop] = shop[i].employeeDirectory.createEmployee(faker.name().fullName());
                EmployeeCountShop++;
                employeedirectoryShop[EmployeeCountShop] = shop[i].employeeDirectory.createEmployee(faker.name().fullName());
                EmployeeCountShop++;
                employeedirectoryShop[EmployeeCountShop] = shop[i].employeeDirectory.createEmployee(faker.name().fullName());
                EmployeeCountShop++;
                employeedirectoryShop[EmployeeCountShop] = shop[i].employeeDirectory.createEmployee(faker.name().fullName());
                EmployeeCountShop++;
                ItemShop[MenuCountShop] = shop[i].itemDirectory.createItem(faker.commerce().productName());
                MenuCountShop++;
                ItemShop[MenuCountShop] = shop[i].itemDirectory.createItem(faker.commerce().productName());
                MenuCountShop++;
                ItemShop[MenuCountShop] = shop[i].itemDirectory.createItem(faker.commerce().productName());
                MenuCountShop++;
                ItemShop[MenuCountShop] = shop[i].itemDirectory.createItem(faker.commerce().productName());
                MenuCountShop++;
                ItemShop[MenuCountShop] = shop[i].itemDirectory.createItem(faker.commerce().productName());
                MenuCountShop++;
                
                
                
                
            }
        
            

        return system;
    }
    
}
