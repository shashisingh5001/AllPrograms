package hibernatedatabase;

public class User {
	
	
		private int id;  
		private String name,password,email;
		public User() {
			super();
			
		}
		public User(String name, String password, String email) {
			super();
			this.name = name;
			this.password = password;
			this.email = email;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}  
		  
		 
		  
		 

}
