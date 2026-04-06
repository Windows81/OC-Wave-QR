package A;

import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;

/* renamed from: A.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0396b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f34149a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f34150b;

    public /* synthetic */ C0396b(String str, boolean z2) {
        this.f34149a = str;
        this.f34150b = z2;
    }

    public final Thread newThread(Runnable runnable) {
        return Util.O(this.f34149a, this.f34150b, runnable);
    }
}
