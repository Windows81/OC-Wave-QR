package kotlinx.coroutines.debug.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

@Metadata
public final class DebugCoroutineInfo {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f41535a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineStackFrame f41536b;

    /* renamed from: c  reason: collision with root package name */
    public final long f41537c;

    /* renamed from: d  reason: collision with root package name */
    public final List f41538d;

    /* renamed from: e  reason: collision with root package name */
    public final String f41539e;

    /* renamed from: f  reason: collision with root package name */
    public final Thread f41540f;

    /* renamed from: g  reason: collision with root package name */
    public final CoroutineStackFrame f41541g;

    /* renamed from: h  reason: collision with root package name */
    public final List f41542h;

    public DebugCoroutineInfo(DebugCoroutineInfoImpl debugCoroutineInfoImpl, CoroutineContext coroutineContext) {
        this.f41535a = coroutineContext;
        this.f41536b = debugCoroutineInfoImpl.d();
        this.f41537c = debugCoroutineInfoImpl.f41544b;
        this.f41538d = debugCoroutineInfoImpl.e();
        this.f41539e = debugCoroutineInfoImpl.g();
        this.f41540f = debugCoroutineInfoImpl.lastObservedThread;
        this.f41541g = debugCoroutineInfoImpl.f();
        this.f41542h = debugCoroutineInfoImpl.h();
    }
}
