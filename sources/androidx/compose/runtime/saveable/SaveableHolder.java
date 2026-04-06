package androidx.compose.runtime.saveable;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class SaveableHolder<T> implements SaverScope, RememberObserver {

    /* renamed from: A  reason: collision with root package name */
    public SaveableStateRegistry f15196A;

    /* renamed from: B  reason: collision with root package name */
    public String f15197B;
    public Object C;
    public Object[] D;
    public SaveableStateRegistry.Entry E;
    public final Function0 F = new d(this);

    /* renamed from: z  reason: collision with root package name */
    public Saver f15198z;

    public SaveableHolder(Saver saver, SaveableStateRegistry saveableStateRegistry, String str, Object obj, Object[] objArr) {
        this.f15198z = saver;
        this.f15196A = saveableStateRegistry;
        this.f15197B = str;
        this.C = obj;
        this.D = objArr;
    }

    private final void d() {
        SaveableStateRegistry saveableStateRegistry = this.f15196A;
        if (this.E != null) {
            throw new IllegalArgumentException(("entry(" + this.E + ") is not null").toString());
        } else if (saveableStateRegistry != null) {
            RememberSaveableKt.l(saveableStateRegistry, this.F.invoke());
            this.E = saveableStateRegistry.f(this.f15197B, this.F);
        }
    }

    public static final Object i(SaveableHolder saveableHolder) {
        Saver saver = saveableHolder.f15198z;
        Object obj = saveableHolder.C;
        if (obj != null) {
            return saver.b(saveableHolder, obj);
        }
        throw new IllegalArgumentException("Value should be initialized");
    }

    public boolean b(Object obj) {
        SaveableStateRegistry saveableStateRegistry = this.f15196A;
        return saveableStateRegistry == null || saveableStateRegistry.b(obj);
    }

    public final Object c(Object[] objArr) {
        if (Arrays.equals(objArr, this.D)) {
            return this.C;
        }
        return null;
    }

    public void e() {
        SaveableStateRegistry.Entry entry = this.E;
        if (entry != null) {
            entry.a();
        }
    }

    public void f() {
        SaveableStateRegistry.Entry entry = this.E;
        if (entry != null) {
            entry.a();
        }
    }

    public final void g(Saver saver, SaveableStateRegistry saveableStateRegistry, String str, Object obj, Object[] objArr) {
        boolean z2;
        boolean z3 = true;
        if (this.f15196A != saveableStateRegistry) {
            this.f15196A = saveableStateRegistry;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!Intrinsics.d(this.f15197B, str)) {
            this.f15197B = str;
        } else {
            z3 = z2;
        }
        this.f15198z = saver;
        this.C = obj;
        this.D = objArr;
        SaveableStateRegistry.Entry entry = this.E;
        if (entry != null && z3) {
            if (entry != null) {
                entry.a();
            }
            this.E = null;
            d();
        }
    }

    public void h() {
        d();
    }
}
