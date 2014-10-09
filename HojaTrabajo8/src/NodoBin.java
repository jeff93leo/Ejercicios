//Universidad del Valle de Guatemala
//Carlos Sagastume 12113
//Jefferson Silva (12605), Pablo samayoa(12635), Ixim Cojti (12697) , Carlos Cordero () 
//NodoBin.java

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.*;
/**
 *
 * @author Rodimiro
 */
public class NodoBin {
    
            // Constructors
       public NodoBin( Comparable theElement )
        {
            this( theElement, null, null );
        }

        public NodoBin( Comparable theElement, NodoBin lt, NodoBin rt )
        {
            element  = theElement;
            left     = lt;
            right    = rt;
        }

            // Friendly data; accessible by other package routines
        Comparable element;      // The data in the node
        NodoBin left;         // Left child
        NodoBin right;        // Right child
    }



