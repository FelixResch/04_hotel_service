package at.resch.ue_04;

import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {

	@Override
	public String getName() {
		return "Test Hotel Service";
	}

	@Override
	public String getAddress() {
		return "21st Jump Street";
	}

}
