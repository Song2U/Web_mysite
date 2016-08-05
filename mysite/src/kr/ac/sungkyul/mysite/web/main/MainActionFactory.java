package kr.ac.sungkyul.mysite.web.main;

import kr.ac.sungkyul.mysite.web.Action;
import kr.ac.sungkyul.mysite.web.ActionFactory;

public class MainActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {

		return new MainAction();
	}
}