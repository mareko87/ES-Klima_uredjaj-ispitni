package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

        	Klima k = new Klima(false, 62, true, false, true);
//        	Klima k = new Klima(true, 80, true, false, false);
//        	Klima k = new Klima(false, 42, false, false, false);
//        	Klima k = new Klima(false, 35, true, false, false);
        	
            kSession.insert(k);
            kSession.fireAllRules();
            
            System.out.println(k);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
