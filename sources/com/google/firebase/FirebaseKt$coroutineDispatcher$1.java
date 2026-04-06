package com.google.firebase;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

@Metadata
public final class FirebaseKt$coroutineDispatcher$1<T> implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final FirebaseKt$coroutineDispatcher$1 f29652a = new FirebaseKt$coroutineDispatcher$1();

    /* renamed from: b */
    public final CoroutineDispatcher a(ComponentContainer componentContainer) {
        Intrinsics.o(4, "T");
        Object f2 = componentContainer.f(Qualified.a(Annotation.class, Executor.class));
        Intrinsics.h(f2, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return ExecutorsKt.a((Executor) f2);
    }
}
