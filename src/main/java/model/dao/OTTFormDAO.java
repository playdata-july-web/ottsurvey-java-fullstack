package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;
import org.modelmapper.ModelMapper;

import model.dto.OTTFormDTO;
import model.entity.OTTForm;
import model.util.PublicCommon;


public class OTTFormDAO {
	
	private static OTTFormDAO instance = new OTTFormDAO();

	private OTTFormDAO() {
	}

	public static OTTFormDAO getInstance() {
		return instance;
	}
	
	//삽입 
	public static void addOTTForm(OTTFormDTO ottform) throws SQLException {
		EntityManager em = PublicCommon.getEntityManager();
		em.getTransaction().begin();
	
		try {  
			em.persist(ottform.toEntity());
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		} finally {
			em.close();
			em = null;
		}
	}
	
	// 전체 검색
	public static List<OTTFormDTO> getDatas() throws SQLException {
		EntityManager em = PublicCommon.getEntityManager();
		em.getTransaction().begin();
		
		ModelMapper modelMapper = new ModelMapper();
		List<OTTFormDTO> datas = null;
		
		try {
			datas = em.createNamedQuery("OTTForm.findAll", OTTForm.class).getResultList()
					.stream()
					.map(d -> modelMapper.map(d, OTTFormDTO.class))
					.collect(Collectors.toList());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			em = null;
		}
		
		return datas;
	}
}

