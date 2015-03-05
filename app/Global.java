import controllers.UserController;
import models.User;
import play.Application;
import play.GlobalSettings;

public class Global extends GlobalSettings {
	
	@Override
	public void onStart(Application app) {
		User ad = User.createAdmin("admin", "admin", "admin@admin.ba", true);	
		UserController.insertAdmin(ad.username);
	}
}