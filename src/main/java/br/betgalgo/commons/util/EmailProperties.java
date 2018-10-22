package br.betgalgo.commons.util;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:email.properties")
public class EmailProperties implements Serializable {

    private static final long serialVersionUID = -2292511199484081138L;

    @Value("${email.user}")
    private String user;

    @Value("${email.pass}")
    private String pass;

    @Value("${email.smtp}")
    private String smtp;

    @Value("${email.subject}")
    private String subject;

    /** @return Retorna user */
    public String getUser() {
        return user;
    }

    /** @param user Define user */
    public void setUser(String user) {
        this.user = user;
    }

    /** @return Retorna pass */
    public String getPass() {
        return pass;
    }

    /** @param pass Define pass */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /** @return Retorna smtp */
    public String getSmtp() {
        return smtp;
    }

    /** @param smtp Define smtp */
    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }

    /** @return Retorna subject */
    public String getSubject() {
        return subject;
    }

    /** @param subject Define subject */
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
