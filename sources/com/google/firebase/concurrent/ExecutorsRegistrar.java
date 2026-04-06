package com.google.firebase.concurrent;

import android.os.StrictMode;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.Qualified;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    public static final Lazy f29818a = new Lazy(new n());

    /* renamed from: b  reason: collision with root package name */
    public static final Lazy f29819b = new Lazy(new o());

    /* renamed from: c  reason: collision with root package name */
    public static final Lazy f29820c = new Lazy(new p());

    /* renamed from: d  reason: collision with root package name */
    public static final Lazy f29821d = new Lazy(new q());

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        detectNetwork.detectUnbufferedIo();
        return detectNetwork.penaltyLog().build();
    }

    public static ThreadFactory j(String str, int i2) {
        return new CustomThreadFactory(str, i2, (StrictMode.ThreadPolicy) null);
    }

    public static ThreadFactory k(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        return new CustomThreadFactory(str, i2, threadPolicy);
    }

    public static /* synthetic */ ScheduledExecutorService l(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) f29818a.get();
    }

    public static /* synthetic */ ScheduledExecutorService m(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) f29820c.get();
    }

    public static /* synthetic */ ScheduledExecutorService n(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) f29819b.get();
    }

    public static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService u(ExecutorService executorService) {
        return new DelegatingScheduledExecutorService(executorService, (ScheduledExecutorService) f29821d.get());
    }

    public List getComponents() {
        Class<Background> cls = Background.class;
        Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;
        Class<ExecutorService> cls3 = ExecutorService.class;
        Class<Executor> cls4 = Executor.class;
        Class<Blocking> cls5 = Blocking.class;
        Class<Lightweight> cls6 = Lightweight.class;
        return Arrays.asList(new Component[]{Component.d(Qualified.a(cls, cls2), Qualified.a(cls, cls3), Qualified.a(cls, cls4)).e(new r()).c(), Component.d(Qualified.a(cls5, cls2), Qualified.a(cls5, cls3), Qualified.a(cls5, cls4)).e(new s()).c(), Component.d(Qualified.a(cls6, cls2), Qualified.a(cls6, cls3), Qualified.a(cls6, cls4)).e(new t()).c(), Component.c(Qualified.a(UiThread.class, cls4)).e(new u()).c()});
    }
}
