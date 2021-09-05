package org.microservice.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.microservice.model.User;

public interface ExcelService {

	public User readData(String id) throws FileNotFoundException,IOException;

}
