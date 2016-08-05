package kr.ac.sungkyul.mysite.web;

public abstract class ActionFactory {
	public abstract Action getAction(String actionName);
}