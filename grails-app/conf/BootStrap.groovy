import com.dataanalytics.kaam.Role;

class BootStrap {

    def init = { servletContext ->
		def user = new Role(name: 'User').save()
		def admin = new Role(name: 'Administrator').save()
		
    }
    def destroy = {
    }
}
