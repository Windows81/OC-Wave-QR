package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzcw {

    /* renamed from: b  reason: collision with root package name */
    public static final Method f25409b = e();

    /* renamed from: c  reason: collision with root package name */
    public static final Method f25410c = d();

    /* renamed from: a  reason: collision with root package name */
    public final JobScheduler f25411a;

    public zzcw(JobScheduler jobScheduler) {
        this.f25411a = jobScheduler;
    }

    public static int a() {
        Method method = f25410c;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, (Object[]) null);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e2);
                }
            }
        }
        return 0;
    }

    public static int c(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) Preconditions.q((JobScheduler) context.getSystemService("jobscheduler"));
        return (f25409b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new zzcw(jobScheduler).b(jobInfo, str, a(), str2);
    }

    public static Method d() {
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", (Class[]) null);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
            return null;
        }
    }

    public static Method e() {
        Class<String> cls = String.class;
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, cls, Integer.TYPE, cls});
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }

    public final int b(JobInfo jobInfo, String str, int i2, String str2) {
        Method method = f25409b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.f25411a, new Object[]{jobInfo, str, Integer.valueOf(i2), str2});
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.e(str2, "error calling scheduleAsPackage", e2);
            }
        }
        return this.f25411a.schedule(jobInfo);
    }
}
