package org.stackroute.AutoWiring_XML;

public class Application {
	private UserApplication userApplication;
	
	public Application() {
		
	}
	public Application(UserApplication userApplication) {
		this.userApplication=userApplication;
	}

	public UserApplication getUserApplication() {
		return userApplication;
	}

	public void setUserApplication(UserApplication userApplication) {
		this.userApplication = userApplication;
	}

	@Override
	public String toString() {
		return "Application [userApplication=" + userApplication + "]";
	}
	
}
