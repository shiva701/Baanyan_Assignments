package coom.baanyan.ums;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baanyan.ums.dao.UserDao;
import com.baanyan.ums.daoImpl.UserDaoImpl;
import com.baanyan.ums.model.User;

/**
 * The Class UserManagementSystem.
 */
public class UserManagementSystem {

	/** The log. */
	private static Logger log = LoggerFactory.getLogger(UserManagementSystem.class);

	/** The udao. */
	static UserDao udao = new UserDaoImpl();

	/** The user. */
	static User user;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		log.info("****** The application starts here ******");

		Scanner sc = new Scanner(System.in);

		System.out.println("\n\n ******** Welcome to the User Management System ******** \n\n");
		while (true) {
			System.out.println("\n\nPlease choose from the options below:\n");
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("3. Forgot Password");
			System.out.println("4. Exit");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("\n\n **** Enter the username ***** \n");
				String uname = sc.next();
				System.out.println("\n\n **** Enter the password ***** \n");
				String pwd = sc.next();
				if (udao.login(uname, pwd)) {
					System.out.println("\n\n ***** Login Successful!! *****");
				} else {
					System.out.println("\n\n >>>>>> Login Unsuccessful! Please try again!!");
				}
				break;
			case 2:
				user = new User();
				System.out.println("\n\n **** Enter the first name ***** \n");
				user.setFirstName(sc.next());
				System.out.println("\n\n **** Enter the last name ***** \n");
				user.setLastName(sc.next());
				System.out.println("\n\n **** Enter the username ***** \n");
				user.setUsername(sc.next());
				System.out.println("\n\n **** Enter the password ***** \n");
				user.setPassword(sc.next());
				int cnt = udao.registerUser(user);
				if (cnt == 1) {
					System.out.println("\n\n**** User registered **** ");
				} else {
					System.out.println("\n\n**** Cannot register user. User may already exist **** ");
				}
				break;
			case 3:
				System.out.println("\n\n ***** Please enter the username: \n");
				String username = sc.next();
				System.out.println("\n\n ***** Please enter the new password: \n");
				String password = sc.next();
				if (udao.forgotPassword(username, password)) {
					System.out.println("\n\n***** Password Changed Successfully!! *****");
				} else {
					System.out.println("\n\n***** Unable to change the password, please try again!! *****");
				}
				break;
			case 4:
				System.out.println("\n\nThank you for using our system!! ");
				sc.close();
				System.exit(1);
			default:
				System.out.println("\n\n>>>>>> Please select a valid option!!");
			}
		}

	}

}
