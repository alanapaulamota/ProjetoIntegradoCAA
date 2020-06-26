package br.com.alana.projetoIntegrado.CAA.service.serviceImpl;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import br.com.alana.projetoIntegrado.CAA.service.HelpFaleConoscoService;

@Service("mailService")
public class HelpFaleConoscoServiceImp implements HelpFaleConoscoService {

	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void send(String texto) throws Exception {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
//		mimeMessageHelper.setFrom(fromAddress);
//		mimeMessageHelper.setFrom(toAddress);
		mimeMessageHelper.setText(texto, true);
		javaMailSender.send(mimeMessage);
	}

}
