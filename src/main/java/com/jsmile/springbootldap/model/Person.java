package com.jsmile.springbootldap.model;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import javax.naming.Name;

@Entry( objectClasses = { "inetOrgPerson", "organizationalPerson", "person", "top" } )
public class Person
{
		@Id
		private Name dn;
		@Attribute( name="cn" )
		private String fullname;
		@Attribute( name="sn" )
		private String lastname;
		@Attribute( name="givenname" )
		private String givenname;
		@Attribute( name="description" )
		private String description;
		@Attribute( name="mail" )
		private String mail;
		@Attribute( name="uid" )
		private String uid;
		public Name getDn() { return dn; }

		public void setDn( Name dn )
		{
				this.dn = dn;
		}

		public String getFullname()
		{
				return fullname;
		}

		public void setFullname( String fullname )
		{
				this.fullname = fullname;
		}

		public String getLastname()
		{
				return lastname;
		}

		public void setLastname( String lastname )
		{
				this.lastname = lastname;
		}

		public String getGivenname()
		{
				return givenname;
		}

		public void setGivenname( String givenname )
		{
				this.givenname = givenname;
		}

		public String getDescription()
		{
				return description;
		}

		public void setDescription( String description )
		{
				this.description = description;
		}

		public String getMail()
		{
				return mail;
		}

		public void setMail( String mail )
		{
				this.mail = mail;
		}

		public String getUid()
		{
				return uid;
		}

		public void setUid( String uid )
		{
				this.uid = uid;
		}
}
