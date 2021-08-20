package com.luan.meeting.room.meeting_room.repository;

import com.luan.meeting.room.meeting_room.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
