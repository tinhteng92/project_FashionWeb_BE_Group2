package com.codegym.service.impl;


import com.codegym.model.Account;
import com.codegym.repository.IAccountRepo;
import com.codegym.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class AccountService implements IAccountService {
    @Autowired
    IAccountRepo iAccountRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = iAccountRepo.findByUsername(username);
        return new User(account.getUsername(), account.getPassword(), account.getRoles());
        //account.getDisplayName(), account.getGender(), account.getAddress(), account.getPhoneNumber(),
    }
    public List<Account> getAll(){
        return (List<Account>) iAccountRepo.findAll();
    }

    @Override
    public Account save(Account account) {
        return iAccountRepo.save(account);

    }

    @Override
    public void delete(Long id) {
        iAccountRepo.deleteById(id);
    }

    @Override
    public Account findByUsername(String username) {
        return iAccountRepo.findByUsername(username);
    }

    public Account findAccountByUserName(String username){
        return iAccountRepo.findByUsername(username);}

    public void setRoleByID(long id) {
        iAccountRepo.saveRole(id);
    }

    public List<String> findRoleByUsername(String username){
        return iAccountRepo.findRoleByUsername(username);
    }

    public Long findIdByName(String username){
        return iAccountRepo.findIdByUsername(username);
    }
}
