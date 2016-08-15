package com.test;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

public class RestCallClient {
	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		
	String requestString = "{\"labels\":[{\"type\":\"type\",\"value\":\"variant\"},{\"type\":\"platform\",\"value\":\"MTQ\"},{\"type\":\"ssoIsbn\",\"value\":\"9781337274180\"}]}";
	HttpPost post = new HttpPost("https://lcs-v2-int.cengage.info/services/lcs/v2/ws/workspaces/byLabels");
	StringEntity requestEntity = new StringEntity(requestString,ContentType.APPLICATION_JSON);
	post.setEntity(requestEntity);
    HttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE).build();
    HttpResponse response = httpClient.execute(post);
    String json = EntityUtils.toString(response.getEntity(), "UTF-8");
    Gson gson =  new Gson();
    JsonResponse1 res = gson.fromJson(json, JsonResponse1.class);
    List<Workspace> list = res.getWorkspaces();
    for(Workspace w : list) {
    	System.out.println(w.getId());
    }
    
    
	}

}
