package net.lighthouseplan.spring.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.lighthouseplan.spring.jpa.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	Account findByUsername(String username);
	
	Account save(Account account);
}
