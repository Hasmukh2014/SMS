package com.hp.SpringBootDemo.students;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

public class StudentRepositoryImpl implements StudentRepositoryCustom {
	
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getEmailById(String id) {
		
		StoredProcedureQuery storedProcedureQuery=entityManager.createNamedStoredProcedureQuery("getEmailById");
		storedProcedureQuery.setParameter("enrollmentNo", id);
		return storedProcedureQuery.getResultList();
	}

	
}
