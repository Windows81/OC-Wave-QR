package androidx.lifecycle.internal;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateWriter;
import g.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata
public final class SavedStateHandleImpl {

    /* renamed from: a  reason: collision with root package name */
    public final Map f22047a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f22048b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f22049c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f22050d;

    /* renamed from: e  reason: collision with root package name */
    public final SavedStateRegistry.SavedStateProvider f22051e;

    public SavedStateHandleImpl(Map map) {
        Intrinsics.i(map, "initialState");
        this.f22047a = MapsKt.u(map);
        this.f22048b = new LinkedHashMap();
        this.f22049c = new LinkedHashMap();
        this.f22050d = new LinkedHashMap();
        this.f22051e = new a(this);
    }

    public static final Bundle i(SavedStateHandleImpl savedStateHandleImpl) {
        Pair[] pairArr;
        for (Map.Entry entry : MapsKt.s(savedStateHandleImpl.f22050d).entrySet()) {
            savedStateHandleImpl.j((String) entry.getKey(), ((MutableStateFlow) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : MapsKt.s(savedStateHandleImpl.f22048b).entrySet()) {
            savedStateHandleImpl.j((String) entry2.getKey(), ((SavedStateRegistry.SavedStateProvider) entry2.getValue()).a());
        }
        Map map = savedStateHandleImpl.f22047a;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(TuplesKt.a((String) entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle a2 = BundleKt.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.a(a2);
        return a2;
    }

    public final boolean b(String str) {
        Intrinsics.i(str, "key");
        return this.f22047a.containsKey(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = r0.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            java.util.Map r0 = r1.f22050d     // Catch:{ ClassCastException -> 0x001c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ ClassCastException -> 0x001c }
            kotlinx.coroutines.flow.MutableStateFlow r0 = (kotlinx.coroutines.flow.MutableStateFlow) r0     // Catch:{ ClassCastException -> 0x001c }
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.getValue()     // Catch:{ ClassCastException -> 0x001c }
            if (r0 != 0) goto L_0x0020
        L_0x0015:
            java.util.Map r0 = r1.f22047a     // Catch:{ ClassCastException -> 0x001c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ ClassCastException -> 0x001c }
            goto L_0x0020
        L_0x001c:
            r1.h(r2)
            r0 = 0
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.internal.SavedStateHandleImpl.c(java.lang.String):java.lang.Object");
    }

    public final Map d() {
        return this.f22050d;
    }

    public final MutableStateFlow e(String str, Object obj) {
        Intrinsics.i(str, "key");
        Map map = this.f22050d;
        Object obj2 = map.get(str);
        if (obj2 == null) {
            if (!this.f22047a.containsKey(str)) {
                this.f22047a.put(str, obj);
            }
            obj2 = StateFlowKt.a(this.f22047a.get(str));
            map.put(str, obj2);
        }
        MutableStateFlow mutableStateFlow = (MutableStateFlow) obj2;
        Intrinsics.g(mutableStateFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getMutableStateFlow>");
        return mutableStateFlow;
    }

    public final SavedStateRegistry.SavedStateProvider f() {
        return this.f22051e;
    }

    public final StateFlow g(String str, Object obj) {
        Intrinsics.i(str, "key");
        Map map = this.f22049c;
        Object obj2 = map.get(str);
        if (obj2 == null) {
            if (!this.f22047a.containsKey(str)) {
                this.f22047a.put(str, obj);
            }
            obj2 = StateFlowKt.a(this.f22047a.get(str));
            map.put(str, obj2);
        }
        StateFlow e2 = FlowKt.e((MutableStateFlow) obj2);
        Intrinsics.g(e2, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getStateFlow>");
        return e2;
    }

    public final Object h(String str) {
        Intrinsics.i(str, "key");
        Object remove = this.f22047a.remove(str);
        this.f22049c.remove(str);
        return remove;
    }

    public final void j(String str, Object obj) {
        Intrinsics.i(str, "key");
        this.f22047a.put(str, obj);
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f22049c.get(str);
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(obj);
        }
        MutableStateFlow mutableStateFlow2 = (MutableStateFlow) this.f22050d.get(str);
        if (mutableStateFlow2 != null) {
            mutableStateFlow2.setValue(obj);
        }
    }

    public final void k(String str, SavedStateRegistry.SavedStateProvider savedStateProvider) {
        Intrinsics.i(str, "key");
        Intrinsics.i(savedStateProvider, "provider");
        this.f22048b.put(str, savedStateProvider);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SavedStateHandleImpl(Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? MapsKt.h() : map);
    }
}
