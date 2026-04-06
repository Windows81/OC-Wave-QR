package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zau;

final class zacz extends zau {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zada f24722b;

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            PendingResult pendingResult = (PendingResult) message.obj;
            synchronized (this.f24722b.f24728e) {
                try {
                    zada zada = (zada) Preconditions.m(this.f24722b.f24725b);
                    if (pendingResult == null) {
                        zada.k(new Status(13, "Transform returned null"));
                    } else if (pendingResult instanceof zacp) {
                        zada.k(((zacp) pendingResult).f());
                    } else {
                        zada.j(pendingResult);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i2 != 1) {
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i2);
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
            throw runtimeException;
        }
    }
}
