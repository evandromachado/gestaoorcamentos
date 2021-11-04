package com.qintess.academia.microservissos.gestaomunicipal.gestaoorcamentos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.academia.microservissos.gestaomunicipal.gestaoorcamentos.dto.ExpenseDTO;
import com.qintess.academia.microservissos.gestaomunicipal.gestaoorcamentos.entity.Budget;
import com.qintess.academia.microservissos.gestaomunicipal.gestaoorcamentos.service.GestaoOrcamentosService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/budgets")
@Api(value = "Budgets", tags = {"Budgets"})
public class GestaoOrcamentosController {
	
	private GestaoOrcamentosService gestaoOrcamentosService;

	public GestaoOrcamentosController(GestaoOrcamentosService service) {
		this.gestaoOrcamentosService = service;
	}

    @PostMapping
    public Budget addBudget(@RequestBody Budget budget) {
        return gestaoOrcamentosService.addBudget(budget);
    }

    @GetMapping(path = "/{id}")
    public Optional<Budget> getBudget(@PathVariable Long id) {
        return gestaoOrcamentosService.getBudget(id);
    }

    @DeleteMapping(path = "/{id}")
    public String removeBudget(@PathVariable Long id) {
        return gestaoOrcamentosService.removeBudget(id);
    }

    @PatchMapping(path = "/{id}")
    public Budget changeBudget(@PathVariable Long id, @RequestBody ExpenseDTO expenseDTO) {
        return gestaoOrcamentosService.changeBudget(id, expenseDTO.getExpense());
    }
    
}
