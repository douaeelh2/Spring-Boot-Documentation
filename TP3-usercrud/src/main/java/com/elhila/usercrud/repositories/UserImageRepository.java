package com.elhila.usercrud.repositories;

import com.elhila.usercrud.entities.UserImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserImageRepository extends JpaRepository<UserImage, Long> {
    UserImage findByUserId(Long userId);
}
