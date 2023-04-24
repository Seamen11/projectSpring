package com.example.demo;

import jakarta.persistence.*;


@Entity
public class Cargo {
    private Long id;
    private String cargoName;
    private String contentCargo;
    private String cityOfStart;
    private String dateOfStart;
    private String cityOfFinish;
    private String dateOfFinish;
    protected Cargo() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public String getContentCargo() {
        return contentCargo;
    }

    public void setContentCargo(String contentCargo) {
        this.contentCargo = contentCargo;
    }

    public String getCityOfStart() {
        return cityOfStart;
    }

    public void setCityOfStart(String cityOfStart) {
        this.cityOfStart = cityOfStart;
    }
    public String getDateOfStart() {
        return dateOfStart;
    }
    public void setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public String getCityOfFinish() {
        return cityOfFinish;
    }

    public void setCityOfFinish(String cityOfFinish) {
        this.cityOfFinish = cityOfFinish;
    }

    public String getDateOfFinish() {
        return dateOfFinish;
    }

    public void setDateOfFinish(String dateOfFinish) {
        this.dateOfFinish = dateOfFinish;
    }

    @Override
    public String toString() {
        return "Cargo = [id=" + id + ", cargo_name=" + cargoName + ", content_cargo=" + contentCargo + ", city_of_start=" + cityOfStart + ", date_of_start=" + dateOfStart + ", city_of_finish=" + cityOfFinish + ", date_of_finish" + dateOfFinish + "]";
    }
}



