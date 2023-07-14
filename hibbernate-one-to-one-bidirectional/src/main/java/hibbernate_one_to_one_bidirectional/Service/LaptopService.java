package hibbernate_one_to_one_bidirectional.Service;

import hibbernate_one_to_one_bidirectional.dao.laptopDao;
import hibbernate_one_to_one_bidirectional.dto.Laptop;

public class LaptopService {
	laptopDao laptopDao = new laptopDao();
	public void saveLaptop(Laptop laptop) {
		laptopDao.saveLaptop(laptop);
	}
}
