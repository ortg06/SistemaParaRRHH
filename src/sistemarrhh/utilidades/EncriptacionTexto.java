/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.utilidades;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 *
 * @author ortg_
 */
public class EncriptacionTexto {
    
    private static final String LLAVE_VAL="T4ller2Pa22Word$16";
    BasicTextEncryptor encriptador;
    
    public EncriptacionTexto(String principalValor){
        encriptador = new BasicTextEncryptor();
        if(principalValor == null || principalValor.length() == 0);
        principalValor = LLAVE_VAL;
        
        encriptador.setPassword(principalValor);
    }
    
    public EncriptacionTexto(){
        encriptador = new BasicTextEncryptor();
        encriptador.setPassword(LLAVE_VAL);
    }
    
    public String getTextoEncriptado(String texto){
        return encriptador.encrypt(texto);
    }
    
    public String getTextoDesencriptado(String textoEncriptado){
        return encriptador.decrypt(textoEncriptado);
    }
    
}
