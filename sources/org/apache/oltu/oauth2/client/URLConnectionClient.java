package org.apache.oltu.oauth2.client;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthClientResponse;
import org.apache.oltu.oauth2.client.response.OAuthClientResponseFactory;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;

public class URLConnectionClient implements HttpClient {
    public OAuthClientResponse a(OAuthClientRequest oAuthClientRequest, Map map, String str, Class cls) {
        InputStream inputStream;
        int i2;
        Map hashMap = new HashMap();
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(oAuthClientRequest.c()).openConnection());
            if (uRLConnection instanceof HttpURLConnection) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (oAuthClientRequest.f() != null) {
                    for (Map.Entry entry2 : oAuthClientRequest.f().entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                if (OAuthUtils.l(str)) {
                    httpURLConnection.setRequestMethod("GET");
                } else {
                    httpURLConnection.setRequestMethod(str);
                    b(oAuthClientRequest, str, httpURLConnection);
                }
                httpURLConnection.connect();
                i2 = httpURLConnection.getResponseCode();
                if (i2 != 400) {
                    if (i2 != 401) {
                        inputStream = httpURLConnection.getInputStream();
                        hashMap = httpURLConnection.getHeaderFields();
                    }
                }
                inputStream = httpURLConnection.getErrorStream();
                hashMap = httpURLConnection.getHeaderFields();
            } else {
                inputStream = null;
                i2 = -1;
            }
            return OAuthClientResponseFactory.a(inputStream, uRLConnection.getContentType(), i2, hashMap, cls);
        } catch (IOException e2) {
            throw new OAuthSystemException(e2);
        }
    }

    public final void b(OAuthClientRequest oAuthClientRequest, String str, HttpURLConnection httpURLConnection) {
        String e2 = oAuthClientRequest.e();
        if (!OAuthUtils.l(e2)) {
            if ("POST".equals(str) || "PUT".equals(str)) {
                httpURLConnection.setDoOutput(true);
                PrintWriter printWriter = new PrintWriter(httpURLConnection.getOutputStream());
                printWriter.print(e2);
                printWriter.flush();
                printWriter.close();
            }
        }
    }
}
