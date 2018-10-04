package kr.ac.dit.persistence;
import org.springframework.stereotype.Repository;
@Repository
public class StudentDAOImpl implements StudentDAO {
	public void studentInsert() {
		System.out.println("Spring DI pattern~!");
	}
}
