package com.service.api;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class SerializationOptimizerImpl implements SerializationOptimizer{
	   @SuppressWarnings("rawtypes")
		public Collection<Class> getSerializableClasses() {
	        List<Class> classes = new LinkedList<Class>();
	        
	        return classes;
	    }
}

