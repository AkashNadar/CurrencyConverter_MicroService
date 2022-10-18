package com.idfc.service;

import org.springframework.stereotype.Service;

@Service
public class CurrConvertServiceImple implements CurrConverterService {

	@Override
	public double getExRateInInr(String title) {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double convertCurrByTitle(double curr, String fromCurr, String toCurr) {
		// TODO Auto-generated method stub
//		double from = this.getExRateInInr(fromCurr);
//		double to = this.getExRateInInr(toCurr);
		double from = 82.42;
		double to = 80.12;
		from = (to / from);
		return curr * from;
	}

}
