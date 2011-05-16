package com.dataanalytics.kaam

class Role {

	static hasMany = [users: User]
	String name
	
    static constraints = {
		name(blank: false, size: 1..20)
    }
	
	public String toString()
	{
		return name
	}
}
