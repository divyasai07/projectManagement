package com.manage.bean;

public class Project {

	 private int projectId;
	    private String name;
	    private String description;
	    private String startDate;
	    private String endDate;
	    private int managerId;
		public int getProjectId() {
			return projectId;
		}
		public void setProjectId(int projectId) {
			this.projectId = projectId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getStartDate() {
			return startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public int getManagerId() {
			return managerId;
		}
		public void setManagerId(int managerId) {
			this.managerId = managerId;
		}
	    
	    public Project(int projectId,String name,String description,String startDate, String endDate,int managerId) {
	    	this.projectId=projectId;
	    	this.name=name;
	    	this.description=description;
	    	this.startDate=startDate;
	    	this.endDate=endDate;
	    	this.managerId=managerId;
	    }
	    public Project() {
	    	
	    }


}
