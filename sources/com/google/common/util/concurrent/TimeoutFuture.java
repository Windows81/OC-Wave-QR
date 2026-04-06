package com.google.common.util.concurrent;

import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
final class TimeoutFuture<V> extends FluentFuture.TrustedFuture<V> {
    public ListenableFuture G;
    public ScheduledFuture H;

    public static final class Fire<V> implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public TimeoutFuture f29606z;

        public void run() {
            ListenableFuture H;
            String str;
            TimeoutFuture timeoutFuture = this.f29606z;
            if (timeoutFuture != null && (H = timeoutFuture.G) != null) {
                this.f29606z = null;
                if (H.isDone()) {
                    timeoutFuture.E(H);
                    return;
                }
                try {
                    ScheduledFuture I = timeoutFuture.H;
                    ScheduledFuture unused = timeoutFuture.H = null;
                    str = "Timed out";
                    if (I != null) {
                        long abs = Math.abs(I.getDelay(TimeUnit.MILLISECONDS));
                        if (abs > 10) {
                            StringBuilder sb = new StringBuilder(str.length() + 66);
                            sb.append(str);
                            sb.append(" (timeout delayed by ");
                            sb.append(abs);
                            sb.append(" ms after scheduled time)");
                            str = sb.toString();
                        }
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(H);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
                    sb2.append(valueOf);
                    sb2.append(": ");
                    sb2.append(valueOf2);
                    timeoutFuture.D(new TimeoutFutureException(sb2.toString()));
                    H.cancel(true);
                } catch (Throwable th) {
                    H.cancel(true);
                    throw th;
                }
            }
        }
    }

    public static final class TimeoutFutureException extends TimeoutException {
        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }

        public TimeoutFutureException(String str) {
            super(str);
        }
    }

    public void m() {
        x(this.G);
        ScheduledFuture scheduledFuture = this.H;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.G = null;
        this.H = null;
    }

    public String y() {
        ListenableFuture listenableFuture = this.G;
        ScheduledFuture scheduledFuture = this.H;
        if (listenableFuture == null) {
            return null;
        }
        String valueOf = String.valueOf(listenableFuture);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("inputFuture=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        String valueOf2 = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 43);
        sb3.append(valueOf2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }
}
