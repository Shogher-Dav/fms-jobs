package com.ztechnics.fms.UserDashboard.Jobs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobs")
public class Jobs {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	@Column
	private long number;
	
	@Column
	private String	mawb;
	
	@Column
	private String	date;
	
	@Column
	private String origin;
	
	@Column
	private String destination;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getMawb() {
		return mawb;
	}

	public void setMawb(String mawb) {
		this.mawb = mawb;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Jobs [id=" + id + ", number=" + number + ", mawb=" + mawb + ", date=" + date + ", origin=" + origin
				+ ", destination=" + destination + "]";
	}
	
	

}
