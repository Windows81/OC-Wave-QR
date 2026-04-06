package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.net.Uri;

@Deprecated
public class BrowserActionItem {

    /* renamed from: a  reason: collision with root package name */
    public final String f1559a;

    /* renamed from: b  reason: collision with root package name */
    public final PendingIntent f1560b;

    /* renamed from: c  reason: collision with root package name */
    public int f1561c;

    /* renamed from: d  reason: collision with root package name */
    public Uri f1562d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f1563e;

    public PendingIntent a() {
        PendingIntent pendingIntent = this.f1560b;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    public int b() {
        return this.f1561c;
    }

    public Uri c() {
        return this.f1562d;
    }

    public Runnable d() {
        return this.f1563e;
    }

    public String e() {
        return this.f1559a;
    }
}
