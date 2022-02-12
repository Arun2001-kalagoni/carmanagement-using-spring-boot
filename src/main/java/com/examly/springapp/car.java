package com.examly.springapp;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class car {
	@Id
    private int carId;
    private String carModel;
    private String carNo;
    private String status;

    public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
}
