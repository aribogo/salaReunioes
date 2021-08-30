package dev.ari.gerenciadorsalareuniao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.ari.gerenciadorsalareuniao.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
