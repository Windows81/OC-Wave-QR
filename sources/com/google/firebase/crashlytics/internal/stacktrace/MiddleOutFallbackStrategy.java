package com.google.firebase.crashlytics.internal.stacktrace;

public class MiddleOutFallbackStrategy implements StackTraceTrimmingStrategy {

    /* renamed from: a  reason: collision with root package name */
    public final int f30689a;

    /* renamed from: b  reason: collision with root package name */
    public final StackTraceTrimmingStrategy[] f30690b;

    /* renamed from: c  reason: collision with root package name */
    public final MiddleOutStrategy f30691c;

    public MiddleOutFallbackStrategy(int i2, StackTraceTrimmingStrategy... stackTraceTrimmingStrategyArr) {
        this.f30689a = i2;
        this.f30690b = stackTraceTrimmingStrategyArr;
        this.f30691c = new MiddleOutStrategy(i2);
    }

    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f30689a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (StackTraceTrimmingStrategy stackTraceTrimmingStrategy : this.f30690b) {
            if (stackTraceElementArr2.length <= this.f30689a) {
                break;
            }
            stackTraceElementArr2 = stackTraceTrimmingStrategy.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f30689a ? this.f30691c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
