package com.jsmile.springbootldap.model;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import javax.naming.Name;

@Entry( objectClasses = { "inetOrgPerson", "organizationalPerson", "person", "top" } )
public class PersonVO
{
		private Name dn;
		private String fullname;
		private String lastname;
		private String givenname;
		private String description;
		private String mail;
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

		@Override
		public String toString()
		{
				final StringBuffer sb = new StringBuffer( "PersonVO {" );
				sb.append( "dn=" ).append( dn );
				sb.append( ", fullname='" ).append( fullname ).append( '\'' );
				sb.append( ", lastname='" ).append( lastname ).append( '\'' );
				sb.append( ", givenname='" ).append( givenname ).append( '\'' );
				sb.append( ", description='" ).append( description ).append( '\'' );
				sb.append( ", mail='" ).append( mail ).append( '\'' );
				sb.append( ", uid='" ).append( uid ).append( '\'' );
				sb.append( '}' );
				return sb.toString();
		}
}
