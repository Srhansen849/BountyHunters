package com.example.controller;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
public class SendEmail {

	public void sendAEmail() throws IOException {
		String to = "XXXXX@gmail.com"; // to address. It can be any like gmail, hotmail etc.
		final String from = "XXXXX@gmail.com"; // from address. As this is using Gmail SMTP.
		final String password = "XXXX"; // password for from mail address.

		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "9015");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.socketFactory.port", "9015");
		prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject("Reset Your Password");

			String msg = "FORGOT YOUR PASSWORD?\r\n"
					+ "NO PROBLEM. \r\n"
					+ "We just received a request for a new password from your account.\r\n"
					+ "\r\n"
					+ "To reset your password, just click this link below"
					+ "http://localhost:4200/";

			MimeBodyPart mimeBodyPart = new MimeBodyPart();
			mimeBodyPart.setContent(msg, "text/html");

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(mimeBodyPart);

//			MimeBodyPart attachmentBodyPart = new MimeBodyPart();
//			attachmentBodyPart.attachFile(new File("E://Tools//Screenshot.JPG"));
//			multipart.addBodyPart(attachmentBodyPart);
			message.setContent(multipart);

			Transport.send(message);

			System.out.println("Mail successfully sent..");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}

