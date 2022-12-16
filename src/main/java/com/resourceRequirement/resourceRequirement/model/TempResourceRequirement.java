package com.resourceRequirement.resourceRequirement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.transform.TupleSubsetResultTransformer;

@Entity
public class TempResourceRequirement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long TempResourceRequirementId;

	@ManyToOne
	@JoinColumn(name = "employeeId")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "hiringTypeId",nullable=true)
	private HiringType hiringType;


	@ManyToOne
	@JoinColumn(name = "countryId",nullable=true)
	private Country country;

	@ManyToOne
	@JoinColumn(name = "stateId",nullable=true)
	private State state;

	@ManyToOne
	@JoinColumn(name = "cityId",nullable=true)
	private City city;
    
	@Column(nullable=true)
	private boolean relocationStatus;

	@Column(nullable=true)
	private int relocationPeriod;

	@Column(nullable=true)
	private boolean passportStatus;

	@Column(nullable=true)
	private boolean visa;

	@Column(nullable=true)
	private int positions;

	@Column(nullable=true)
	private int experience;

//	@Column(nullable=true)
//	private String unitName;

	@ManyToOne
	@JoinColumn(name = "resourceTypeId",nullable=true)
	private ResourceType resourceType;

	// List-box-muliple select
	@Column(nullable=true)
	private String technologies;

	// List-box-muliple select
	@Column(nullable=true)
	private String skills;

	// List-box-muliple select
	@Column(nullable=true)
	private String domainKnowledges;

	@Column(nullable=true)
	private long salesOrderNo;

	@Column(nullable=true)
	private int noOfJRs;

	@Column(nullable=true)
	private String jobDescriptionDoc;

	@ManyToOne
	@JoinColumn(name = "qualificationId",nullable=true)
	private Qualification qualification;

	@ManyToOne
	@JoinColumn(name = "degreeId",nullable=true)
	private QualificationDegree qualificationDegree;

	@ManyToOne
	@JoinColumn(name = "specializationId",nullable=true)
	private QualificationSpecialization qualificationSpecialization;
	
	@Column(nullable=true)
	private boolean deleteStatus;

	public TempResourceRequirement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TempResourceRequirement(long tempResourceRequirementId, Employee employee, HiringType hiringType,
			Country country, State state, City city, boolean relocationStatus, int relocationPeriod,
			boolean passportStatus, boolean visa, int positions, int experience, ResourceType resourceType,
			String technologies, String skills, String domainKnowledges, long salesOrderNo, int noOfJRs,
			String jobDescriptionDoc, Qualification qualification, QualificationDegree qualificationDegree,
			QualificationSpecialization qualificationSpecialization, boolean deleteStatus) {
		super();
		TempResourceRequirementId = tempResourceRequirementId;
		this.employee = employee;
		this.hiringType = hiringType;
		this.country = country;
		this.state = state;
		this.city = city;
		this.relocationStatus = relocationStatus;
		this.relocationPeriod = relocationPeriod;
		this.passportStatus = passportStatus;
		this.visa = visa;
		this.positions = positions;
		this.experience = experience;
		this.resourceType = resourceType;
		this.technologies = technologies;
		this.skills = skills;
		this.domainKnowledges = domainKnowledges;
		this.salesOrderNo = salesOrderNo;
		this.noOfJRs = noOfJRs;
		this.jobDescriptionDoc = jobDescriptionDoc;
		this.qualification = qualification;
		this.qualificationDegree = qualificationDegree;
		this.qualificationSpecialization = qualificationSpecialization;
		this.deleteStatus = deleteStatus;
	}

	public long getTempResourceRequirementId() {
		return TempResourceRequirementId;
	}

	public void setTempResourceRequirementId(long tempResourceRequirementId) {
		TempResourceRequirementId = tempResourceRequirementId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public HiringType getHiringType() {
		return hiringType;
	}

	public void setHiringType(HiringType hiringType) {
		this.hiringType = hiringType;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public boolean isRelocationStatus() {
		return relocationStatus;
	}

	public void setRelocationStatus(boolean relocationStatus) {
		this.relocationStatus = relocationStatus;
	}

	public int getRelocationPeriod() {
		return relocationPeriod;
	}

	public void setRelocationPeriod(int relocationPeriod) {
		this.relocationPeriod = relocationPeriod;
	}

	public boolean isPassportStatus() {
		return passportStatus;
	}

	public void setPassportStatus(boolean passportStatus) {
		this.passportStatus = passportStatus;
	}

	public boolean isVisa() {
		return visa;
	}

	public void setVisa(boolean visa) {
		this.visa = visa;
	}

	public int getPositions() {
		return positions;
	}

	public void setPositions(int positions) {
		this.positions = positions;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public ResourceType getResourceType() {
		return resourceType;
	}

	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}

	public String getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getDomainKnowledges() {
		return domainKnowledges;
	}

	public void setDomainKnowledges(String domainKnowledges) {
		this.domainKnowledges = domainKnowledges;
	}

	public long getSalesOrderNo() {
		return salesOrderNo;
	}

	public void setSalesOrderNo(long salesOrderNo) {
		this.salesOrderNo = salesOrderNo;
	}

	public int getNoOfJRs() {
		return noOfJRs;
	}

	public void setNoOfJRs(int noOfJRs) {
		this.noOfJRs = noOfJRs;
	}

	public String getJobDescriptionDoc() {
		return jobDescriptionDoc;
	}

	public void setJobDescriptionDoc(String jobDescriptionDoc) {
		this.jobDescriptionDoc = jobDescriptionDoc;
	}

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	public QualificationDegree getQualificationDegree() {
		return qualificationDegree;
	}

	public void setQualificationDegree(QualificationDegree qualificationDegree) {
		this.qualificationDegree = qualificationDegree;
	}

	public QualificationSpecialization getQualificationSpecialization() {
		return qualificationSpecialization;
	}

	public void setQualificationSpecialization(QualificationSpecialization qualificationSpecialization) {
		this.qualificationSpecialization = qualificationSpecialization;
	}

	public boolean isDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	
}
