package com.ca.xmino.repositories;

import com.ca.xmino.TO.Head;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadRepository extends CrudRepository  <Head, String> {

}
