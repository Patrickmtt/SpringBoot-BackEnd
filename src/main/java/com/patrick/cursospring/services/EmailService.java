package com.patrick.cursospring.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.patrick.cursospring.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendOrderConfigurationHtmlEmail(Pedido obj);

	void sendHtmlEmail(MimeMessage msg);

	void sendEmail(SimpleMailMessage msg);
}
