package com.google.firebase.crashlytics.internal.stacktrace;

import java.util.Stack;

public class TrimmedThrowableData {

    /* renamed from: a  reason: collision with root package name */
    public final String f30694a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30695b;

    /* renamed from: c  reason: collision with root package name */
    public final StackTraceElement[] f30696c;

    /* renamed from: d  reason: collision with root package name */
    public final TrimmedThrowableData f30697d;

    public TrimmedThrowableData(String str, String str2, StackTraceElement[] stackTraceElementArr, TrimmedThrowableData trimmedThrowableData) {
        this.f30694a = str;
        this.f30695b = str2;
        this.f30696c = stackTraceElementArr;
        this.f30697d = trimmedThrowableData;
    }

    public static TrimmedThrowableData a(Throwable th, StackTraceTrimmingStrategy stackTraceTrimmingStrategy) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        TrimmedThrowableData trimmedThrowableData = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            trimmedThrowableData = new TrimmedThrowableData(th2.getLocalizedMessage(), th2.getClass().getName(), stackTraceTrimmingStrategy.a(th2.getStackTrace()), trimmedThrowableData);
        }
        return trimmedThrowableData;
    }
}
