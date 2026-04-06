package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.LogResponse;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Retries;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.lokalise.sdk.api.Params;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

final class CctTransportBackend implements TransportBackend {

    /* renamed from: a  reason: collision with root package name */
    public final DataEncoder f23836a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f23837b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f23838c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f23839d;

    /* renamed from: e  reason: collision with root package name */
    public final Clock f23840e;

    /* renamed from: f  reason: collision with root package name */
    public final Clock f23841f;

    /* renamed from: g  reason: collision with root package name */
    public final int f23842g;

    public static final class HttpRequest {

        /* renamed from: a  reason: collision with root package name */
        public final URL f23843a;

        /* renamed from: b  reason: collision with root package name */
        public final BatchedLogRequest f23844b;

        /* renamed from: c  reason: collision with root package name */
        public final String f23845c;

        public HttpRequest(URL url, BatchedLogRequest batchedLogRequest, String str) {
            this.f23843a = url;
            this.f23844b = batchedLogRequest;
            this.f23845c = str;
        }

        public HttpRequest a(URL url) {
            return new HttpRequest(url, this.f23844b, this.f23845c);
        }
    }

    public static final class HttpResponse {

        /* renamed from: a  reason: collision with root package name */
        public final int f23846a;

        /* renamed from: b  reason: collision with root package name */
        public final URL f23847b;

        /* renamed from: c  reason: collision with root package name */
        public final long f23848c;

        public HttpResponse(int i2, URL url, long j2) {
            this.f23846a = i2;
            this.f23847b = url;
            this.f23848c = j2;
        }
    }

    public CctTransportBackend(Context context, Clock clock, Clock clock2, int i2) {
        this.f23836a = BatchedLogRequest.b();
        this.f23838c = context;
        this.f23837b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f23839d = o(CCTDestination.f23828c);
        this.f23840e = clock2;
        this.f23841f = clock;
        this.f23842g = i2;
    }

