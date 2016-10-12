package com.cg;

import java.util.List;

public class MyServiceImpl implements IService{

	private IDao IDaoref;
	
	public MyServiceImpl(IDao IDaoref) {
		this.IDaoref = IDaoref;
	}
	
	@Override
	public List<String> getMessages() {
		return IDaoref.getMessages();
	}

}
