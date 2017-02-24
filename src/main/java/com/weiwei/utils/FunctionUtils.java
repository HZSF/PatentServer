package com.weiwei.utils;

import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class FunctionUtils {

	public static Optional<?> waitTillThreadFinish(Future<?> thread) {
		try {
			return Optional.ofNullable(thread.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}
	
}
