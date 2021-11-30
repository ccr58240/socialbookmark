package com.semanticsquare.thrillio.dao;

import com.semanticsquare.thrillio.DataStore;
import com.semanticsquare.thrillio.entities.User;
import java.util.*;

public class UserDao {
    public List<User> gerUsers() {
        return DataStore.getUsers();
    }
}
