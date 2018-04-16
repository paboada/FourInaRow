package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class FourInaRow 
{
	
	private void ejecutar ()
	{
        try 
        {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
            inicializar (kSession);
            kSession.fireAllRules();
            kSession.dispose ();
        } 
        catch (Throwable t) 
        {
            t.printStackTrace();
        }
	}
	
	private static void inicializar (KieSession kSession)
	{
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 7; j++)
			{
		        kSession.insert(new Celda (i, j));
			}
		}
//		kSession.insert (new Celda (0, 0, Celda.EQUIS));
//		kSession.insert (new Celda (0, 1, Celda.EQUIS));
//		kSession.insert (new Celda (0, 2, Celda.OES));
//		kSession.insert (new Celda (1, 0, Celda.OES));
//		kSession.insert (new Celda (1, 1, Celda.OES));
//		kSession.insert (new Celda (1, 2, Celda.EQUIS));
//		kSession.insert (new Celda (2, 0, Celda.EQUIS));
//		kSession.insert (new Celda (2, 1, Celda.NADA));
//		kSession.insert (new Celda (2, 2, Celda.OES));
		kSession.insert(new Turno ());
	}

    public static final void main(String[] args) 
    {
    	FourInaRow tt = new FourInaRow ();
    	tt.ejecutar ();
    }

}
