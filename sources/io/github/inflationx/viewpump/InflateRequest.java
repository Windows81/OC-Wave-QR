package io.github.inflationx.viewpump;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InflateRequest {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f39782f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39783a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f39784b;

    /* renamed from: c  reason: collision with root package name */
    public final AttributeSet f39785c;

    /* renamed from: d  reason: collision with root package name */
    public final View f39786d;

    /* renamed from: e  reason: collision with root package name */
    public final FallbackViewCreator f39787e;

    @Metadata
    public static final class Builder {
    }

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public InflateRequest(String str, Context context, AttributeSet attributeSet, View view, FallbackViewCreator fallbackViewCreator) {
        Intrinsics.j(str, "name");
        Intrinsics.j(context, "context");
        Intrinsics.j(fallbackViewCreator, "fallbackViewCreator");
        this.f39783a = str;
        this.f39784b = context;
        this.f39785c = attributeSet;
        this.f39786d = view;
        this.f39787e = fallbackViewCreator;
    }

    public final AttributeSet a() {
        return this.f39785c;
    }

    public final Context b() {
        return this.f39784b;
    }

    public final FallbackViewCreator c() {
        return this.f39787e;
    }

    public final String d() {
        return this.f39783a;
    }

    public final View e() {
        return this.f39786d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InflateRequest)) {
            return false;
        }
        InflateRequest inflateRequest = (InflateRequest) obj;
        return Intrinsics.d(this.f39783a, inflateRequest.f39783a) && Intrinsics.d(this.f39784b, inflateRequest.f39784b) && Intrinsics.d(this.f39785c, inflateRequest.f39785c) && Intrinsics.d(this.f39786d, inflateRequest.f39786d) && Intrinsics.d(this.f39787e, inflateRequest.f39787e);
    }

    public int hashCode() {
        String str = this.f39783a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Context context = this.f39784b;
        int hashCode2 = (hashCode + (context != null ? context.hashCode() : 0)) * 31;
        AttributeSet attributeSet = this.f39785c;
        int hashCode3 = (hashCode2 + (attributeSet != null ? attributeSet.hashCode() : 0)) * 31;
        View view = this.f39786d;
        int hashCode4 = (hashCode3 + (view != null ? view.hashCode() : 0)) * 31;
        FallbackViewCreator fallbackViewCreator = this.f39787e;
        if (fallbackViewCreator != null) {
            i2 = fallbackViewCreator.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "InflateRequest(name=" + this.f39783a + ", context=" + this.f39784b + ", attrs=" + this.f39785c + ", parent=" + this.f39786d + ", fallbackViewCreator=" + this.f39787e + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InflateRequest(String str, Context context, AttributeSet attributeSet, View view, FallbackViewCreator fallbackViewCreator, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, context, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? null : view, fallbackViewCreator);
    }
}
