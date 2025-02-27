package com.praveen.PraveenHotel.service.interfac;

import com.praveen.PraveenHotel.dto.Response;
import com.praveen.PraveenHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}