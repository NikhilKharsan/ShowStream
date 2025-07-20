package com.nikhil.ShowStream.repositories;

import com.nikhil.ShowStream.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
