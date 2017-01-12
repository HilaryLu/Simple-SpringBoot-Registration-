package com.example.auth.repository;

import com.example.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sartika.s.hasibuan on 1/11/2017.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
