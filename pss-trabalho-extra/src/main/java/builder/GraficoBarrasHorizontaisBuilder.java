/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
/**
 *
 * @author Kevin
 */
public class GraficoBarrasHorizontaisBuilder extends GraficoBarraBuilder{

    
    @Override
    public JFreeChart criarGraficoBarra(CategoryDataset dataset){
       return super.getGraficoBarra().createBarChartHorizontal(dataset);
    }
    
}
