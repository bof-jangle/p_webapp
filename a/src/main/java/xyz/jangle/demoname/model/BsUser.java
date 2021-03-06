package xyz.jangle.demoname.model;

import java.util.Date;

public class BsUser extends BaseModel {
	
	public static final String youkeCode = "2";
	
	public static final String youkePassword = "p;.";

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column bs_user.usr_id
	 * 
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	private Integer usrId;
	
	private String uuid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column bs_user.usr_name
	 * 
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	private String usrName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column bs_user.usr_code
	 * 
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	private String usrCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column bs_user.usr_password
	 * 
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	private String usrPassword;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column bs_user.usr_status
	 * 
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	private Integer usrStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column bs_user.create_time
	 * 
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column bs_user.update_time
	 * 
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column bs_user.extends1
	 * 
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	private String extends1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column bs_user.extends2
	 * 
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	private String extends2;
	
	// IP 和城市
	private String ip,city;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column bs_user.usr_id
	 * 
	 * @return the value of bs_user.usr_id
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public Integer getUsrId() {
		return usrId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column bs_user.usr_id
	 * 
	 * @param usrId the value for bs_user.usr_id
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public void setUsrId(Integer usrId) {
		this.usrId = usrId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column bs_user.usr_name
	 * 
	 * @return the value of bs_user.usr_name
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public String getUsrName() {
		return usrName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column bs_user.usr_name
	 * 
	 * @param usrName the value for bs_user.usr_name
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column bs_user.usr_code
	 * 
	 * @return the value of bs_user.usr_code
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public String getUsrCode() {
		return usrCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column bs_user.usr_code
	 * 
	 * @param usrCode the value for bs_user.usr_code
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public void setUsrCode(String usrCode) {
		this.usrCode = usrCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column bs_user.usr_password
	 * 
	 * @return the value of bs_user.usr_password
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public String getUsrPassword() {
		return usrPassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column bs_user.usr_password
	 * 
	 * @param usrPassword the value for bs_user.usr_password
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public void setUsrPassword(String usrPassword) {
		this.usrPassword = usrPassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column bs_user.usr_status
	 * 
	 * @return the value of bs_user.usr_status
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public Integer getUsrStatus() {
		return usrStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column bs_user.usr_status
	 * 
	 * @param usrStatus the value for bs_user.usr_status
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public void setUsrStatus(Integer usrStatus) {
		this.usrStatus = usrStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column bs_user.create_time
	 * 
	 * @return the value of bs_user.create_time
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column bs_user.create_time
	 * 
	 * @param createTime the value for bs_user.create_time
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column bs_user.update_time
	 * 
	 * @return the value of bs_user.update_time
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column bs_user.update_time
	 * 
	 * @param updateTime the value for bs_user.update_time
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column bs_user.extends1
	 * 
	 * @return the value of bs_user.extends1
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public String getExtends1() {
		return extends1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column bs_user.extends1
	 * 
	 * @param extends1 the value for bs_user.extends1
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public void setExtends1(String extends1) {
		this.extends1 = extends1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column bs_user.extends2
	 * 
	 * @return the value of bs_user.extends2
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public String getExtends2() {
		return extends2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column bs_user.extends2
	 * 
	 * @param extends2 the value for bs_user.extends2
	 * @mbg.generated Tue Sep 18 11:02:25 CST 2018
	 */
	public void setExtends2(String extends2) {
		this.extends2 = extends2;
	}

	public Long getId() {
		if(usrId == null) {
			return null;
		}
		return Long.valueOf(usrId);
	}

	public void setId(Long id) {
		if (id != null && id < Integer.MAX_VALUE) {
			this.usrId = Integer.valueOf(id.toString());
		}
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	

}
