package br.com.fiap.pontonow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import br.com.fiap.meujulius.models.ContaDto;
import br.com.fiap.meujulius.models.Despesa;
import br.com.fiap.meujulius.models.Usuario;
import br.com.fiap.meujulius.repository.ContaRepository;
import br.com.fiap.meujulius.repository.DespesaRepository;

@Service
public class ContaService {
    @Autowired
    ContaRepository contaRepository;
    @Autowired
    DespesaRepository despesaRepository;

    public List<ContaDto> findAll() {
        var auth = SecurityContextHolder.getContext().getAuthentication();
        
    
        return dtos;