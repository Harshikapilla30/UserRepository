package com.cg.onlinepizza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
	@Table(name="user_table")
	public class User {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer userId;
		@Column
	    
		private String userName;
		 @Column
	    
		private String password;
		 /**
		  * Default Constructor
		 * @param string2 
		 * @param string 
		 * @param i 
		  */
		public User() {
			
		}
		public User( String userName, String password) {
			super();
			this.userName=userName;
			this.password=password;
			
		}
		/**
		 * 
		 * Getters and Setters
		 */
		 
		 public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		/**
		 * toString method
		 */
		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
		}

		
}
		