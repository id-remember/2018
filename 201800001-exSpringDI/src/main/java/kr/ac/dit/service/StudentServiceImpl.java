package kr.ac.dit.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.ac.dit.persistence.StudentDAO;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDAO;
	public void studentCreate() {
		studentDAO.studentInsert();
	}
}
