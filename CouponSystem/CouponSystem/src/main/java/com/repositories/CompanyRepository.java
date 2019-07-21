package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.models.*;

public interface  CompanyRepository extends JpaRepository<Company, Long> {

}
