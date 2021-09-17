/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity;

import Project.Employee.EmployeeDirectory;
import Project.Employee.EmployerDirectory;
import Project.Person.PersonDirectory;
import Project.Role.AdminRole;
import Project.Role.BusinessOwnerRole;
import Project.Role.CommuterRole;
import Project.Role.CustomerRole;
import Project.Role.DeliverManRole;
import Project.Role.DoctorRole;
import Project.Role.FacultyRole;
import Project.Role.ManagerRole;
import Project.Role.PatientRole;
import Project.Role.PharmacistRole;
import Project.Role.Role;
import Project.Role.StudentRole;
import Project.Role.SystemAdminRole;
import Project.Role.TourGuideRole;
import Project.Role.TouristRole;
import Project.SmartCity.EducationalInstitution.SchoolDirectory;
import Project.SmartCity.EducationalInstitution.UniversityDirectory;
import Project.SmartCity.TourismRoles.TourGuideDirectory;
import Project.SmartCity.TourismRoles.TouristDirectory;
import Project.SmartCity.TransportationRoles.CommuterDirectory;
//import Project.UserAccount.UserAccountDirectory;
import Project.SmartCity.Establishment.JobOrganizationDirectory;
import Project.SmartCity.Establishment.ResidenceDirectory;
import Project.SmartCity.Establishment.RestaurantDirectory;
import Project.SmartCity.Establishment.ShopDirectory;
import Project.SmartCity.Establishment.TheatreDirectory;
import Project.SmartCity.EstablishmentRoles.BusinessOwnerDirectory;
import Project.SmartCity.EstablishmentRoles.CustomerDirectory;
import Project.SmartCity.HealthcareRoles.DoctorDirectory;
import Project.SmartCity.HealthcareRoles.PatientDirectory;
import Project.SmartCity.HealthcareSystem.HospitalDirectory;
import Project.SmartCity.HealthcareSystem.PharmacyDirectory;
import Project.SmartCity.TourismSystem.AquariumDirectory;
import Project.SmartCity.TourismSystem.BeachDirectory;
import Project.SmartCity.TourismSystem.GardenDirectory;
import Project.SmartCity.TourismSystem.LibraryDirectory;
import Project.SmartCity.TourismSystem.MuseumDirectory;
import Project.SmartCity.TourismSystem.TourismSystemRating;
import Project.SmartCity.TransportationSystem.BusDirectory;
import Project.SmartCity.TransportationSystem.TrainDirectory;
import Project.SmartCity.TransportationSystem.FlightDirectory;
import Project.SmartCity.TransportationSystem.CruiseDirectory;

import java.util.ArrayList;

/**
 *
 * @author Okami
 */
public class SmartCity extends Organization{
    private static SmartCity city;

    private EmployeeDirectory employeeDirectory;
    private TheatreDirectory theatreDirectory;
    
    private EmployerDirectory employerDirectory;
    private PersonDirectory personDirectory;
    
    private SchoolDirectory schoolDirectory;
    private UniversityDirectory universityDirectory;

    private BusinessOwnerDirectory businessOwnerDirectory;
    private ShopDirectory shopDirectory;
    private RestaurantDirectory restaurantDirectory;
    private ResidenceDirectory residenceDirectory;
    private JobOrganizationDirectory jobOrganizationDirectory;
    private CustomerDirectory customerDirectory;
    private HospitalDirectory hospitalDirectory;
    private PharmacyDirectory pharmacyDirectory;
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    
    private TourGuideDirectory tourGuideDirectory;
    private TouristDirectory touristDirectory;
    private BeachDirectory beachDirectory;
    private GardenDirectory gardenDirectory;
    private LibraryDirectory libraryDirectory;
    private AquariumDirectory aquariumDirectory;
    private MuseumDirectory museumDirectory;
    
    private CommuterDirectory commuterDirectory;
    private BusDirectory busDirectory;
    private TrainDirectory trainDirectory;
    private FlightDirectory flightDirectory;
    private CruiseDirectory cruiseDirectory;
    
    private TourismSystemRating tourismSystemRating;
    
