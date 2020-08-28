import app.bridgelabz.BaseClass;
import app.bridgelabz.Pages.LoginPage;
import app.bridgelabz.Pages.Logout;
import app.bridgelabz.Pages.SearchProfile;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.net.MalformedURLException;
import java.util.Properties;

public class InstaTest extends BaseClass
{


@BeforeClass
public  void before() throws MalformedURLException
{
    driverMethod();
}
    @Test
    public void Login() throws  InterruptedException
    {
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        System.out.println("Application launched");
    }
    @Test
    public void UserSearch() throws  InterruptedException
    {
        SearchProfile person=new SearchProfile();
        Assert.assertEquals("cristiano",person.search());
        System.out.println("Application launched");
    }
    @Test
    public void loggedOut() throws  InterruptedException
    {
        Logout logout= new Logout();
        logout.logout();
    }
//    @AfterClass
//    public  void sendEmail() throws EmailException {
//        EmailAttachment attachment = new EmailAttachment();
//        attachment.setPath("C:/Users/rebel/Desktop/abc.html");
//        attachment.setDisposition(EmailAttachment.ATTACHMENT);
//        attachment.setName("Test Report");
//        MultiPartEmail email = new MultiPartEmail();
//        email.setHostName("smtp.gmail.com");
//        email.setSmtpPort(584);
//        email.setAuthentication("pallavidubey6232@gmail.com", "12respect34");
//        email.setSSLOnConnect(true);
//        email.addTo("pallavidubey0823@gmail.com");
//        email.setFrom("pallavidubey6232@gmail.com", "Pallavi");
//        email.setMsg("Please check the report for current feature");
//        email.attach(attachment);
//        email.send();
//    }
//
    @AfterClass
    public void email()
    {
        // Create object of Property file
        Properties props = new Properties();

        // this will set host of server- you can change based on your requirement
        props.put("mail.smtp.host", "smtp.gmail.com");

        // set the port of socket factory
        props.put("mail.smtp.socketFactory.port", "465");

        // set socket factory
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        // set the authentication to true
        props.put("mail.smtp.auth", "true");

        // set the port of SMTP server
        props.put("mail.smtp.port", "465");

        // This will handle the complete authentication
        Session session = Session.getDefaultInstance(props,

                new javax.mail.Authenticator() {

                    protected PasswordAuthentication getPasswordAuthentication() {

                        return new PasswordAuthentication("pallavidubey6232@gmail.com", "12respect34");

                    }

                });

        try {

            // Create object of MimeMessage class
            Message message = new MimeMessage(session);

            // Set the from address
            message.setFrom(new InternetAddress("pallavidubey6232@gmail.com"));

            // Set the recipient address
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("pallavidubey0823@gmail.com"));

            // Add the subject link
            message.setSubject("Testing Subject");

            // Create object to add multimedia type content
            BodyPart messageBodyPart1 = new MimeBodyPart();

            // Set the body of email
            messageBodyPart1.setText("This is message body");

            // Create another object to add another content
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();

            // Mention the file which you want to send
            String filename = "C:/Users/rebel/Desktop/abc.html";

            // Create data source and pass the filename
            DataSource source = new FileDataSource(filename);

            // set the handler
            messageBodyPart2.setDataHandler(new DataHandler(source));

            // set the file
            messageBodyPart2.setFileName(filename);

            // Create object of MimeMultipart class
            Multipart multipart = new MimeMultipart();

            // add body part 1
            multipart.addBodyPart(messageBodyPart2);

            // add body part 2
            multipart.addBodyPart(messageBodyPart1);

            // set the content
            message.setContent(multipart);

            // finally send the email
            Transport.send(message);

            System.out.println("=====Email Sent=====");

        } catch (MessagingException e) {

            throw new RuntimeException(e);

        }
    }

}

