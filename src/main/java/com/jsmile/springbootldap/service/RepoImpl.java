package com.jsmile.springbootldap.service;

import com.jsmile.springbootldap.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;

public class RepoImpl implements RepoAdditional
{
		@Autowired
		private LdapTemplate ldapTemplate;

		@Override public String create( Person _person )
		{
				ldapTemplate.create( _person );
				return "success";
		}

		@Override public String update( Person _person )
		{
				ldapTemplate.update( _person );
				return "success";
		}
}
