package com.nikhil.ShowStream.services;

import com.nikhil.ShowStream.models.Show;
import com.nikhil.ShowStream.models.ShowSeat;
import com.nikhil.ShowStream.models.ShowSeatType;
import com.nikhil.ShowStream.repositories.ShowSeatTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCalculatorService {
    private ShowSeatTypeRepository showSeatTypeRepository;

    public PriceCalculatorService(
            ShowSeatTypeRepository showSeatTypeRepository
    ) {
        this.showSeatTypeRepository = showSeatTypeRepository;
    }

    public int calculatePrice(Show show, List<ShowSeat> showSeats) {
        List<ShowSeatType> showSeatTypeList = showSeatTypeRepository
                .findAllByShow(show);

        int amount = 0;
        for(ShowSeat showSeat: showSeats) {
            for(ShowSeatType showSeatType: showSeatTypeList) {
                if(showSeat.getSeat().getSeatType()
                        .equals(showSeatType.getSeatType())) {
                    amount += showSeatType.getPrice();
                }
            }
        }


        return amount;
    }
}












