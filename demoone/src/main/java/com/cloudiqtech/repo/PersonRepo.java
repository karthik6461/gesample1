package com.cloudiqtech.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.cassandra.repository.Query;
import com.cloudiqtech.entity.Person;

public interface PersonRepo extends CrudRepository<Person, String>
{

        @Query("Select * from person where pid=?0")
		public Person fetchByPId(int pid);

}

