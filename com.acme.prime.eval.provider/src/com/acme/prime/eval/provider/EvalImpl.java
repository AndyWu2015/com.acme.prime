package com.acme.prime.eval.provider;

import org.osgi.service.component.annotations.Component;

import osgi.enroute.debug.api.Debug;
import parsii.eval.Parser;

import com.acme.prime.eval.api.Eval;

/**
 * 
 */
@Component(
		name = "com.acme.prime.eval", 
		property = {
			Debug.COMMAND_SCOPE + "=test", 
			Debug.COMMAND_FUNCTION + "=eval" 
		}
	)
public class EvalImpl implements Eval {
		
	@Override
	public double eval(String expression) throws Exception {
		return Parser.parse(expression).evaluate();
	}	
}
