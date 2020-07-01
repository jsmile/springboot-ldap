package com.jsmile.springbootldap.config;

import com.jsmile.springbootldap.service.RepoAdditional;
import com.jsmile.springbootldap.service.RepoImpl;
import com.jsmile.springbootldap.service.Service;
import com.jsmile.springbootldap.service.ServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.ldap.repository.config.EnableLdapRepositories;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;

import javax.naming.ldap.LdapContext;

@Configuration
@EnableLdapRepositories
public class Config
{
		@Bean
		public LdapContextSource ldapContextSource()
		{
				LdapContextSource ldapContext = new LdapContextSource();
				ldapContext.setUrl( "ldap://localhost:10389" );
				ldapContext.setBase( "dc=koscom, dc=com" );
				ldapContext.setUserDn( "name" ); 		// LDAP 사용자 이름( 예: "admin,ou=system" )
				ldapContext.setPassword( "password" );	// LDAP 사용자 암호

				return ldapContext;
		}

		@Bean
		public LdapTemplate ldapTemplate()
		{
				return new LdapTemplate( ldapContextSource() );
		}

		@Bean
		public RepoAdditional repoAddtional()
		{
				return new RepoImpl();
		}

		@Bean
		public Service service()
		{
				return new ServiceImpl();
		}

}
