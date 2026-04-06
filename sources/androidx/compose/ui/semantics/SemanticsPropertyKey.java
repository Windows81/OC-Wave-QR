package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

@Metadata
public final class SemanticsPropertyKey<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f18149a;

    /* renamed from: b  reason: collision with root package name */
    public final Function2 f18150b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18151c;

    public SemanticsPropertyKey(String str, Function2 function2) {
        this.f18149a = str;
        this.f18150b = function2;
    }

    public final String a() {
        return this.f18149a;
    }

    public final boolean b() {
        return this.f18151c;
    }

    public final Object c(Object obj, Object obj2) {
        return this.f18150b.m(obj, obj2);
    }

    public final void d(SemanticsPropertyReceiver semanticsPropertyReceiver, KProperty kProperty, Object obj) {
        semanticsPropertyReceiver.e(this, obj);
    }

    public String toString() {
        return "AccessibilityKey: " + this.f18149a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SemanticsPropertyKey(String str, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? AnonymousClass1.f18152z : function2);
    }

    public SemanticsPropertyKey(String str, boolean z2) {
        this(str, (Function2) null, 2, (DefaultConstructorMarker) null);
        this.f18151c = z2;
    }

    public SemanticsPropertyKey(String str, boolean z2, Function2 function2) {
        this(str, function2);
        this.f18151c = z2;
    }
}
