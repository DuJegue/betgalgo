/*
 * ====================================================================
 * Direitos de cópia pela BRASILPREV
 * Todos os direitos reservados.
 * Este sistema contém informações confidenciais e de propriedade da
 * BRASILPREV ("Informações Confidenciais").
 * Você não deve divulgar tais informações confidenciais e deve
 * usá-las somente em conformidade com os termos do contrato de licença
 * definidos pela BRASILPREV.
 * ====================================================================
 */
package br.betgalgo.mvc.controller;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.betgalgo.commons.util.EmailProperties;

/** Class EmailController. */
@Component
public class EmailController {

    @Autowired
    private EmailProperties emailProperties;

    private Session getAuth() {
        Properties props = new Properties();
        /** Parâmetros de conexão com servidor Gmail */
        props.put("mail.smtp.host", emailProperties.getSmtp());
        props.put("mail.smtp.socketFactory.port", emailProperties.getPort());
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", Boolean.TRUE.toString());
        props.put("mail.smtp.port", emailProperties.getPort());

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailProperties.getUser(), emailProperties.getPass());
            }
        });

        return session;
    }

    /** @param listSelected
     * @return void */
    public void send(StringBuilder galgos) {
        Message message = new MimeMessage(getAuth());
        try {
            message.setFrom(new InternetAddress(emailProperties.getOrigin()));
            Address[] toUser = InternetAddress.parse(emailProperties.getDestiny());
            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject(emailProperties.getSubject());
            message.setText(galgos.toString());
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        } 
    }

}
