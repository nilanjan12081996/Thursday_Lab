package thursdaylab;
//create a class student
 class Student {
	 //instance variable
	 int stdId;
	 String stdName;
	 String mailId;
	 long phNo;
	 String course;
	 //create getter and setter method
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public Long getPhNo() {
		return phNo;
	}
	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	//create constructor of class Student
	public Student(int stdId,String stdName,String mailId,long phNo,String course)
	{
		this.stdId=stdId;
		this.stdName=stdName;
		this.mailId=mailId;
		this.phNo=phNo;
		this.course=course;
	}
	/*@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [stdId=");
		builder.append(stdId);
		builder.append(", stdName=");
		builder.append(stdName);
		builder.append(", mailId=");
		builder.append(mailId);
		builder.append(", phNo=");
		builder.append(phNo);
		builder.append(", course=");
		builder.append(course);
		builder.append("]");
		return builder.toString();
	}*/
	

}
