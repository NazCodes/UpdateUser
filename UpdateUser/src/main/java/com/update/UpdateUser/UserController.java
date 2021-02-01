package com.update.UpdateUser;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ch.qos.logback.classic.Logger;
@Controller
public class UserController {
	Logger theLogger = (Logger) LoggerFactory.getLogger(UserController.class);
	UserEntity ue = new UserEntity();
	@Autowired
	UserRepository myRepo;
	
	@GetMapping(path = "/userlogin")
	public String addUserPage() {
		ue.setUserID(27);
		ue.setName("John");
		myRepo.save(ue);
		theLogger.info("Data Saved");
		return "user";
	}
	
	@PostMapping(path = "/updateuser")
	public String addNewUserPage(UserEntity userEntity) {
		myRepo.save(ue);
		Iterable<UserEntity> userInfo = myRepo.findAll();
		for(UserEntity myEnt : userInfo) {
			if(myEnt.getUserID().equals(ue.getUserID()) && myEnt.getName().equals(ue.getName())) {
				return "updateuser";
			}
		}
		return "invaliduser";
	}
	
	
	@PostMapping(path = "/confirmupdate")
	public String newUserAdded(UserEntity newEntity) {
		Iterable<UserEntity> newInfo = myRepo.findAll();
		for(UserEntity newEnt : newInfo) {
			if(myRepo.existsById(ue.getUserID())) {
				myRepo.delete(ue);
				ue.setUserID(newEnt.getUserID());
				ue.setName(newEnt.getName());
				myRepo.save(ue);
				return "confirmupdate";
			} 
		}
		return "failedupdate";
	}
	
	
}