package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ScrollAxisRange {

    /* renamed from: a  reason: collision with root package name */
    public final Function0 f18051a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f18052b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f18053c;

    public ScrollAxisRange(Function0 function0, Function0 function02, boolean z2) {
        this.f18051a = function0;
        this.f18052b = function02;
        this.f18053c = z2;
    }

    public final Function0 a() {
        return this.f18052b;
    }

    public final boolean b() {
        return this.f18053c;
    }

    public final Function0 c() {
        return this.f18051a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f18051a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f18052b.invoke()).floatValue() + ", reverseScrolling=" + this.f18053c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrollAxisRange(Function0 function0, Function0 function02, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, (i2 & 4) != 0 ? false : z2);
    }
}
