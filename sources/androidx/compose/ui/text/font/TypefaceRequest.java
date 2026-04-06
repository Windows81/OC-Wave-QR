package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TypefaceRequest {

    /* renamed from: a  reason: collision with root package name */
    public final FontFamily f18766a;

    /* renamed from: b  reason: collision with root package name */
    public final FontWeight f18767b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18768c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18769d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f18770e;

    public /* synthetic */ TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontFamily, fontWeight, i2, i3, obj);
    }

    public static /* synthetic */ TypefaceRequest b(TypefaceRequest typefaceRequest, FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            fontFamily = typefaceRequest.f18766a;
        }
        if ((i4 & 2) != 0) {
            fontWeight = typefaceRequest.f18767b;
        }
        FontWeight fontWeight2 = fontWeight;
        if ((i4 & 4) != 0) {
            i2 = typefaceRequest.f18768c;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = typefaceRequest.f18769d;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            obj = typefaceRequest.f18770e;
        }
        return typefaceRequest.a(fontFamily, fontWeight2, i5, i6, obj);
    }

    public final TypefaceRequest a(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, Object obj) {
        return new TypefaceRequest(fontFamily, fontWeight, i2, i3, obj, (DefaultConstructorMarker) null);
    }

    public final FontFamily c() {
        return this.f18766a;
    }

    public final int d() {
        return this.f18768c;
    }

    public final int e() {
        return this.f18769d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        return Intrinsics.d(this.f18766a, typefaceRequest.f18766a) && Intrinsics.d(this.f18767b, typefaceRequest.f18767b) && FontStyle.f(this.f18768c, typefaceRequest.f18768c) && FontSynthesis.h(this.f18769d, typefaceRequest.f18769d) && Intrinsics.d(this.f18770e, typefaceRequest.f18770e);
    }

    public final FontWeight f() {
        return this.f18767b;
    }

    public int hashCode() {
        FontFamily fontFamily = this.f18766a;
        int i2 = 0;
        int hashCode = (((((((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.f18767b.hashCode()) * 31) + FontStyle.g(this.f18768c)) * 31) + FontSynthesis.i(this.f18769d)) * 31;
        Object obj = this.f18770e;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f18766a + ", fontWeight=" + this.f18767b + ", fontStyle=" + FontStyle.h(this.f18768c) + ", fontSynthesis=" + FontSynthesis.l(this.f18769d) + ", resourceLoaderCacheKey=" + this.f18770e + ')';
    }

    public TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, Object obj) {
        this.f18766a = fontFamily;
        this.f18767b = fontWeight;
        this.f18768c = i2;
        this.f18769d = i3;
        this.f18770e = obj;
    }
}
