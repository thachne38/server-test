package org.example.server.Controller.Api;

import lombok.extern.slf4j.Slf4j;
import org.example.server.Model.Response.Response;
import org.example.server.Model.Ticket;
import org.example.server.Service.JwtDecodeService;
import org.example.server.Service.JwtEncodeService;
import org.example.server.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class TicketControler {
    @Autowired
    private TicketService ticketService;
    @Autowired
    private JwtDecodeService jwtDecodeService;
    @Autowired
    private JwtEncodeService jwtEncodeService;

    @GetMapping("/tickets")
    public ResponseEntity<?> getListTicket(@RequestHeader(value = "Authorization", required = false) String authorizationHeader, @RequestBody Ticket ticket) {
        if (authorizationHeader == null || authorizationHeader.isEmpty() || !authorizationHeader.startsWith("Bearer ")) {
            return ResponseEntity.status(401).body("Token không hợp lệ");
        }
        String token = authorizationHeader.substring(7);
        if (!jwtDecodeService.isTokenValid(token)) {
            return ResponseEntity.status(401).body("Vui lòng đăng nhập lại");
        } else {
            try {
                ticketService.saveTicket(ticket);
                return ResponseEntity.ok(new Response("Đặt vé thành công", 200));
            } catch (Exception e) {
                log.error(e.getMessage());
                return ResponseEntity.status(401).body("Lỗi hệ thống");
            }
        }
    }

}
