package com.services;

import java.util.List;

import com.models.*;

public interface CompanyService {

	List<Company> findAll();

	Company create(Company company);

}