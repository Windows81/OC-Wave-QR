package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.reflect.Types;
import java.lang.reflect.Type;

public final /* synthetic */ class c implements Function {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Types.JavaVersion f29276z;

    public /* synthetic */ c(Types.JavaVersion javaVersion) {
        this.f29276z = javaVersion;
    }

    public final Object apply(Object obj) {
        return this.f29276z.j((Type) obj);
    }
}
