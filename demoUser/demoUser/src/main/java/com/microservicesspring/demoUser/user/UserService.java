package com.microservicesspring.demoUser.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservicesspring.demoUser.valueObj.Department;
import com.microservicesspring.demoUser.valueObj.ResponseTemplateVO;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}


	
	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		// TODO Auto-generated method stub
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		Department department =
				restTemplate.getForObject("http://localhost:8080/department/id/"+ user.getDepartmentId(),Department.class);
		
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
}
