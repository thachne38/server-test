package org.example.server.Model.Repository;

import org.example.server.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    @Modifying
    @Transactional
    @Query("UPDATE Ticket t SET t.status = :status WHERE t.ticketId = :ticketId")
    void updateTicketStatus(@Param("status") String status, @Param("ticketId") Long ticketId);
}
