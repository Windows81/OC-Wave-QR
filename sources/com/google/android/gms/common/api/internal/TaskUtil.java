package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

public class TaskUtil {
    public static void a(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.o0()) {
            taskCompletionSource.c(obj);
        } else {
            taskCompletionSource.b(ApiExceptionUtil.a(status));
        }
    }

    public static boolean b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        return status.o0() ? taskCompletionSource.e(obj) : taskCompletionSource.d(ApiExceptionUtil.a(status));
    }
}
