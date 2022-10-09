package org.unit;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.LoginPagePom;

public class JunitTesting extends BaseClass{

	public static void main(String[] args) {
		
		getDriver();
		browserLaunch("http://adactinhotelapp.com/index.php");
		LoginPagePom l=new LoginPagePom();
		WebElement userName = l.getUser();
		elementTextSend(userName, "Prakash21031990");
		WebElement password=l.getPass();
		elementTextSend(password, "6IC187");
		WebElement login = l.getLogin();
		elementTextClick(login);
		WebElement location = l.getLocation();
		select(location, "Sydney");
		WebElement hotels = l.getHotels();
		select(hotels, "Hotel Hervey");
		WebElement room_type = l.getRoom_type();
		select(room_type, "Double");
		WebElement room_nos = l.getRoom_nos();
		select(room_nos, "3 - Three");
		WebElement datepick_in = l.getDatepick_in();
		elementTextClick(datepick_in);
		elementTextSend(datepick_in, "09/10/2022");
		WebElement datepick_out = l.getDatepick_out();
		elementTextSend(datepick_out, "10/10/2022");
		WebElement adult_room = l.getAdult_room();
		select(adult_room, "2 - Two");
		WebElement child_room = l.getChild_room();
		select(child_room, "1 - One");
//		WebElement submit = l.getSubmit();
//		elementTextClick(submit);
	
	}
	
}
