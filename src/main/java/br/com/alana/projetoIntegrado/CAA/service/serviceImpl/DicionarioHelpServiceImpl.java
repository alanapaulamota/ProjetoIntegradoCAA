package br.com.alana.projetoIntegrado.CAA.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.alana.projetoIntegrado.CAA.model.DicionarioHelp;
import br.com.alana.projetoIntegrado.CAA.repository.DicionarioHelpRepository;
import br.com.alana.projetoIntegrado.CAA.service.DicionarioHelpService;

public class DicionarioHelpServiceImpl implements DicionarioHelpService {

	@Autowired
	DicionarioHelpRepository dicRepo;

	@Override
	public DicionarioHelp findById(long id) {
		return dicRepo.findById(id).get();
	}

	@Override
	public List<DicionarioHelp> findAll() {
		return dicRepo.findAll();
	}

	@Override
	public List<DicionarioHelp> findByPalavra(String palavra, String significado) {
		return dicRepo.findByPalavraContainingOrSignificadoContaining(palavra, significado);
	}

}
