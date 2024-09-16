package models;

import java.io.Serializable;
import java.sql.Date;

public class UserModel implements Serializable {
	
	private static final long serialVersionUID = 138849462639694905L;
	
	private int id;
	private String email;
	private String username;
	private String fullname;
	private String password;
	private String images;
	private int roleid;
	private String phone;
	private Date createDate;
	
	public UserModel() {
		super();
	}

	public UserModel(int id, String email, String username, String fullname, String password, String images, int roleid,
			String phone, Date createDate) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = fullname;
		this.password = password;
		this.images = images;
		this.roleid = roleid;
		this.phone = phone;
		this.createDate = createDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreatedDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", email=" + email + ", username=" + username + ", fullname=" + fullname
				+ ", password=" + password + ", images=" + images + ", roleid=" + roleid + ", phone=" + phone
				+ ", createDate=" + createDate + "]";
	}
	
}