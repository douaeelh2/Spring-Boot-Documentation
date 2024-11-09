package com.elhila.usercrud;

import com.elhila.usercrud.entities.Role;
import com.elhila.usercrud.entities.UserImage;
import com.elhila.usercrud.repositories.RoleRepository;
import com.elhila.usercrud.repositories.UserImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsercrudApplication implements CommandLineRunner {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserImageRepository userImageRepository;

	public static void main(String[] args) {
		SpringApplication.run(UsercrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Role adminRole = new Role();
		adminRole.setName("ADMIN");
		roleRepository.save(adminRole);

		Role userRole = new Role();
		userRole.setName("USER");
		roleRepository.save(userRole);

		System.out.println("Roles created: ADMIN, USER");

		UserImage userImage1 = new UserImage();
		userImage1.setImageUrl("/image1.jpg");
		userImageRepository.save(userImage1);

		UserImage userImage2 = new UserImage();
		userImage2.setImageUrl("/image2.jpg");
		userImageRepository.save(userImage2);

		System.out.println("Images created: image1.jpg, image2.jpg");
	}
}


