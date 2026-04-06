package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

public class AutoResolveHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final long f27251a = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: b  reason: collision with root package name */
    public static final long f27252b = SystemClock.elapsedRealtime();

    public static Status a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void b(Intent intent, Status status) {
        if (status == null) {
            intent.removeExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        } else {
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", status);
        }
    }

    public static void e(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.o0()) {
            taskCompletionSource.c(obj);
        } else {
            taskCompletionSource.b(ApiExceptionUtil.a(status));
        }
    }

    public static void f(Activity activity, int i2, int i3, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i2, intent, 1073741824);
        if (createPendingResult != null) {
            try {
                createPendingResult.send(i3);
            } catch (PendingIntent.CanceledException e2) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Exception sending pending result", e2);
                }
            }
        } else if (Log.isLoggable("AutoResolveHelper", 5)) {
            Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
        }
    }

    public static void g(Activity activity, int i2, Task task) {
        int i3;
        if (!activity.isFinishing()) {
            Exception j2 = task.j();
            if (j2 instanceof ResolvableApiException) {
                try {
                    ((ResolvableApiException) j2).d(activity, i2);
                } catch (IntentSender.SendIntentException e2) {
                    if (Log.isLoggable("AutoResolveHelper", 6)) {
                        Log.e("AutoResolveHelper", "Error starting pending intent!", e2);
                    }
                }
            } else {
                Intent intent = new Intent();
                if (task.n()) {
                    ((AutoResolvableResult) task.k()).C(intent);
                    i3 = -1;
                } else {
                    if (j2 instanceof ApiException) {
                        ApiException apiException = (ApiException) j2;
                        b(intent, new Status(apiException.b(), apiException.getMessage(), (PendingIntent) null));
                    } else {
                        if (Log.isLoggable("AutoResolveHelper", 6)) {
                            Log.e("AutoResolveHelper", "Unexpected non API exception!", j2);
                        }
                        b(intent, new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
                    }
                    i3 = 1;
                }
                f(activity, i2, i3, intent);
            }
        } else if (Log.isLoggable("AutoResolveHelper", 3)) {
            Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
        }
    }
}
