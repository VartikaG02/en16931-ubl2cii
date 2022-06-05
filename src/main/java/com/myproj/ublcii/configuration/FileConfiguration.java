package com.myproj.ublcii.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "file")
public class FileConfiguration {	
    
    private String ublciiInput;
    
    private String ublciiOutput;
    
    private String ublciiHome;

	public String getUblciiInput() {
		return ublciiInput;
	}

	public void setUblciiInput(String ublciiInput) {
		this.ublciiInput = ublciiInput;
	}

	public String getUblciiOutput() {
		return ublciiOutput;
	}

	public void setUblciiOutput(String ublciiOutput) {
		this.ublciiOutput = ublciiOutput;
	}

	public String getUblciiHome() {
		return ublciiHome;
	}

	public void setUblciiHome(String ublciiHome) {
		this.ublciiHome = ublciiHome;
	}
    
}
