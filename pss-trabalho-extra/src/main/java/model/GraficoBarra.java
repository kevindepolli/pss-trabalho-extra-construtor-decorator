/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import decorator.ElementoGrafico;
import java.awt.Dimension;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.PlotOrientation;

/**
 *
 * @author Kevin
 */
public class GraficoBarra extends ElementoGrafico{
    private CategoryDataset dataset;
    private JFreeChart grafico;
    private ChartPanel painelGrafico;

    public CategoryDataset createDataSet(ArrayList<Pessoa> listaPessoas){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for(Pessoa pessoa : listaPessoas){
            dataset.addValue(pessoa.getIdade(), pessoa.getNome(), "");
        }
        
        return dataset;
    }

    public JFreeChart createBarChartHorizontal(CategoryDataset dataSet){
        JFreeChart graficoBarrasHorizontais = ChartFactory.createBarChart(
                "",
                "",
                "",
                dataSet,
                PlotOrientation.HORIZONTAL,
                true,
                false,
                false);
        
        return graficoBarrasHorizontais;
    }
    
    public JFreeChart createBarChartVertical(CategoryDataset dataSet){
        JFreeChart graficoBarrasHorizontais = ChartFactory.createBarChart(
                "",
                "",
                "",
                dataSet,
                PlotOrientation.VERTICAL,
                true,
                false,
                false);
        
        return graficoBarrasHorizontais;
    }
    
    public ChartPanel criarGrafico(JFreeChart grafico){
        
       painelGrafico = new ChartPanel(grafico);
       
       painelGrafico.setPreferredSize(new Dimension(400,400));
       
       return painelGrafico;
    }

    public CategoryDataset getDataset() {
        return dataset;
    }

    public void setDataset(CategoryDataset dataset) {
        this.dataset = dataset;
    }

    public JFreeChart getGrafico() {
        return grafico;
    }

    public void setGrafico(JFreeChart grafico) {
        this.grafico = grafico;
    }

    public ChartPanel getPainelGrafico() {
        return painelGrafico;
    }

    public void setPainelGrafico(ChartPanel painelGrafico) {
        this.painelGrafico = painelGrafico;
    }

    
}
