package ETicaretDemo.entities.concrete;

import ETicaretDemo.entities.abstracts.Entity;

public class User implements Entity{
		
		private String firstName;
		private String lastName;
		private String eposta;
		private String password;
		
		public User() {
			
		}

		public User(String firstName, String lastName, String eposta, String password) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.eposta = eposta;
			this.password = password;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEposta() {
			return eposta;
		}

		public void setEposta(String eposta) {
			this.eposta = eposta;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		
}
