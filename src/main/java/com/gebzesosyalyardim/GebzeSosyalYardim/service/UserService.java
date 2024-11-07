/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.User;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface UserService {
       User saveUser(User user);
    Optional<User> getUserById(int id);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(int id);
}
