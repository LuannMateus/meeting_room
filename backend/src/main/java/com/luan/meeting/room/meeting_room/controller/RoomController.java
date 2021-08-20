package com.luan.meeting.room.meeting_room.controller;

import com.luan.meeting.room.meeting_room.model.Room;
import com.luan.meeting.room.meeting_room.service.RoomService;
import com.luan.meeting.room.meeting_room.utils.exception.GlobalExceptionHandler;
import com.luan.meeting.room.meeting_room.utils.exception.ResourceNotFoundException;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/api/v1/rooms")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class RoomController {
    private RoomService roomService;

    @GetMapping
    public List<Room> findAll() {
        return roomService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Room> findById(@PathVariable Long id) throws ResourceNotFoundException {
        Room room = roomService.findById(id);

        return ResponseEntity.ok().body(room);
    }

    @PostMapping
    public Room save(@Valid @RequestBody Room room) {
        return roomService.save(room);
    }

    @PutMapping("{id}")
    public ResponseEntity<Room> update(@PathVariable Long id, @Valid @RequestBody Room room) throws ResourceNotFoundException {
        Room oldRoom = roomService.findById(id);

        final Room updatedRoom = roomService.save(room);

        return ResponseEntity.ok().body(updatedRoom);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        roomService.deleteById(id);
    }


}
