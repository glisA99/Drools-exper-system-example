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

            Klima klima = new Klima();
            klima.setBrojProstorijaZaHladjenje(Klima.VISE);
            klima.setMogucnostUgradjanjeNaZid(false);
            klima.setTemperatura(-6);
            klima.setVelicinaStana(62);

            kSession.insert(klima);
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
