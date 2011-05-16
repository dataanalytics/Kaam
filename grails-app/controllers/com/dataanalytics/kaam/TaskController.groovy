package com.dataanalytics.kaam

class TaskController {

    def create = {
		return [ task: new Task() ]
	}
	def save = {
		def task = new Task( params )
		if( !task.hasErrors() && task.save() )
		{
			flash.userMessage = "Task [${task.description}] has been added."
			redirect( action: 'create' )
		}
		else
		{
			render( view: 'create', model:[task: task])
		}
	}
}
