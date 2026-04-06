package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zat;
import java.util.concurrent.ExecutorService;

public final class zaco {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f24705a = zat.a().b(new NumberedThreadFactory("GAC_Transform"), 1);

    public static ExecutorService a() {
        return f24705a;
    }
}
