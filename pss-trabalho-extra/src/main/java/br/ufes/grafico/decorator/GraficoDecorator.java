/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.ufes.grafico.decorator;

import builder.DiretorGrafico;
import builder.GraficoBarraBuilder;
import builder.GraficoBarrasHorizontaisBuilder;
import java.util.ArrayList;
import model.Pessoa;
import org.jfree.chart.ChartPanel;
import view.GraficoView;

/**
 *
 * @author Kevin
 */
public class GraficoDecorator {

    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        GraficoBarraBuilder graficoBarraHorizontalBuilder = new GraficoBarrasHorizontaisBuilder();
        DiretorGrafico diretorGrafico = new DiretorGrafico();
        ChartPanel graficoPainel = diretorGrafico.construirPainelGrafico(graficoBarraHorizontalBuilder, listaPessoas);
        
        GraficoView janelaGrafico = new GraficoView(graficoPainel);
        
        janelaGrafico.setVisible(true);
    }
}
