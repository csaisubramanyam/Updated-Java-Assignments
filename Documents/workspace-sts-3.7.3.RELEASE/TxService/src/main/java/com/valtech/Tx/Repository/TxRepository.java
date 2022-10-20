package com.valtech.Tx.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.Tx.Entity.Tx;


@Repository
public interface TxRepository extends JpaRepository<Tx, Long>{

}
