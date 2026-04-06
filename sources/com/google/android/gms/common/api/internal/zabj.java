package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zat;
import java.util.concurrent.ExecutorService;

public final class zabj {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f24650a = zat.a().a(2, new NumberedThreadFactory("GAC_Executor"), 2);

    public static ExecutorService a() {
        return f24650a;
    }
}
