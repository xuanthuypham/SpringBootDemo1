package com.xuanthuy.springbootdemo.scheluder;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class DemoSchedulewithWriteConsole {

	//In ra màn hình thời gian hiện tại
	//Bắt đầu in sau 3 giây khi chạy ứng dụng
	//In xong (hoàn thành nhiệm vụ) thì dừng 2 giây trước khi lại chạy tiếp
	@Scheduled(initialDelay = 3*1000,fixedDelay = 2*1000)
	public void writeCurrentTiem() {
		Date date = new Date();
		System.out.println("=========================");
		System.out.println(date.toString());
	}
}
