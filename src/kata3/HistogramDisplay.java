package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() {
        super("HISTOGRAMA");
        this.setContentPane(createPanel());
        this.pack();
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart freeChart = ChartFactory.createBarChart("Histograma JFreeChart",
                                                            "Dominios email", 
                                                            "Nº de emails", 
                                                            dataSet,
                                                            PlotOrientation.VERTICAL,
                                                            false,
                                                            false,
                                                            rootPaneCheckingEnabled);
        return freeChart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(10, "", "ulpgc.es");
        dataSet.addValue(15, "", "hotmail.com");
        dataSet.addValue(15, "", "gmail.com");
        dataSet.addValue(6, "", "ull.es");
        dataSet.addValue(17, "", "icloud.com");
        return dataSet;
    }

    
    public void execute(){
        setVisible(true);
    }
    
    

}

