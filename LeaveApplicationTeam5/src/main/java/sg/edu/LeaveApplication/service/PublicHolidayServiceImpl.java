package sg.edu.LeaveApplication.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.LeaveApplication.model.PublicHolidays;
import sg.edu.LeaveApplication.repo.PublicHolidayReposity;

@Service
public class PublicHolidayServiceImpl implements PublicHolidayService {

	@Autowired
	PublicHolidayReposity holiRepo;

	@Override
	public ArrayList<PublicHolidays> findAll() {
		// TODO Auto-generated method stub
		ArrayList<PublicHolidays> list = (ArrayList<PublicHolidays>) holiRepo.findAll();
		return list;
	}

	@Override
	public boolean createPublicHoliday(PublicHolidays holiday) {
		// TODO Auto-generated method stub
		if (holiRepo.save(holiday) != null)
			return true;
		else
			return false;

	}

	@Override
	public boolean editPublicHoliday(PublicHolidays holiday) {
		// TODO Auto-generated method stub
		if (holiRepo.save(holiday) != null)
			return true;
		else
			return false;
	}

	@Override
	public void deletePublicHoliday(PublicHolidays holiday) {
		// TODO Auto-generated method stub
		holiRepo.delete(holiday);
	}

	@Override
	public PublicHolidays findPublicHolidayByName(String name) {
		// TODO Auto-generated method stub
		ArrayList<PublicHolidays> holidays = new ArrayList<PublicHolidays>();
		PublicHolidays holiday = holidays.get(0);
		return holiday;

	}

	@Override
	public PublicHolidays findPublicHolidaysById(Integer id) {
		// TODO Auto-generated method stub
		PublicHolidays holiday = (PublicHolidays) holiRepo.findById(id).get();
		return holiday;
	}

}
