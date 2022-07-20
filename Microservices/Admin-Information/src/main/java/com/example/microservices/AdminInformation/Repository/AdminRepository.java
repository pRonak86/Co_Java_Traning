package com.example.microservices.AdminInformation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.microservices.AdminInformation.bean.Admin;
@Service
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
