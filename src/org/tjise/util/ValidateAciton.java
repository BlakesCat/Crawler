package org.tjise.util;

import java.util.List;

import org.tjise.crawler.Operation;
import org.tjise.crawler.Website;

import com.opensymphony.xwork2.ActionSupport;

public class ValidateAciton extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2501304847481056251L;
	
	private Website website;
	private List<Website> webs;
	
	
	public List<Website> getWebs() {
		return webs;
	}

	public void setWebs(List<Website> webs) {
		this.webs = webs;
	}

	public Website getWebsite() {
		return website;
	}

	public void setWebsite(Website website) {
		this.website = website;
	}

	public String execute(){
		if(!website.equals("") && website != null){
			Operation op = new Operation();
			op.add(website);
		
			return "success";
		}
		return "input";
	}
	
	public String execute2(){
		Operation op = new Operation();
		webs = op.Allselect();
		
		return "success";
		
	}
	
	public String execute3(){
		Operation op = new Operation();
		op.delete(website.getName());
		webs = op.Allselect();
		return "success";
		
	}
	
	public String execute4(){
		Operation op = new Operation();
		op.update(website.getName(),website.getChannel());
		webs = op.Allselect();
		return "success";
		
	}
	public String quit(){
		
		return "input";
		
	}
}
