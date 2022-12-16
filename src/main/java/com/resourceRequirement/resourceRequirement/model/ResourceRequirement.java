package com.resourceRequirement.resourceRequirement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ResourceRequirement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long resourceRequirementId;

	@ManyToOne
	@JoinColumn(name = "employeeId")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "hiringTypeId")
	private HiringType hiringType;

	private String createdOn;

	private String availabilityDate;

	@ManyToOne
	@JoinColumn(name = "countryId")
	private Country country;

	@ManyToOne
	@JoinColumn(name = "stateId")
	private State state;

	@ManyToOne
	@JoinColumn(name = "cityId")
	private City city;

	private boolean relocationStatus;

	private int relocationPeriod;

	private boolean passportStatus;

	private boolean visa;

	// private boolean readyToWorkShifts;

	private int positions;

	private int experience;

	private String unitName;

	@ManyToOne
	@JoinColumn(name = "resourceTypeId")
	private ResourceType resourceType;

	// List-box-muliple select
	private String technologies;

	// List-box-muliple select
	private String skills;

	// List-box-muliple select
	private String domainKnowledges;

	private long salesOrderNo;

	private int noOfJRs;

	private String jobDescriptionDoc;

	@ManyToOne
	@JoinColumn(name = "qualificationId")
	private Qualification qualification;

	@ManyToOne
	@JoinColumn(name = "degreeId")
	private QualificationDegree qualificationDegree;

	@ManyToOne
	@JoinColumn(name = "specializationId")
	private QualificationSpecialization qualificationSpecialization;

	private long approverId;

	private String approverName;

	private String approvedDate;

	public ResourceRequirement() {
		super();
	}

	public ResourceRequirement(long resourceRequirementId, Employee employee, HiringType hiringType, String createdOn,
			String availabilityDate, Country country, State state, City city, boolean relocationStatus,
			int relocationPeriod, boolean passportStatus, boolean visa, int positions, int experience, String unitName,
			ResourceType resourceType, String technologies, String skills, String domainKnowledges, long salesOrderNo,
			int noOfJRs, String jobDescriptionDoc, Qualification qualification, QualificationDegree qualificationDegree,
			QualificationSpecialization qualificationSpecialization, long approverId, String approverName,
			String approvedDate) {
		super();
		this.resourceRequirementId = resourceRequirementId;
		this.employee = employee;
		this.hiringType = hiringType;
		this.createdOn = createdOn;
		this.availabilityDate = availabilityDate;
		this.country = country;
		this.state = state;
		this.city = city;
		this.relocationStatus = relocationStatus;
		this.relocationPeriod = relocationPeriod;
		this.passportStatus = passportStatus;
		this.visa = visa;
		this.positions = positions;
		this.experience = experience;
		this.unitName = unitName;
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
		this.approverId = approverId;
		this.approverName = approverName;
		this.approvedDate = approvedDate;
	}

	public long getResourceRequirementId() {
		return resourceRequirementId;
	}

	public void setResourceRequirementId(long resourceRequirementId) {
		this.resourceRequirementId = resourceRequirementId;
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

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getAvailabilityDate() {
		return availabilityDate;
	}

	public void setAvailabilityDate(String availabilityDate) {
		this.availabilityDate = availabilityDate;
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

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
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

	public long getApproverId() {
		return approverId;
	}

	public void setApproverId(long approverId) {
		this.approverId = approverId;
	}

	public String getApproverName() {
		return approverName;
	}

	public void setApproverName(String approverName) {
		this.approverName = approverName;
	}

	public String getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
	}

	@Override
	public String toString() {
		return "ResourceRequirement [resourceRequirementId=" + resourceRequirementId + ", employee=" + employee
				+ ", hiringType=" + hiringType + ", createdOn=" + createdOn + ", availabilityDate=" + availabilityDate
				+ ", country=" + country + ", state=" + state + ", city=" + city + ", relocationStatus="
				+ relocationStatus + ", relocationPeriod=" + relocationPeriod + ", passportStatus=" + passportStatus
				+ ", visa=" + visa + ", positions=" + positions + ", experience=" + experience + ", unitName="
				+ unitName + ", resourceType=" + resourceType + ", technologies=" + technologies + ", skills=" + skills
				+ ", domainKnowledges=" + domainKnowledges + ", salesOrderNo=" + salesOrderNo + ", noOfJRs=" + noOfJRs
				+ ", jobDescriptionDoc=" + jobDescriptionDoc + ", qualification=" + qualification
				+ ", qualificationDegree=" + qualificationDegree + ", qualificationSpecialization="
				+ qualificationSpecialization + ", approverId=" + approverId + ", approverName=" + approverName
				+ ", approvedDate=" + approvedDate + "]";
	}

}
