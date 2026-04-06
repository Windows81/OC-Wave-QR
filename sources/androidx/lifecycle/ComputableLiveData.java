package androidx.lifecycle;

import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata
public abstract class ComputableLiveData<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f21874a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f21875b;

    public final Executor a() {
        return this.f21874a;
    }
}
