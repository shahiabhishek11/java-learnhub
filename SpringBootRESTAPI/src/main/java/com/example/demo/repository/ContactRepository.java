package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Contact;

@Transactional
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
//basic methods are already available save,update,fetch,delete
	
	
	//custom  select operations
	//JPQL -class and properties-understood by any oR Mapping tool 
	@Query("select  c from Contact c  where  fname=:nm")
	public List<Contact> getContactByName(String nm);
	

	//executeQuery
	@Query(value="select * from contact where contact = ?1" ,nativeQuery = true)
	public Contact getContactsByNo(String no);

	
	//executeUpdate
	@Modifying
	@Query("update Contact set fname= ?1 where email= ?2")
	public int updateName(String fnm,String email);
	
	
	//prepareCall 
	@Procedure(name="getName",outputParameterName = "nm")
	public String getName(int cid);
	
}
