package com.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EchoBean {
	@Autowired	// 자동으로 AnotherBean을 찾아서 주입된다.
	@Qualifier(value="anotherBean")	
	//Another 타입이 xml에 여러개인 경우에 명시적으로 지정(id값)
	AnotherBean another;
	
	/*public AnotherBean getAnother() {
		return another;
	}

	public void setAnother(AnotherBean another) {
		this.another = another;
	}*/

	public String sayEcho(String mesg){
		return "hello" + mesg;
	}

}
