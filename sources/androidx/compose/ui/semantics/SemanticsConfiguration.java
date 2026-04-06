package androidx.compose.ui.semantics;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public Map f18082A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f18083B;
    public boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final MutableScatterMap f18084z = ScatterMapKt.c();

    public void e(SemanticsPropertyKey semanticsPropertyKey, Object obj) {
        if (!(obj instanceof AccessibilityAction) || !h(semanticsPropertyKey)) {
            this.f18084z.x(semanticsPropertyKey, obj);
            return;
        }
        Object e2 = this.f18084z.e(semanticsPropertyKey);
        Intrinsics.g(e2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        AccessibilityAction accessibilityAction = (AccessibilityAction) e2;
        MutableScatterMap mutableScatterMap = this.f18084z;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        String b2 = accessibilityAction2.b();
        if (b2 == null) {
            b2 = accessibilityAction.b();
        }
        Function a2 = accessibilityAction2.a();
        if (a2 == null) {
            a2 = accessibilityAction.a();
        }
        mutableScatterMap.x(semanticsPropertyKey, new AccessibilityAction(b2, a2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return Intrinsics.d(this.f18084z, semanticsConfiguration.f18084z) && this.f18083B == semanticsConfiguration.f18083B && this.C == semanticsConfiguration.C;
    }

    public final void g(SemanticsConfiguration semanticsConfiguration) {
        int i2;
        SemanticsConfiguration semanticsConfiguration2 = semanticsConfiguration;
        if (semanticsConfiguration2.f18083B) {
            this.f18083B = true;
        }
        if (semanticsConfiguration2.C) {
            this.C = true;
        }
        MutableScatterMap mutableScatterMap = semanticsConfiguration2.f18084z;
        Object[] objArr = mutableScatterMap.f1960b;
        Object[] objArr2 = mutableScatterMap.f1961c;
        long[] jArr = mutableScatterMap.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Object obj = objArr[i7];
                            Object obj2 = objArr2[i7];
                            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                            if (!this.f18084z.b(semanticsPropertyKey)) {
                                this.f18084z.x(semanticsPropertyKey, obj2);
                            } else if (obj2 instanceof AccessibilityAction) {
                                Object e2 = this.f18084z.e(semanticsPropertyKey);
                                Intrinsics.g(e2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                AccessibilityAction accessibilityAction = (AccessibilityAction) e2;
                                MutableScatterMap mutableScatterMap2 = this.f18084z;
                                String b2 = accessibilityAction.b();
                                if (b2 == null) {
                                    b2 = ((AccessibilityAction) obj2).b();
                                }
                                String str = b2;
                                Function a2 = accessibilityAction.a();
                                if (a2 == null) {
                                    a2 = ((AccessibilityAction) obj2).a();
                                }
                                mutableScatterMap2.x(semanticsPropertyKey, new AccessibilityAction(str, a2));
                            }
                            i2 = 8;
                        } else {
                            i2 = i4;
                        }
                        j2 >>= i2;
                        i6++;
                        i4 = i2;
                    }
                    if (i5 != i4) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean h(SemanticsPropertyKey semanticsPropertyKey) {
        return this.f18084z.c(semanticsPropertyKey);
    }

    public int hashCode() {
        return (((this.f18084z.hashCode() * 31) + Boolean.hashCode(this.f18083B)) * 31) + Boolean.hashCode(this.C);
    }

    public final boolean i() {
        MutableScatterMap mutableScatterMap = this.f18084z;
        Object[] objArr = mutableScatterMap.f1960b;
        Object[] objArr2 = mutableScatterMap.f1961c;
        long[] jArr = mutableScatterMap.f1959a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        if (((SemanticsPropertyKey) obj).b()) {
                            return true;
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return false;
                }
            }
            if (i2 == length) {
                return false;
            }
            i2++;
        }
    }

    public Iterator iterator() {
        Map map = this.f18082A;
        if (map == null) {
            map = this.f18084z.a();
            this.f18082A = map;
        }
        return map.entrySet().iterator();
    }

    public final SemanticsConfiguration m() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.f18083B = this.f18083B;
        semanticsConfiguration.C = this.C;
        semanticsConfiguration.f18084z.s(this.f18084z);
        return semanticsConfiguration;
    }

    public final Object n(SemanticsPropertyKey semanticsPropertyKey) {
        Object e2 = this.f18084z.e(semanticsPropertyKey);
        if (e2 != null) {
            return e2;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    public final Object o(SemanticsPropertyKey semanticsPropertyKey, Function0 function0) {
        Object e2 = this.f18084z.e(semanticsPropertyKey);
        return e2 == null ? function0.invoke() : e2;
    }

    public final Object p(SemanticsPropertyKey semanticsPropertyKey, Function0 function0) {
        Object e2 = this.f18084z.e(semanticsPropertyKey);
        return e2 == null ? function0.invoke() : e2;
    }

    public final MutableScatterMap q() {
        return this.f18084z;
    }

    public final boolean s() {
        return this.C;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.f18083B) {
            sb.append(str);
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.C) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        MutableScatterMap mutableScatterMap = this.f18084z;
        Object[] objArr = mutableScatterMap.f1960b;
        Object[] objArr2 = mutableScatterMap.f1961c;
        long[] jArr = mutableScatterMap.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            sb.append(str);
                            sb.append(((SemanticsPropertyKey) obj).a());
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return JvmActuals_jvmKt.a(this, (String) null) + "{ " + sb + " }";
    }

    public final boolean u() {
        return this.f18083B;
    }

    public final void v(SemanticsConfiguration semanticsConfiguration) {
        MutableScatterMap mutableScatterMap = semanticsConfiguration.f18084z;
        Object[] objArr = mutableScatterMap.f1960b;
        Object[] objArr2 = mutableScatterMap.f1961c;
        long[] jArr = mutableScatterMap.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                            Object e2 = this.f18084z.e(semanticsPropertyKey);
                            Intrinsics.g(semanticsPropertyKey, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                            Object c2 = semanticsPropertyKey.c(e2, obj2);
                            if (c2 != null) {
                                this.f18084z.x(semanticsPropertyKey, c2);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void w(boolean z2) {
        this.C = z2;
    }

    public final void z(boolean z2) {
        this.f18083B = z2;
    }
}
