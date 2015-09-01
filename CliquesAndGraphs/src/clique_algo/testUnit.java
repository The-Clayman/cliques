package clique_algo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roy
 */
import static clique_algo.Clique_Tester.maxQ;
import static clique_algo.Clique_Tester.minQ;
import static clique_algo.Clique_Tester.out_file;
import org.junit.Test;
import static org.junit.Assert.*;
   
public class testUnit {
  @Test
    public void testGraph(){
        Graph G_Loaded = Graph.LoadGraph("GraphSave.ser");
        
//        Vector<Clique> ansBoaz = ;
//        Vector<Clique> ansImproved = ;
        int boaz = G_Loaded.All_Cliques_DFS(out_file,minQ,maxQ,false);
        int improved = G_Loaded.All_Cliques_DFS(out_file,minQ,maxQ,true);
        assertEquals(boaz,improved,0.000001);

        
        
                
   }
}
