package com.sidh.drools.test.conf;

import com.sidh.drools.test.conf.model.Applicant;
import org.kie.api.KieServices;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

public class Configuration {
  public static void main(String[] args) {
    //
      KieServices kieServices = KieServices.Factory.get();
      KieContainer kieContainer = kieServices.getKieClasspathContainer();
      StatelessKieSession kieSession = kieContainer.newStatelessKieSession();

      Applicant applicant = new Applicant("Sidharth", 15, true);
    System.out.println(applicant);
      kieSession.execute(applicant);

    System.out.println(applicant);
  }
}
