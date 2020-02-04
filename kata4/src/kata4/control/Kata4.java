package kata4.control;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailReaderList;

public class Kata4 {
    
    public static void main(String[] args) {
        
        String fileName = "mail.txt";
        
        List<Mail> mailList = MailReaderList.read(fileName);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    
}
