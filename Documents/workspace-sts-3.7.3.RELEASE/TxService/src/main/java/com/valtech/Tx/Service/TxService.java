package com.valtech.Tx.Service;

import java.util.List;

import com.valtech.Tx.Entity.Tx;

public interface TxService {

	Tx createTransaction(Tx ctx);

	Tx getTransaction(Long id);

	List<Tx> getAllTx();

}