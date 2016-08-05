package kr.ac.sungkyul.mysite.web.user;

import kr.ac.sungkyul.mysite.web.Action;
import kr.ac.sungkyul.mysite.web.ActionFactory;
import kr.ac.sungkyul.mysite.web.main.MainAction;

public class UserActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		System.out.println(actionName);
		if ("joinform".equals(actionName)) {
			action = new JoinFormAction();
		} else if ("join".equals(actionName)) {
			action = new JoinAction();
		} else {
			action = new MainAction();
		}
		return action;
	}
}