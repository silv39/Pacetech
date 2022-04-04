/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Menu.MenuOperacao;

/**
 *
 * @author CB RODRIGO SILVA
 */
public class CalculadoraControladora {
    private Double total;
    public Double realizaOperacao(MenuOperacao Operacao,Double valor){
        if (Operacao.equals(MenuOperacao.SOMA)){
            total += valor;
        }else{  if (Operacao.equals(MenuOperacao.SUBTRACAO)){
            total -= valor;
            
            }else{  if (Operacao.equals(MenuOperacao.DIVISAO)){
            total /= valor;
            
            }else{  if (Operacao.equals(MenuOperacao.MULTIPLICACAO)){
            total *= valor;
            }
            return total;     
    }
    public Double getTotal() {
        return this.total;
    }
    public void zerar (){
        total = 0,0;
    }
}
