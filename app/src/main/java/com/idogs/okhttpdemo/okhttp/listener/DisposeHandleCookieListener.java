package com.idogs.okhttpdemo.okhttp.listener;

import java.util.ArrayList;

/**
 * cookies
 */
public interface DisposeHandleCookieListener extends DisposeDataListener
{
	public void onCookie(ArrayList<String> cookieStrLists);
}
