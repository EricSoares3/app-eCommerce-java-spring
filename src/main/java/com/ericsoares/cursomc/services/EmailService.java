package com.ericsoares.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.ericsoares.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
