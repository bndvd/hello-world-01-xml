package bdn.helloworld.repository;

import java.util.ArrayList;
import java.util.List;

import bdn.helloworld.model.FinSecurity;

public class AccountRepositoryImpl implements AccountRepository {

	/* (non-Javadoc)
	 * @see bdn.helloworld.repository.AccountRepository#getAllFinSecurities()
	 */
	@Override
	public List<FinSecurity> getAllFinSecurities() {
		List<FinSecurity> _list = new ArrayList<FinSecurity>();
		
		FinSecurity _security = new FinSecurity();
		_security.setId("1");
		_security.setFullName("Vanguard Total Stock Market");
		_security.setTicker("VTI");
		
		_list.add(_security);
		
		return _list;
	}

}