    public static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    public static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.f();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return NetworkConnectionInfo.MobileSubtype.COMBINED.f();
        }
        if (NetworkConnectionInfo.MobileSubtype.d(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.f() : networkInfo.getType();
    }

    public static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            Logging.c("CctTransportBackend", "Unable to find version code for package", e2);
            return -1;
        }
    }

    public static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long l() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    public static /* synthetic */ HttpRequest m(HttpRequest httpRequest, HttpResponse httpResponse) {
        URL url = httpResponse.f23847b;
        if (url == null) {
            return null;
        }
        Logging.a("CctTransportBackend", "Following redirect to: %s", url);
        return httpRequest.a(httpResponse.f23847b);
    }

    public static InputStream n(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL o(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: " + str, e2);
        }
    }

    public BackendResponse a(BackendRequest backendRequest) {
        BatchedLogRequest j2 = j(backendRequest);
        URL url = this.f23839d;
        String str = null;
        if (backendRequest.c() != null) {
            try {
                CCTDestination c2 = CCTDestination.c(backendRequest.c());
                if (c2.d() != null) {
                    str = c2.d();
                }
                if (c2.e() != null) {
                    url = o(c2.e());
                }
            } catch (IllegalArgumentException unused) {
                return BackendResponse.a();
            }
        }
        try {
            HttpResponse httpResponse = (HttpResponse) Retries.a(5, new HttpRequest(url, j2, str), new a(this), new b());
            int i2 = httpResponse.f23846a;
            if (i2 == 200) {
                return BackendResponse.e(httpResponse.f23848c);
            }
            if (i2 < 500) {
                if (i2 != 404) {
                    return i2 == 400 ? BackendResponse.d() : BackendResponse.a();
                }
            }
            return BackendResponse.f();
        } catch (IOException e2) {
            Logging.c("CctTransportBackend", "Could not make request to the backend", e2);
            return BackendResponse.f();
        }
    }

    public EventInternal b(EventInternal eventInternal) {
        NetworkInfo activeNetworkInfo = this.f23837b.getActiveNetworkInfo();
        return eventInternal.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f23838c)).c("application_build", Integer.toString(i(this.f23838c))).d();
    }

    public final HttpResponse e(HttpRequest httpRequest) {
        OutputStream outputStream;
        GZIPOutputStream gZIPOutputStream;
        InputStream n2;
        Logging.e("CctTransportBackend", "Making request to: %s", httpRequest.f23843a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpRequest.f23843a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f23842g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(Params.Headers.USER_AGENT, String.format("datatransport/%s android/", new Object[]{"3.3.0"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = httpRequest.f23845c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            outputStream = httpURLConnection.getOutputStream();
            gZIPOutputStream = new GZIPOutputStream(outputStream);
            this.f23836a.a(httpRequest.f23844b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
            gZIPOutputStream.close();
            if (outputStream != null) {
                outputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            Logging.e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
            Logging.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
            Logging.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
            if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                return new HttpResponse(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
            }
            if (responseCode != 200) {
                return new HttpResponse(responseCode, (URL) null, 0);
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                n2 = n(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                HttpResponse httpResponse = new HttpResponse(responseCode, (URL) null, LogResponse.b(new BufferedReader(new InputStreamReader(n2))).c());
                if (n2 != null) {
                    n2.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return httpResponse;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
            throw th;
            throw th;
            throw th;
        } catch (ConnectException | UnknownHostException e2) {
            Logging.c("CctTransportBackend", "Couldn't open connection, returning with 500", e2);
            return new HttpResponse(500, (URL) null, 0);
        } catch (EncodingException | IOException e3) {
            Logging.c("CctTransportBackend", "Couldn't encode request, returning with 400", e3);
            return new HttpResponse(400, (URL) null, 0);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public final BatchedLogRequest j(BackendRequest backendRequest) {
        LogEvent.Builder builder;
        HashMap hashMap = new HashMap();
        for (EventInternal eventInternal : backendRequest.b()) {
            String n2 = eventInternal.n();
            if (!hashMap.containsKey(n2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eventInternal);
                hashMap.put(n2, arrayList);
            } else {
                ((List) hashMap.get(n2)).add(eventInternal);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            EventInternal eventInternal2 = (EventInternal) ((List) entry.getValue()).get(0);
            LogRequest.Builder b2 = LogRequest.a().f(QosTier.DEFAULT).g(this.f23841f.a()).h(this.f23840e.a()).b(ClientInfo.a().c(ClientInfo.ClientType.ANDROID_FIREBASE).b(AndroidClientInfo.a().m(Integer.valueOf(eventInternal2.i("sdk-version"))).j(eventInternal2.b("model")).f(eventInternal2.b("hardware")).d(eventInternal2.b("device")).l(eventInternal2.b("product")).k(eventInternal2.b("os-uild")).h(eventInternal2.b("manufacturer")).e(eventInternal2.b("fingerprint")).c(eventInternal2.b("country")).g(eventInternal2.b("locale")).i(eventInternal2.b("mcc_mnc")).b(eventInternal2.b("application_build")).a()).a());
            try {
                b2.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (EventInternal eventInternal3 : (List) entry.getValue()) {
                EncodedPayload e2 = eventInternal3.e();
                Encoding b3 = e2.b();
                if (b3.equals(Encoding.b("proto"))) {
                    builder = LogEvent.l(e2.a());
                } else if (b3.equals(Encoding.b("json"))) {
                    builder = LogEvent.k(new String(e2.a(), Charset.forName("UTF-8")));
                } else {
                    Logging.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b3);
                }
                builder.d(eventInternal3.f()).e(eventInternal3.o()).j(eventInternal3.j("tz-offset")).g(NetworkConnectionInfo.a().c(NetworkConnectionInfo.NetworkType.d(eventInternal3.i("net-type"))).b(NetworkConnectionInfo.MobileSubtype.d(eventInternal3.i("mobile-subtype"))).a());
                if (eventInternal3.d() != null) {
                    builder.c(eventInternal3.d());
                }
                if (eventInternal3.l() != null) {
                    builder.b(ComplianceData.a().b(ExternalPrivacyContext.a().b(ExternalPRequestContext.a().b(eventInternal3.l()).a()).a()).c(ComplianceData.ProductIdOrigin.EVENT_OVERRIDE).a());
                }
                if (!(eventInternal3.g() == null && eventInternal3.h() == null)) {
                    ExperimentIds.Builder a2 = ExperimentIds.a();
                    if (eventInternal3.g() != null) {
                        a2.b(eventInternal3.g());
                    }
                    if (eventInternal3.h() != null) {
                        a2.c(eventInternal3.h());
                    }
                    builder.f(a2.a());
                }
                arrayList3.add(builder.a());
            }
            b2.c(arrayList3);
            arrayList2.add(b2.a());
        }
        return BatchedLogRequest.a(arrayList2);
    }

    public CctTransportBackend(Context context, Clock clock, Clock clock2) {
        this(context, clock, clock2, 130000);
    }
}
