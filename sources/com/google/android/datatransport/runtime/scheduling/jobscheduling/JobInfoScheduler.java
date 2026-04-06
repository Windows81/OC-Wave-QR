package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

public class JobInfoScheduler implements WorkScheduler {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24174a;

    /* renamed from: b  reason: collision with root package name */
    public final EventStore f24175b;

    /* renamed from: c  reason: collision with root package name */
    public final SchedulerConfig f24176c;

    public JobInfoScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig) {
        this.f24174a = context;
        this.f24175b = eventStore;
        this.f24176c = schedulerConfig;
    }

    public void a(TransportContext transportContext, int i2) {
        b(transportContext, i2, false);
    }

    public void b(TransportContext transportContext, int i2, boolean z2) {
        ComponentName componentName = new ComponentName(this.f24174a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f24174a.getSystemService("jobscheduler");
        int c2 = c(transportContext);
        if (z2 || !d(jobScheduler, c2, i2)) {
            long n1 = this.f24175b.n1(transportContext);
            JobInfo.Builder c3 = this.f24176c.c(new JobInfo.Builder(c2, componentName), transportContext.d(), n1, i2);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i2);
            persistableBundle.putString("backendName", transportContext.b());
            persistableBundle.putInt("priority", PriorityMapping.a(transportContext.d()));
            if (transportContext.c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(transportContext.c(), 0));
            }
            c3.setExtras(persistableBundle);
            Logging.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Integer.valueOf(c2), Long.valueOf(this.f24176c.g(transportContext.d(), n1, i2)), Long.valueOf(n1), Integer.valueOf(i2));
            jobScheduler.schedule(c3.build());
            return;
        }
        Logging.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
    }

    public int c(TransportContext transportContext) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f24174a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(transportContext.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(PriorityMapping.a(transportContext.d())).array());
        if (transportContext.c() != null) {
            adler32.update(transportContext.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i2, int i3) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i4 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i2) {
                return i4 >= i3;
            }
        }
        return false;
    }
}