    public SmartCity(TourismSystemRating tourismSystemRating,CustomerDirectory customerDirectory, TheatreDirectory theatreDirectory, BusinessOwnerDirectory businessOwnerDirectory, EmployeeDirectory employeeDirectory, EmployerDirectory employerDirectory, PersonDirectory personDirectory, SchoolDirectory schoolDirectory, UniversityDirectory universityDirectory, ShopDirectory shopDirectory, RestaurantDirectory restaurantDirectory, ResidenceDirectory residenceDirectory, JobOrganizationDirectory jobOrganizationDirectory, HospitalDirectory hospitalDirectory, PharmacyDirectory pharmacyDirectory, PatientDirectory patientDirectory, DoctorDirectory doctorDirectory, TourGuideDirectory tourGuideDirectory, TouristDirectory touristDirectory, BeachDirectory beachDirectory, AquariumDirectory aquariumDirectory, GardenDirectory gardenDirectory, LibraryDirectory libraryDirectory, MuseumDirectory museumDirectory, CommuterDirectory commuterDirectory, BusDirectory busDirectory, TrainDirectory trainDirectory, FlightDirectory flightDirectory, CruiseDirectory cruiseDirectory) {
        this.businessOwnerDirectory = businessOwnerDirectory;
        this.employeeDirectory = employeeDirectory;
        this.theatreDirectory = theatreDirectory;
        this.employerDirectory = employerDirectory;
        this.personDirectory = personDirectory;
        this.customerDirectory = customerDirectory;
        this.schoolDirectory = schoolDirectory;
        this.universityDirectory = universityDirectory;

        this.shopDirectory = shopDirectory;
        this.restaurantDirectory = restaurantDirectory;
        this.residenceDirectory = residenceDirectory;
        this.jobOrganizationDirectory = jobOrganizationDirectory;

        this.hospitalDirectory = hospitalDirectory;
        this.pharmacyDirectory = pharmacyDirectory;
        this.patientDirectory = patientDirectory;
        this.doctorDirectory = doctorDirectory;
        
        this.tourGuideDirectory = tourGuideDirectory;
        this.touristDirectory = touristDirectory;
        this.beachDirectory = beachDirectory;
        this.gardenDirectory = gardenDirectory;
        this.libraryDirectory = libraryDirectory;
        this.aquariumDirectory = aquariumDirectory;
        this.museumDirectory = museumDirectory;

        this.commuterDirectory = commuterDirectory;
        this.busDirectory = busDirectory;
        this.trainDirectory = trainDirectory;
        this.flightDirectory = flightDirectory;
        this.cruiseDirectory = cruiseDirectory;
          this.tourismSystemRating = tourismSystemRating;
    }
    
    public static SmartCity getInstance(){
        if(city==null){
            city=new SmartCity();
        }
        return city;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        roleList.add(new AdminRole());
        roleList.add(new BusinessOwnerRole());
        roleList.add(new CommuterRole());
        roleList.add(new CustomerRole());
        roleList.add(new DeliverManRole());
        roleList.add(new DoctorRole());
        roleList.add(new FacultyRole());
        roleList.add(new ManagerRole());
        roleList.add(new PatientRole());
        roleList.add(new PharmacistRole());
        roleList.add(new StudentRole());
        roleList.add(new TouristRole());
        roleList.add(new TourGuideRole());
        return roleList;
    }

