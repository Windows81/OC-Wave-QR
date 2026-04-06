package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;

public class AlarmManagerScheduler implements WorkScheduler {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24161a;

    /* renamed from: b  reason: collision with root package name */
    public final EventStore f24162b;

    /* renamed from: c  reason: collision with root package name */
    public AlarmManager f24163c;

    /* renamed from: d  reason: collision with root package name */
    public final SchedulerConfig f24164d;

    /* renamed from: e  reason: collision with root package name */
    public final Clock f24165e;

    public void a(TransportContext transportContext, int i2) {
        b(transportContext, i2, false);
    }

    public void b(TransportContext transportContext, int i2, boolean z2) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", transportContext.b());
        builder.appendQueryParameter("priority", String.valueOf(PriorityMapping.a(transportContext.d())));
        if (transportContext.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(transportContext.c(), 0));
        }
        Intent intent = new Intent(this.f24161a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (z2 || !c(intent)) {
            long n1 = this.f24162b.n1(transportContext);
            long g2 = this.f24164d.g(transportContext.d(), n1, i2);
            Logging.b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Long.valueOf(g2), Long.valueOf(n1), Integer.valueOf(i2));
            this.f24163c.set(3, this.f24165e.a() + g2, PendingIntent.getBroadcast(this.f24161a, 0, intent, 67108864));
            return;
        }
        Logging.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
    }

    public boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.f24161a, 0, intent, 603979776) != null;
    }
}
