package com.satish.thread.ScheduleExecutorService;

import java.util.*;
import java.util.concurrent.Callable;

public class CallableImpl implements Callable{

	@Override
	public List<String> call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("testing");
		List<String> list = new ArrayList();
		list.add("test");
		return list;
	}

	

}
