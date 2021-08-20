package com.luan.meeting.room.meeting_room.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "meeting_room")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "startHour", nullable = false)
    private String startHour;

    @Column(name = "endHour", nullable = false)
    private String endHour;

    @Override
    public String toString() {
        return String
                .format("Name: %s | Date: %s | Start Hour: %s | End Hour: %s", name, date, startHour, endHour);
    }
}