package com.google.android.gms.wallet.contract;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;

public final class TaskResultContracts {

    public static abstract class GetApiTaskResult<T> extends ResolveApiTaskResult<T, ApiTaskResult<T>> {
        /* renamed from: g */
        public ApiTaskResult f(Task task) {
            if (task.n()) {
                return new ApiTaskResult(task.k(), Status.E);
            }
            if (task.l()) {
                return new ApiTaskResult(new Status(16, "The task has been canceled."));
            }
            Status status = this.f27344a;
            return status != null ? new ApiTaskResult(status) : new ApiTaskResult(Status.G);
        }

        /* renamed from: h */
        public ApiTaskResult c(int i2, Intent intent) {
            if (i2 != -1) {
                return i2 != 0 ? new ApiTaskResult((Object) null, Status.G) : new ApiTaskResult((Object) null, Status.I);
            }
            Object i3 = intent != null ? i(intent) : null;
            return i3 != null ? new ApiTaskResult(i3, Status.E) : new ApiTaskResult((Object) null, Status.G);
        }

        public abstract Object i(Intent intent);
    }

    public static final class GetPaymentData extends UnpackApiTaskResult<PaymentData> {
        /* renamed from: g */
        public PaymentData c(int i2, Intent intent) {
            if (intent != null) {
                return PaymentData.H(intent);
            }
            return null;
        }
    }

    public static final class GetPaymentDataResult extends GetApiTaskResult<PaymentData> {
        public final /* bridge */ /* synthetic */ Object c(int i2, Intent intent) {
            return c(i2, intent);
        }

        public ApiTaskResult h(int i2, Intent intent) {
            if (i2 != 1) {
                return super.c(i2, intent);
            }
            Status a2 = AutoResolveHelper.a(intent);
            if (a2 == null) {
                a2 = Status.G;
            }
            return new ApiTaskResult(a2);
        }

        /* renamed from: j */
        public PaymentData i(Intent intent) {
            return PaymentData.H(intent);
        }
    }

    public static abstract class ResolveApiTaskResult<I, O> extends ActivityResultContract<Task<I>, O> {

        /* renamed from: a  reason: collision with root package name */
        public Status f27344a;

        /* renamed from: b  reason: collision with root package name */
        public PendingIntent f27345b;

        /* renamed from: d */
        public Intent a(Context context, Task task) {
            return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", new IntentSenderRequest.Builder(this.f27345b).a());
        }

        /* renamed from: e */
        public ActivityResultContract.SynchronousResult b(Context context, Task task) {
            if (task.m()) {
                Exception j2 = task.j();
                if (j2 instanceof ApiException) {
                    this.f27344a = ((ApiException) j2).a();
                    if (j2 instanceof ResolvableApiException) {
                        this.f27345b = ((ResolvableApiException) j2).c();
                    }
                }
                if (this.f27345b == null) {
                    return new ActivityResultContract.SynchronousResult(f(task));
                }
                return null;
            }
            throw new IllegalArgumentException("The task has to be executed before using this API to resolve its result.");
        }

        public abstract Object f(Task task);
    }

    public static abstract class UnpackApiTaskResult<T> extends ResolveApiTaskResult<T, T> {
        public Object f(Task task) {
            if (task.n()) {
                return task.k();
            }
            return null;
        }
    }
}
