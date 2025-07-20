package com.nikhil.ShowStream.repositories;

import com.nikhil.ShowStream.models.Show;
import com.nikhil.ShowStream.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long> {
    List<ShowSeatType> findAllByShow(Show show);
}
