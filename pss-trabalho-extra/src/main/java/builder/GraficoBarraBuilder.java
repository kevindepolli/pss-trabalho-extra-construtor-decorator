/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package builder;

import java.util.ArrayList;
import model.GraficoBarra;
import model.Pessoa;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;

/**
 *
 * @author Kevin
 */
public abstract class GraficoBarraBuilder {

    private GraficoBarra graficoBarra;
    
    public GraficoBarraBuilder() {
        graficoBarra = new GraficoBarra();
    }
    
    public final CategoryDataset criarGraficoDataset(ArrayList<Pessoa> listaPessoas){
        return graficoBarra.createDataSet(listaPessoas);
    }
    public abstract JFreeChart criarGraficoBarra(CategoryDataset dataset);
    
    public final ChartPanel criarPainelGrafico(JFreeChart grafico){
        return graficoBarra.criarGrafico(grafico);
    }

    public GraficoBarra getGraficoBarra() {
        return graficoBarra;
    }

    public void setGraficoBarra(GraficoBarra graficoBarra) {
        this.graficoBarra = graficoBarra;
    }
   
}
