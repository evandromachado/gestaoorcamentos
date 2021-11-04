package com.qintess.academia.microservissos.gestaomunicipal.gestaoorcamentos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qintess.academia.microservissos.gestaomunicipal.gestaoorcamentos.entity.Budget;
import com.qintess.academia.microservissos.gestaomunicipal.gestaoorcamentos.repository.GestaoOrcamentosRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GestaoOrcamentosService {
	
	private GestaoOrcamentosRepository gestaoOrcamentosRepository;
	
	public Budget addBudget(Budget budget) {
		return gestaoOrcamentosRepository.save(budget);
	}

	public Optional<Budget> getBudget(Long id) {
		return gestaoOrcamentosRepository.findById(id);
	}

	public String removeBudget(Long id) {
		gestaoOrcamentosRepository.deleteById(id);
		return "Removido com sucesso";
	}

	public Budget changeBudget(Long id, Double expense) {
		Budget budget = gestaoOrcamentosRepository.getById(id);
		Double totalAmount = budget.getTotalAmount();
		Double spentAmount = budget.getSpentAmount();
		if (spentAmount + expense < totalAmount)
		{
			budget.setSpentAmount(spentAmount + expense);
			return gestaoOrcamentosRepository.save(budget);
		}
		return budget;
	}
	
}
