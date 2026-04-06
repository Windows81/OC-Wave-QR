package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final CrashListener f30060a;

    /* renamed from: b  reason: collision with root package name */
    public final SettingsProvider f30061b;

    /* renamed from: c  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f30062c;

    /* renamed from: d  reason: collision with root package name */
    public final CrashlyticsNativeComponent f30063d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f30064e = new AtomicBoolean(false);

    public interface CrashListener {
        void a(SettingsProvider settingsProvider, Thread thread, Throwable th);
    }

    public CrashlyticsUncaughtExceptionHandler(CrashListener crashListener, SettingsProvider settingsProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.f30060a = crashListener;
        this.f30061b = settingsProvider;
        this.f30062c = uncaughtExceptionHandler;
        this.f30063d = crashlyticsNativeComponent;
    }

    public boolean a() {
        return this.f30064e.get();
    }

    public final boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            Logger.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            Logger.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (!this.f30063d.b()) {
            return true;
        } else {
            Logger.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f30064e.set(true);
        try {
            if (b(thread, th)) {
                this.f30060a.a(this.f30061b, thread, th);
            } else {
                Logger.f().b("Uncaught exception will not be recorded by Crashlytics.");
            }
        } catch (Exception e2) {
            Logger.f().e("An error occurred in the uncaught exception handler", e2);
        } catch (Throwable th2) {
            Logger.f().b("Completed exception processing. Invoking default exception handler.");
            this.f30062c.uncaughtException(thread, th);
            this.f30064e.set(false);
            throw th2;
        }
        Logger.f().b("Completed exception processing. Invoking default exception handler.");
        this.f30062c.uncaughtException(thread, th);
        this.f30064e.set(false);
    }
}
