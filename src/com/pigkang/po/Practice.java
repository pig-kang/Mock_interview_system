package com.pigkang.po;
/**
 * 
 * 练习持久化类
 *
 *
 */
public class Practice {
	private Integer pra_id;//题目id
	private String pra_topic;//题目内容
	
	public Integer getPra_id() {
		return pra_id;
	}
	public void setPra_id(Integer pra_id) {
		this.pra_id = pra_id;
	}
	public String getPra_topic() {
		return pra_topic;
	}
	public void setPra_topic(String pra_topic) {
		this.pra_topic = pra_topic;
	}
	
	@Override
	public String toString(){
		return "Practice[pra_id="+pra_id+",pra_topic="+pra_topic+"]";
	}
	
}
