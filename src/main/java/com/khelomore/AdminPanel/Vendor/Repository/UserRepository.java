package com.khelomore.AdminPanel.Vendor.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.khelomore.AdminPanel.Vendor.model.AdminUsers;

@Repository
public interface UserRepository extends JpaRepository<AdminUsers, String>
{
	Optional<AdminUsers>findByphone(String phone);

}
