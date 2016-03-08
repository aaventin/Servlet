/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.service;

import java.util.ArrayList;
import java.util.List;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieServiceMockImpl {
    public List<Serie> listerTout(){
        
        List<Serie> series = new ArrayList<>();
                
        Serie s = new Serie(1L, "Dexter", "Serie de psycopathe", 2006L, null);
        Serie s1 = new Serie(2L, "Elementary", "Serie sur Sherlock Holmes", 2012L, null);
        
        series.add(s);
        series.add(s1);
        
        return series;
    }
    
    public Serie findById(Long id){
        if(id==1){
            return new Serie(1L, "Dexter", "Serie de psychopathe", 2006L, null);
        }
        
        if(id==2){
            return new Serie(2L, "Elementary", "Serie sur Sherlock Holmes", 2012L, null);
        }
        
        return new Serie();
    }
    
}
