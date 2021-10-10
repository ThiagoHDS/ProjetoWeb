package app.mapper;

import app.dto.UserDTO;
import app.model.User;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapper {

	@Autowired
	private ModelMapper modelMapper;

	public UserDTO convertToUserDTO(User user) {
		UserDTO userDTO = modelMapper.map(user, UserDTO.class);

		return userDTO;
	}

	public User convertFromUserDTO(UserDTO userDTO) {
		User user = modelMapper.map(userDTO, User.class);

		return user;
	}

}
