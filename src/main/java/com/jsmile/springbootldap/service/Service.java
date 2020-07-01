package com.jsmile.springbootldap.service;

import com.jsmile.springbootldap.model.Person;
import com.jsmile.springbootldap.model.PersonVO;

import java.util.List;

public interface Service
{
		public String create( PersonVO _personVO );
		public String update( PersonVO _personVO );
		public String delete( String _uid );
		public List<Person> findAll();
		public List<Person> findByLastName( String _lastName );
		public Person findById( String _uid );
}
