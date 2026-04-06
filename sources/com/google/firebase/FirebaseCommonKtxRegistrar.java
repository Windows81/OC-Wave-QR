package com.google.firebase;

import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        Class<Background> cls = Background.class;
        Class<CoroutineDispatcher> cls2 = CoroutineDispatcher.class;
        Class<Executor> cls3 = Executor.class;
        Component c2 = Component.c(Qualified.a(cls, cls2)).b(Dependency.i(Qualified.a(cls, cls3))).e(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1.f29648a).c();
        Intrinsics.h(c2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<Lightweight> cls4 = Lightweight.class;
        Component c3 = Component.c(Qualified.a(cls4, cls2)).b(Dependency.i(Qualified.a(cls4, cls3))).e(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2.f29649a).c();
        Intrinsics.h(c3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<Blocking> cls5 = Blocking.class;
        Component c4 = Component.c(Qualified.a(cls5, cls2)).b(Dependency.i(Qualified.a(cls5, cls3))).e(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3.f29650a).c();
        Intrinsics.h(c4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<UiThread> cls6 = UiThread.class;
        Component c5 = Component.c(Qualified.a(cls6, cls2)).b(Dependency.i(Qualified.a(cls6, cls3))).e(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4.f29651a).c();
        Intrinsics.h(c5, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return CollectionsKt.p(c2, c3, c4, c5);
    }
}
