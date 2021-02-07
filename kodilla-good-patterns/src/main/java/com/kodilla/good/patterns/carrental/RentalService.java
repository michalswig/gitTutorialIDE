package com.kodilla.good.patterns.carrental;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface RentalService {
    boolean rent(User user, LocalDateTime from, LocalDateTime to);
}
