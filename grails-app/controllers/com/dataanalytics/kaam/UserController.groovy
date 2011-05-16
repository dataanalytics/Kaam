package com.dataanalytics.kaam

import com.dataanalytics.kaam.User;

class UserController {

	def scaffold = User
	
	def index = {
		redirect(action: "list", params: params)
	}
	
	def list = {
		params.max = Math.min(params.max ?
								params.int('max'): 10, 100)
		[userInstanceList: User.list(params),
			userInstanceTotal: User.count()]
	}
}
