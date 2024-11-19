package org.example.server.Service;

import org.example.server.Model.Repository.TicketRepository;
import org.example.server.Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    private static final String TICKET_KEY_PREFIX = "reserved_ticket:";

    public void saveTicket(Ticket ticket) {
        Ticket ticket1 = ticketRepository.save(ticket);
        reserveTicket(ticket1.getTicketId());
    }


    // Giữ vé trong Redis
    public void reserveTicket(int ticketId) {
        String redisKey = TICKET_KEY_PREFIX + ticketId;

        // Lưu thông tin vé với thời gian hết hạn 10 phút
        redisTemplate.opsForValue().set(redisKey, "reserved", 10, TimeUnit.MINUTES);
    }

    // Kiểm tra vé có đang được giữ hay không
    public boolean isTicketReserved(String ticketId) {
        String redisKey = TICKET_KEY_PREFIX + ticketId;
        return Boolean.TRUE.equals(redisTemplate.hasKey(redisKey));
    }

    // Xóa vé khi thanh toán
    public void releaseTicket(int ticketId) {
        String redisKey = TICKET_KEY_PREFIX + ticketId;
        redisTemplate.delete(redisKey);
    }
}

