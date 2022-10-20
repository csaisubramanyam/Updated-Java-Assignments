package com.valtech.Tx.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.Tx.Entity.Tx;
import com.valtech.Tx.Repository.TxRepository;

@Service
public class TxServiceImpl implements TxService {
	
	
	@Autowired
	private TxRepository txRepository;
	
	
	public Tx createTransaction(Tx ctx) {
		return txRepository.save(ctx);
	}
	
	public Tx getTransaction(Long id) {
		return txRepository.findById(id).get();
	}
	
	public List<Tx> getAllTx() {
		return txRepository.findAll();
	}
}
