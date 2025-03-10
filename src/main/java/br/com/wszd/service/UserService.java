package br.com.wszd.service;

import br.com.wszd.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
