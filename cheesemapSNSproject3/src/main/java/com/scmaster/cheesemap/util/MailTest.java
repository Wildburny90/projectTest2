package com.scmaster.cheesemap.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailTest {
	public void testMailSend(String mem_id, String cheese_id, String subjectTxt, String msgTxt) {
		try {
			String[] emailList = { mem_id };// 메일 보낼사람 리스트
			String emailFromAddress = cheese_id;// 메일 보내는 사람
			postMail(emailList, subjectTxt, msgTxt, emailFromAddress);
			System.out.println("메일이 성공적으로 보내졌습니다");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	private void postMail(String recipients[], String subject, String message, String from) throws MessagingException {
		boolean debug = false;
		java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

		String SMTP_HOST_NAME = "gmail-smtp.l.google.com";

		// Properties 설정
		Properties props = new Properties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", SMTP_HOST_NAME);
		props.put("mail.smtp.auth", "true");

		Authenticator auth = new SMTPAuthenticator();
		Session session = Session.getDefaultInstance(props, auth);

		session.setDebug(debug);

		// create a message
		Message msg = new MimeMessage(session);

		// set the from and to address
		InternetAddress addressFrom = new InternetAddress(from);
		msg.setFrom(addressFrom);

		InternetAddress[] addressTo = new InternetAddress[recipients.length];
		for (int i = 0; i < recipients.length; i++) {
			addressTo[i] = new InternetAddress(recipients[i]);
		}
		msg.setRecipients(Message.RecipientType.TO, addressTo);

		// Setting the Subject and Content Type
		msg.setSubject(subject);
		msg.setContent(message, "text/html;charset=utf-8");
		Transport.send(msg);
	}

	/**
	 * 구글 사용자 메일 계정 아이디/패스 정보
	 */
	private class SMTPAuthenticator extends javax.mail.Authenticator {
		public PasswordAuthentication getPasswordAuthentication() {
			String username = "cocohello010@gmail.com"; // gmail 사용자;
			String password = "rsefaq123"; // 패스워드;
			return new PasswordAuthentication(username, password);
		}
	}
}
