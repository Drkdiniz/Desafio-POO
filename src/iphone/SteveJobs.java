package iphone;

public class SteveJobs {

	public static void main(String[] args) {
		iPhone myiPhone = new iPhone();
        myiPhone.selectMusic("Imagine - John Lennon");
        myiPhone.play();
        myiPhone.pause();

        myiPhone.call("123-456-7890");
        myiPhone.answer();

        myiPhone.displayPage("https://www.example.com");
        myiPhone.addNewTab();
        myiPhone.refreshPage();
    }


	}


