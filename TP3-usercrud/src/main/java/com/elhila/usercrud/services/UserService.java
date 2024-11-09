package com.elhila.usercrud.services;

import com.elhila.usercrud.entities.Role;
import com.elhila.usercrud.entities.User;
import com.elhila.usercrud.entities.UserImage;
import com.elhila.usercrud.repositories.RoleRepository;
import com.elhila.usercrud.repositories.UserImageRepository;
import com.elhila.usercrud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserImageRepository userImageRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User addImageToUser(Long userId, UserImage image) {
        User user = userRepository.findById(userId).orElseThrow(() ->
                new RuntimeException("User not found")
        );
        image.setUser(user);
        user.setUserImage(image);
        return userRepository.save(user);
    }

    public List<User> getUsersByRole(String roleName) {
        return userRepository.findByRoleName(roleName);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() ->
                new RuntimeException("User not found")
        );
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    public User assignRoleToUser(Long userId, Long roleId) {
        User user = userRepository.findById(userId).orElseThrow(() ->
                new RuntimeException("User not found")
        );
        Role role = roleRepository.findById(roleId).orElseThrow(() ->
                new RuntimeException("Role not found")
        );
        user.setRole(role);
        return userRepository.save(user);
    }

    public void deleteRoleById(Long roleId) {
        roleRepository.deleteById(roleId);
    }

    public void deleteImageFromUser(Long userId, Long imageId) {
        UserImage image = userImageRepository.findById(imageId).orElseThrow(() ->
                new RuntimeException("Image not found")
        );
        if (!image.getUser().getId().equals(userId)) {
            throw new RuntimeException("Image does not belong to the user");
        }
        userImageRepository.delete(image);
    }
}
