package ArtemTsmyg.ru.my_first_crud.service;

import ArtemTsmyg.ru.my_first_crud.model.User;
import ArtemTsmyg.ru.my_first_crud.repository.UserRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    public User getOne(int id) {
        return userRepository.getOne(id);
    }
}