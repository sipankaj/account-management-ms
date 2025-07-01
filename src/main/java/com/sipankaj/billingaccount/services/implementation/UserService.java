package com.sipankaj.billingaccount.services.implementation;

import com.sipankaj.billingaccount.model.User;
import com.sipankaj.billingaccount.model.UserProperties;
import com.sipankaj.billingaccount.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService implements IUserService {
    private final Map<Long, User> userStore = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    @Autowired UserProperties userProperties;

    public User createUser(User user) {
        Long id = idGenerator.incrementAndGet();
        User userWithId = new User(id, userProperties.namePrefix() + user.name(), user.email());
        userStore.put(id, userWithId);
        return userWithId;
    }

    public User getUser(Long id) {
        return userStore.get(id);
    }
}