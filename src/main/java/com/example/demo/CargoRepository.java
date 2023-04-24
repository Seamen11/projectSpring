package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    @Query("SELECT p FROM Cargo p WHERE CONCAT(p.cargoName, ' ', p.contentCargo, ' ', p.cityOfStart, ' ', p.dateOfStart, ' ', p.cityOfFinish, ' ', p.dateOfFinish) LIKE %?1%")
    List<Cargo> search(String keyword);

}
