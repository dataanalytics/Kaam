package com.dataanalytics.kaam

class User {
	String firstName
	String lastName
	String username
	String password
	Date lastAuthentication
	static belongsTo = [role: Role]
	
    static constraints = {
		username(blank: false, size: 4..20, unique: true)
		password(blank: false, size: 4..20, password: true)
		firstName(blank: false, size:1..20)
		lastName(blank: false, size:1..30)
		role()
    }
}
