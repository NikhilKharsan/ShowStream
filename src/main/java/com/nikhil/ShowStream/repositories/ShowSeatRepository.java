package com.nikhil.ShowStream.repositories;

import com.nikhil.ShowStream.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
    //List<ShowSeat> findAllById(List<Long> showSeatIds);
}
