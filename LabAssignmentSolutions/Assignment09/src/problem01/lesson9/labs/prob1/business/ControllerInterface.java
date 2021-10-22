package problem01.lesson9.labs.prob1.business;

import java.util.List;

import problem01.lesson9.labs.prob1.business.Book;
import problem01.lesson9.labs.prob1.dataaccess.DataAccess;
import problem01.lesson9.labs.prob1.dataaccess.DataAccessFacade;

public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	
}
