package com.yydh.myapp;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("===> AppelSpeaker 객체 생성");
	}

	@Override
	public void voluemeUp() {
		System.out.println("AppelSpeaker---볼륨을 올린다.");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("AppelSpeaker---볼륨을 내린다.");
		
	}
}
