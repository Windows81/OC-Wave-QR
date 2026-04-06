package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ProvidedValue<T> {

    /* renamed from: i  reason: collision with root package name */
    public static final int f14769i = 8;

    /* renamed from: a  reason: collision with root package name */
    public final CompositionLocal f14770a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14771b;

    /* renamed from: c  reason: collision with root package name */
    public final SnapshotMutationPolicy f14772c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f14773d;

    /* renamed from: e  reason: collision with root package name */
    public final Function1 f14774e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14775f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f14776g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14777h = true;

    public ProvidedValue(CompositionLocal compositionLocal, Object obj, boolean z2, SnapshotMutationPolicy snapshotMutationPolicy, MutableState mutableState, Function1 function1, boolean z3) {
        this.f14770a = compositionLocal;
        this.f14771b = z2;
        this.f14772c = snapshotMutationPolicy;
        this.f14773d = mutableState;
        this.f14774e = function1;
        this.f14775f = z3;
        this.f14776g = obj;
    }

    public final boolean a() {
        return this.f14777h;
    }

    public final CompositionLocal b() {
        return this.f14770a;
    }

    public final Function1 c() {
        return this.f14774e;
    }

    public final Object d() {
        if (this.f14771b) {
            return null;
        }
        MutableState mutableState = this.f14773d;
        if (mutableState != null) {
            return mutableState.getValue();
        }
        Object obj = this.f14776g;
        if (obj != null) {
            return obj;
        }
        ComposerKt.w("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }

    public final SnapshotMutationPolicy e() {
        return this.f14772c;
    }

    public final MutableState f() {
        return this.f14773d;
    }

    public final Object g() {
        return this.f14776g;
    }

    public final ProvidedValue h() {
        this.f14777h = false;
        return this;
    }

    public final boolean i() {
        return this.f14775f;
    }

    public final boolean j() {
        return (this.f14771b || g() != null) && !this.f14775f;
    }
}
