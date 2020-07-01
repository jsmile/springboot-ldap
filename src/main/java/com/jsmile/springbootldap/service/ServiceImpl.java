package com.jsmile.springbootldap.service;

import com.jsmile.springbootldap.model.Person;
import com.jsmile.springbootldap.model.PersonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.query.LdapQueryBuilder;
import org.springframework.ldap.support.LdapNameBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ServiceImpl implements Service
{
		@Autowired
		private Repo repo;

		@Override
		public String create( PersonVO _personVO )
		{
				Person person = new Person();
				person.setDn( LdapNameBuilder.newInstance( _personVO.getDn() ).build() );
				person.setFullname( _personVO.getFullname() );
				person.setLastname( _personVO.getLastname() );
				person.setDescription( _personVO.getDescription() );
				person.setGivenname( _personVO.getGivenname() );
				person.setMail( _personVO.getMail() );
				person.setUid( _personVO.getUid() );

				return repo.create( person );
		}

		@Override
		public String update( PersonVO _personVO )
		{
				Person person = new Person();
				person.setDn( LdapNameBuilder.newInstance( _personVO.getDn() ).build() );
				person.setFullname( _personVO.getFullname() );
				person.setLastname( _personVO.getLastname() );
				person.setDescription( _personVO.getDescription() );
				person.setGivenname( _personVO.getGivenname() );
				person.setMail( _personVO.getMail() );
				person.setUid( _personVO.getUid() );

				return repo.update( person );
		}

		@Override
		public String delete( String _uid )
		{
				Optional<Person> optionalPerson = repo.findOne( LdapQueryBuilder.query().where( "uid" ).is( _uid ) );
				Person person = optionalPerson.isPresent()? optionalPerson.get() : new Person();

				repo.delete( person );;
				return "success";
		}

		@Override
		public List<Person> findAll()
		{
				Iterable<Person> itrPerson = repo.findAll();
				List<Person> personList = new ArrayList<>();

				for( Person p : itrPerson ) { personList.add( p ); }

				return personList;
		}

		@Override
		public List<Person> findByLastName( String _lastName )
		{
				Iterable<Person> itrPerson = repo.findAll( LdapQueryBuilder.query().where( "sn" ).is( _lastName ) );
				List<Person> personList = new ArrayList<>();

				for( Person p : itrPerson ) { personList.add( p ); }

				return personList;
		}

		@Override
		public Person findById( String _uid )
		{
				Optional<Person> optionalPerson = repo.findOne( LdapQueryBuilder.query().where( "uid" ).is( _uid ) );
				Person person = optionalPerson.isPresent()? optionalPerson.get() : new Person();

				return person;
		}
}
