package com.IOC.reprosatory;

import com.IOC.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepo extends JpaRepository<Employe,Integer> {

}
