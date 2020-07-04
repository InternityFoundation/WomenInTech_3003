package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.service.JobService;
import com.example.project.vo.JobResponseVO;


@RestController
public class JobController {
	@Autowired
	private JobService jobService;
	
	
	@GetMapping("/api/v1/job/{job_id}")
	public JobResponseVO getProfileBasicById(@PathVariable( value = "job_id") long jobId) {

		return jobService.getJobById(jobId);

}

}
//@PutMapping("/api/v1/user/{user_id}/")
//public UserResponseVO getUserById(@Valid@PathVariable( value = "user_id") long userId) {
//
//	return userService.getUserById(userId);
//
//}
////project
//@PutMapping(path = "{/group-id}", consumes = "application/json", produces = "application/json")
//
//public ResponseVO updateGroup(@RequestBody GroupVO groups) {
//
//	return groupService.updateGroup(groups);
//
//}


//our api	@PutMapping("/user/{id}")
//public User updateUser(@RequestBody User user, @PathVariable("id") long id) {
//	
//	//return this.userService.updateUser(user);
//	User existingUser = this.userService.findById(id).orElseThrow(()-> 
//	new ResourceNotFoundException("User not found with id ::"+id));
//	existingUser.setFirstName(user.getFirstName());
//	existingUser.setLastName(user.getLastName());
//	existingUser.setEmail(user.getEmail());
//	 return this.userService.save(existingUser);
//}