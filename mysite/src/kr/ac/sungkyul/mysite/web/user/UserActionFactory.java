package kr.ac.sungkyul.mysite.web.user;

import kr.ac.sungkyul.mysite.web.Action;
import kr.ac.sungkyul.mysite.web.ActionFactory;
import kr.ac.sungkyul.mysite.web.guestbook.DeleteFormAction;
import kr.ac.sungkyul.mysite.web.guestbook.GuestBookAction;
import kr.ac.sungkyul.mysite.web.guestbook.InsertFormAction;
import kr.ac.sungkyul.mysite.web.main.MainAction;

public class UserActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		System.out.println("UserFactory actionName : " + actionName);
		if ("joinform".equals(actionName)) {
			action = new JoinFormAction();

		} else if ("join".equals(actionName)) {
			action = new JoinAction();

		} else if ("loginform".equals(actionName)) {
			action = new LoginFormAction();

		} else if ("login".equals(actionName)) {
			action = new LoginAction();

		} else if ("joinsuccess".equals(actionName)) {
			action = new JoinSuccessAction();

		} else if ("gb".equals(actionName)) {
			action = new GuestBookAction();

		} else if ("delete".equals(actionName)) {
			action = new DeleteFormAction();
				
		}else if("insert".equals(actionName)){
			action = new InsertFormAction();
		}
		else {
			action = new MainAction();

		}
		return action;
	}
}