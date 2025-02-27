package com.praveen.PraveenHotel.service.interfac;

import com.praveen.PraveenHotel.dto.LoginRequest;
import com.praveen.PraveenHotel.dto.Response;
import com.praveen.PraveenHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}