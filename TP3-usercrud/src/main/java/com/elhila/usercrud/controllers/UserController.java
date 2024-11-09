package com.elhila.usercrud.controllers;

import com.elhila.usercrud.entities.User;
import com.elhila.usercrud.entities.UserImage;
import com.elhila.usercrud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{userId}/role/{roleId}")
    public User assignRoleToUser(@PathVariable Long userId, @PathVariable Long roleId) {
        return userService.assignRoleToUser(userId, roleId);
    }

    @PostMapping("/{userId}/image")
    public User addImageToUser(@PathVariable Long userId, @RequestBody UserImage image) {
        return userService.addImageToUser(userId, image);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
    }

    @DeleteMapping("/role/{roleId}")
    public void deleteRoleById(@PathVariable Long roleId) {
        userService.deleteRoleById(roleId);
    }

    @DeleteMapping("/{userId}/image/{imageId}")
    public void deleteImageFromUser(@PathVariable Long userId, @PathVariable Long imageId) {
        userService.deleteImageFromUser(userId, imageId);
    }

    @GetMapping("/role/{roleName}")
    public List<User> getUsersByRole(@PathVariable String roleName) {
        return userService.getUsersByRole(roleName);
    }
}
