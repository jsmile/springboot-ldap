package com.jsmile.springbootldap.service;

import com.jsmile.springbootldap.model.Person;

public interface RepoAdditional
{
		public String create( Person _person );
		public String update( Person _person );
}
