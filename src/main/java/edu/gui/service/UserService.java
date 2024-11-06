package edu.gui.service;

import edu.gui.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
