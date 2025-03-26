package login;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    List<Account> findAll();
    
    Optional<Account> findAccountByUsername(String username);
    
    int save(Account account);
    
    void close();
}
