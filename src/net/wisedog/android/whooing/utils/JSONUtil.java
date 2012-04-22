package net.wisedog.android.whooing.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

/**
 * JSON Util Class
 * @author Wisedog(me@wisedog.net)
 * */
public class JSONUtil {
	/**
	 * Get JSON with given URL,header
	 * @param	url		URL to call
	 * @param	headerkey	header key. If it is null, none header is added
	 * @param	headerValye	header value. If it is null, none header is added
	 * @throws	JSONException
	 * @return	Return JSONObject if it success or return null 
	 * */
	static public JSONObject getJSONObject(String url, String headerKey, String headerValue) throws JSONException{
	    HttpClient client = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(url);
		if(headerKey != null && headerValue != null){
			httpGet.addHeader(headerKey, headerValue);
		}
		
		try {
			HttpResponse response = client.execute(httpGet);
			StatusLine statusLine = response.getStatusLine();
			int statusCode = statusLine.getStatusCode();
			if (statusCode == 200) {
				HttpEntity entity = response.getEntity();
				InputStream content = entity.getContent();
				
				// Load the requested page converted to a string into a JSONObject.
                JSONObject result;
				// Get the token value
				result = new JSONObject(StringUtil.convertStreamToString(content));
				return result;
			} else {
				Log.e(JSONUtil.class.toString(), "Failed to download file");
			}
		} catch (ClientProtocolException e) {
			Log.e(JSONUtil.class.toString(), "HttpResponse Failed");
		} catch (IOException e) {
			Log.e(JSONUtil.class.toString(), "HttpResponse IO Failed");
		}

		return null;
	}
}
