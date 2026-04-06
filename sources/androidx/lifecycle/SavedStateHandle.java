package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.lifecycle.internal.SavedStateHandleImpl_androidKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata
public final class SavedStateHandle {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f21960c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Map f21961a;

    /* renamed from: b  reason: collision with root package name */
    public SavedStateHandleImpl f21962b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SavedStateHandle a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new SavedStateHandle();
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            Intrinsics.f(classLoader);
            bundle.setClassLoader(classLoader);
            return new SavedStateHandle(SavedStateReader.N(SavedStateReader.a(bundle)));
        }

        public final boolean b(Object obj) {
            return SavedStateHandleImpl_androidKt.a(obj);
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {

        /* renamed from: l  reason: collision with root package name */
        public String f21963l;

        /* renamed from: m  reason: collision with root package name */
        public SavedStateHandle f21964m;

        public void o(Object obj) {
            SavedStateHandleImpl a2;
            SavedStateHandle savedStateHandle = this.f21964m;
            if (!(savedStateHandle == null || (a2 = savedStateHandle.f21962b) == null)) {
                a2.j(this.f21963l, obj);
            }
            super.o(obj);
        }
    }

    public SavedStateHandle(Map map) {
        Intrinsics.i(map, "initialState");
        this.f21961a = new LinkedHashMap();
        this.f21962b = new SavedStateHandleImpl(map);
    }

    public final boolean b(String str) {
        Intrinsics.i(str, "key");
        return this.f21962b.b(str);
    }

    public final Object c(String str) {
        Intrinsics.i(str, "key");
        return this.f21962b.c(str);
    }

    public final StateFlow d(String str, Object obj) {
        Intrinsics.i(str, "key");
        return this.f21962b.d().containsKey(str) ? FlowKt.e(this.f21962b.e(str, obj)) : this.f21962b.g(str, obj);
    }

    public final SavedStateRegistry.SavedStateProvider e() {
        return this.f21962b.f();
    }

    public final void f(String str, Object obj) {
        Intrinsics.i(str, "key");
        if (f21960c.b(obj)) {
            Object obj2 = this.f21961a.get(str);
            MutableLiveData mutableLiveData = obj2 instanceof MutableLiveData ? (MutableLiveData) obj2 : null;
            if (mutableLiveData != null) {
                mutableLiveData.o(obj);
            }
            this.f21962b.j(str, obj);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        Intrinsics.f(obj);
        sb.append(obj.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void g(String str, SavedStateRegistry.SavedStateProvider savedStateProvider) {
        Intrinsics.i(str, "key");
        Intrinsics.i(savedStateProvider, "provider");
        this.f21962b.k(str, savedStateProvider);
    }

    public SavedStateHandle() {
        this.f21961a = new LinkedHashMap();
        this.f21962b = new SavedStateHandleImpl((Map) null, 1, (DefaultConstructorMarker) null);
    }
}
