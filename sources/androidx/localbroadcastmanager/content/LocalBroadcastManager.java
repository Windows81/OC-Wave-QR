package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

public final class LocalBroadcastManager {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f22144d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f22145a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f22146b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f22147c;

    /* renamed from: androidx.localbroadcastmanager.content.LocalBroadcastManager$1  reason: invalid class name */
    class AnonymousClass1 extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocalBroadcastManager f22148a;

        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                this.f22148a.a();
            }
        }
    }

    public static final class BroadcastRecord {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f22149a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f22150b;
    }

    public static final class ReceiverRecord {

        /* renamed from: a  reason: collision with root package name */
        public final IntentFilter f22151a;

        /* renamed from: b  reason: collision with root package name */
        public final BroadcastReceiver f22152b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f22153c;

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f22152b);
            sb.append(" filter=");
            sb.append(this.f22151a);
            if (this.f22153c) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r3 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r4 = r2[r3];
        r5 = r4.f22150b.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r6 >= r5) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r7 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r4.f22150b.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r7.f22153c != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r7.f22152b.onReceive(r10.f22145a, r4.f22149a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r10 = this;
        L_0x0000:
            java.util.HashMap r0 = r10.f22146b
            monitor-enter(r0)
            java.util.ArrayList r1 = r10.f22147c     // Catch:{ all -> 0x000d }
            int r1 = r1.size()     // Catch:{ all -> 0x000d }
            if (r1 > 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            return
        L_0x000d:
            r1 = move-exception
            goto L_0x0046
        L_0x000f:
            androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord[] r2 = new androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord[r1]     // Catch:{ all -> 0x000d }
            java.util.ArrayList r3 = r10.f22147c     // Catch:{ all -> 0x000d }
            r3.toArray(r2)     // Catch:{ all -> 0x000d }
            java.util.ArrayList r3 = r10.f22147c     // Catch:{ all -> 0x000d }
            r3.clear()     // Catch:{ all -> 0x000d }
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            r0 = 0
            r3 = r0
        L_0x001e:
            if (r3 >= r1) goto L_0x0000
            r4 = r2[r3]
            java.util.ArrayList r5 = r4.f22150b
            int r5 = r5.size()
            r6 = r0
        L_0x0029:
            if (r6 >= r5) goto L_0x0043
            java.util.ArrayList r7 = r4.f22150b
            java.lang.Object r7 = r7.get(r6)
            androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord r7 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r7
            boolean r8 = r7.f22153c
            if (r8 != 0) goto L_0x0040
            android.content.BroadcastReceiver r7 = r7.f22152b
            android.content.Context r8 = r10.f22145a
            android.content.Intent r9 = r4.f22149a
            r7.onReceive(r8, r9)
        L_0x0040:
            int r6 = r6 + 1
            goto L_0x0029
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x001e
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.localbroadcastmanager.content.LocalBroadcastManager.a():void");
    }
}
