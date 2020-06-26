package br.com.alana.projetoIntegrado.CAA.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.alana.projetoIntegrado.CAA.model.HelpDicionario;
import br.com.alana.projetoIntegrado.CAA.repository.HelpDicionarioRepository;
import br.com.alana.projetoIntegrado.CAA.service.DicionarioHelpService;

public class DicionarioHelpServiceImpl implements DicionarioHelpService {

	@Autowired
	HelpDicionarioRepository dicRepo;

	@Override
	public HelpDicionario findById(long id) {
		return dicRepo.findById(id).get();
	}

	@Override
	public List<HelpDicionario> findAll() {
		return dicRepo.findAll();
	}

	@Override
	public List<HelpDicionario> findByPalavra(String palavra, String significado) {
		return dicRepo.findByPalavraContainingOrSignificadoContaining(palavra, significado);
	}

}
