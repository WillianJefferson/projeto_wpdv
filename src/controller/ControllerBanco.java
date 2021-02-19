/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import conexoes.Conexao;

/**
 *
 * @author willian
 */
public class ControllerBanco {
    Conexao conexao;

    
    public Conexao get(){
        if(conexao == null){
            conexao = new Conexao();
        }
        return conexao;
    }
}
