/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import java.util.ArrayList;
import model.Pessoa;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;

/**
 *
 * @author Kevin
 */
public class DiretorGrafico {
    
    public ChartPanel construirPainelGrafico(GraficoBarraBuilder construtor, ArrayList<Pessoa> listaPessoas){
        
        CategoryDataset dataset = construtor.criarGraficoDataset(listaPessoas);
        JFreeChart grafico = construtor.criarGraficoBarra(dataset);
        return construtor.criarPainelGrafico(grafico);
        
    }
    
}