    private SmartCity(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    public static SmartCity getBusiness() {
        return city;
    }

    public static void setBusiness(SmartCity city) {
        SmartCity.city = city;
    }

    public static SmartCity getCity() {
        return city;
    }

    public static void setCity(SmartCity city) {
        SmartCity.city = city;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    
    
    public TheatreDirectory getTheatreDirectory() {
        return theatreDirectory;
    }

    public void setTheatreDirectory(TheatreDirectory theatreDirectory) {
        this.theatreDirectory = theatreDirectory;
    }

    public TourismSystemRating getTourismSystemRating() {
        return tourismSystemRating;
    }

    public void setTourismSystemRating(TourismSystemRating tourismSystemRating) {
        this.tourismSystemRating = tourismSystemRating;
    }

    
    
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public EmployerDirectory getEmployerDirectory() {
        return employerDirectory;
    }

    public void setEmployerDirectory(EmployerDirectory employerDirectory) {
        this.employerDirectory = employerDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public BusinessOwnerDirectory getBusinessOwnerDirectory() {
        return businessOwnerDirectory;
    }

    public void setBusinessOwnerDirectory(BusinessOwnerDirectory businessOwnerDirectory) {
        this.businessOwnerDirectory = businessOwnerDirectory;
    }

    
    
    public SchoolDirectory getSchoolDirectory() {
        return schoolDirectory;
    }

    public void setSchoolDirectory(SchoolDirectory schoolDirectory) {
        this.schoolDirectory = schoolDirectory;
    }

    public void setAquariumDirectory(AquariumDirectory aquariumDirectory) {
        this.aquariumDirectory = aquariumDirectory;
    }

    public AquariumDirectory getAquariumDirectory() {
        return aquariumDirectory;
    }

    public UniversityDirectory getUniversityDirectory() {
        return universityDirectory;
    }

    public void setUniversityDirectory(UniversityDirectory universityDirectory) {
        this.universityDirectory = universityDirectory;
    }

    public ShopDirectory getShopDirectory() {
        return shopDirectory;
    }

    public void setShopDirectory(ShopDirectory shopDirectory) {
        this.shopDirectory = shopDirectory;
    }

    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public ResidenceDirectory getResidenceDirectory() {
        return residenceDirectory;
    }

    public void setResidenceDirectory(ResidenceDirectory residenceDirectory) {
        this.residenceDirectory = residenceDirectory;
    }

    public JobOrganizationDirectory getJobOrganizationDirectory() {
        return jobOrganizationDirectory;
    }

    public void setJobOrganizationDirectory(JobOrganizationDirectory jobOrganizationDirectory) {
        this.jobOrganizationDirectory = jobOrganizationDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public void setPharmacyDirectory(PharmacyDirectory pharmacyDirectory) {
        this.pharmacyDirectory = pharmacyDirectory;
    }

    public TourGuideDirectory getTourGuideDirectory() {
        return tourGuideDirectory;
    }

    public void setTourGuideDirectory(TourGuideDirectory tourGuideDirectory) {
        this.tourGuideDirectory = tourGuideDirectory;
    }

    public TouristDirectory getTouristDirectory() {
        return touristDirectory;
    }

    public void setTouristDirectory(TouristDirectory touristDirectory) {
        this.touristDirectory = touristDirectory;
    }

    public BeachDirectory getBeachDirectory() {
        return beachDirectory;
    }

    public void setBeachDirectory(BeachDirectory beachDirectory) {
        this.beachDirectory = beachDirectory;
    }

    public GardenDirectory getGardenDirectory() {
        return gardenDirectory;
    }

    public void setGardenDirectory(GardenDirectory gardenDirectory) {
        this.gardenDirectory = gardenDirectory;
    }

    public LibraryDirectory getLibraryDirectory() {
        return libraryDirectory;
    }

    public void setLibraryDirectory(LibraryDirectory libraryDirectory) {
        this.libraryDirectory = libraryDirectory;
    }

    public MuseumDirectory getMuseumDirectory() {
        return museumDirectory;
    }

    public void setMuseumDirectory(MuseumDirectory museumDirectory) {
        this.museumDirectory = museumDirectory;
    }

    public CommuterDirectory getCommuterDirectory() {
        return commuterDirectory;
    }

    public void setCommuterDirectory(CommuterDirectory commuterDirectory) {
        this.commuterDirectory = commuterDirectory;
    }

    public BusDirectory getBusDirectory() {
        return busDirectory;
    }

    public void setBusDirectory(BusDirectory busDirectory) {
        this.busDirectory = busDirectory;
    }

    public TrainDirectory getTrainDirectory() {
        return trainDirectory;
    }

    public void setTrainDirectory(TrainDirectory trainDirectory) {
        this.trainDirectory = trainDirectory;
    }

    public FlightDirectory getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(FlightDirectory flightDirectory) {
        this.flightDirectory = flightDirectory;
    }

    public CruiseDirectory getCruiseDirectory() {
        return cruiseDirectory;
    }

    public void setCruiseDirectory(CruiseDirectory cruiseDirectory) {
        this.cruiseDirectory = cruiseDirectory;
    }

    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
