package com.google.firebase.ktx;

import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

@Metadata
public final class FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2<T> implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2 f30880a = new FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2();

    /* renamed from: b */
    public final CoroutineDispatcher a(ComponentContainer componentContainer) {
        Object f2 = componentContainer.f(Qualified.a(Lightweight.class, Executor.class));
        Intrinsics.h(f2, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return ExecutorsKt.a((Executor) f2);
    }
}
