package root.demo.services;

import java.util.List;

import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import root.demo.model.Casopis;
import root.demo.model.FormSubmissionDto;
import root.demo.model.Rad;
import root.demo.repository.CasopisRepository;
import root.demo.repository.RadRepository;

@Service
public class DOIService implements JavaDelegate{

	@Autowired
	IdentityService identityService;
	@Autowired
	RadRepository userRepository;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String radId = (String) execution.getVariable("radId");
		Rad casopis = userRepository.getOne(Long.parseLong(radId));
	     
		String DOI = "10.xxx/yyyyy";
		
	    casopis.setDoi(DOI);  
	      casopis.setObjavljen(true);
	      
	      userRepository.save(casopis);
	}


}
