package com.services;

import java.util.List;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.models.Company;
import com.repositories.*;

@Service
public class CompanyServiceImpl implements CompanyService {
	@Resource
	private CompanyRepository companyRepository;
	
	Logger logger = LoggerFactory.getLogger(CompanyServiceImpl.class);
	/* (non-Javadoc)
	 * @see example1.service.CompanyService#findAll()
	 */
	@Override
	public List<Company> findAll() {
		return companyRepository.findAll();
	}

	@Override
	@Transactional
	public Company create(Company company) {
		logger.debug("********************" +company.toString());
		companyRepository.save(company);
		return company;
	}

}
