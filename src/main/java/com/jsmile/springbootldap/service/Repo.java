package com.jsmile.springbootldap.service;

import com.jsmile.springbootldap.model.Person;
import org.springframework.data.ldap.repository.LdapRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends LdapRepository<Person>, RepoAdditional
{

}
