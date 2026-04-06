package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

@Metadata
public final class AndroidLog {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidLog f43207a = new AndroidLog();

    /* renamed from: b  reason: collision with root package name */
    public static final CopyOnWriteArraySet f43208b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    public static final Map f43209c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<OkHttpClient> cls = OkHttpClient.class;
        Package packageR = cls.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = cls.getName();
        Intrinsics.h(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = Http2.class.getName();
        Intrinsics.h(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = TaskRunner.class.getName();
        Intrinsics.h(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f43209c = MapsKt.s(linkedHashMap);
    }

    public final void a(String str, int i2, String str2, Throwable th) {
        int min;
        Intrinsics.i(str, "loggerName");
        Intrinsics.i(str2, "message");
        String d2 = d(str);
        if (Log.isLoggable(d2, i2)) {
            if (th != null) {
                str2 = str2 + 10 + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i3 = 0;
            while (i3 < length) {
                int i0 = StringsKt.i0(str2, 10, i3, false, 4, (Object) null);
                if (i0 == -1) {
                    i0 = length;
                }
                while (true) {
                    min = Math.min(i0, i3 + 4000);
                    String substring = str2.substring(i3, min);
                    Intrinsics.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i2, d2, substring);
                    if (min >= i0) {
                        break;
                    }
                    i3 = min;
                }
                i3 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : f43209c.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f43208b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(AndroidLogHandler.f43210a);
        }
    }

    public final String d(String str) {
        String str2 = (String) f43209c.get(str);
        return str2 == null ? StringsKt.n1(str, 23) : str2;
    }
}
