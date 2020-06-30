package sg.edu.LeaveApplication.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.LeaveApplication.model.LeaveRecord;

public interface LeaveRepository extends JpaRepository<LeaveRecord, Integer> {
	
	@Query("Select l from LeaveRecord l where l.status=0")
	ArrayList<LeaveRecord> findAllPendingLeave();
	
	@Query("Select distinct l.status from LeaveRecord l")
    ArrayList<String> findAllLeaveStatus();

	@Query("SELECT l from LeaveRecord l JOIN l.user u WHERE u.firstName LIKE %:keyword% OR u.lastName LIKE %:keyword% ")
	ArrayList<LeaveRecord> findLeaveByEmployeeName(@Param("keyword") String keyword);
}
