package testservice.sample.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class TestVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2471467187272337762L;
	
	
	private int reqParam;
	
	public int getReqParam() {
		return reqParam;
	}
	
	public void setReqParam(int reqParam) {
		this.reqParam = reqParam;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
