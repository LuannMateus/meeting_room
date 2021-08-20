package com.luan.meeting.room.meeting_room.service;

import com.luan.meeting.room.meeting_room.model.Room;
import com.luan.meeting.room.meeting_room.repository.RoomRepository;
import com.luan.meeting.room.meeting_room.utils.exception.GlobalExceptionHandler;
import com.luan.meeting.room.meeting_room.utils.exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class RoomService {
    private RoomRepository roomRepository;

    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    public Room findById(Long id) throws ResourceNotFoundException {
        return roomRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Room not found! " + id));
    }

    public Room save(Room room) {
        return roomRepository.save(room);
    }

    public void deleteById(Long id) {
        roomRepository.deleteById(id);
    }


}
