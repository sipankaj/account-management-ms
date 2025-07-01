package com.sipankaj.billingaccount.services.interfaces;

import com.sipankaj.billingaccount.model.User;

public interface IUserService {
    public User createUser(User user);
    public User getUser(Long id);
}
