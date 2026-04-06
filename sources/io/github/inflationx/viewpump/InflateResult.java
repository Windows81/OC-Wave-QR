package io.github.inflationx.viewpump;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InflateResult {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f39788e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final View f39789a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39790b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f39791c;

    /* renamed from: d  reason: collision with root package name */
    public final AttributeSet f39792d;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public View f39793a;

        /* renamed from: b  reason: collision with root package name */
        public String f39794b;

        /* renamed from: c  reason: collision with root package name */
        public Context f39795c;

        /* renamed from: d  reason: collision with root package name */
        public AttributeSet f39796d;

        public final Builder a(AttributeSet attributeSet) {
            this.f39796d = attributeSet;
            return this;
        }

        public final InflateResult b() {
            String str = this.f39794b;
            if (str != null) {
                View view = this.f39793a;
                if (view == null) {
                    view = null;
                } else if (!Intrinsics.d(str, view.getClass().getName())) {
                    throw new IllegalStateException(("name (" + str + ") must be the view's fully qualified name (" + view.getClass().getName() + ')').toString());
                }
                Context context = this.f39795c;
                if (context != null) {
                    return new InflateResult(view, str, context, this.f39796d);
                }
                throw new IllegalStateException("context == null");
            }
            throw new IllegalStateException("name == null");
        }

        public final Builder c(Context context) {
            Intrinsics.j(context, "context");
            this.f39795c = context;
            return this;
        }

        public final Builder d(String str) {
            Intrinsics.j(str, "name");
            this.f39794b = str;
            return this;
        }

        public final Builder e(View view) {
            this.f39793a = view;
            return this;
        }
    }

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final Builder a() {
            return new Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public InflateResult(View view, String str, Context context, AttributeSet attributeSet) {
        Intrinsics.j(str, "name");
        Intrinsics.j(context, "context");
        this.f39789a = view;
        this.f39790b = str;
        this.f39791c = context;
        this.f39792d = attributeSet;
    }

    public final Context a() {
        return this.f39791c;
    }

    public final View b() {
        return this.f39789a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InflateResult)) {
            return false;
        }
        InflateResult inflateResult = (InflateResult) obj;
        return Intrinsics.d(this.f39789a, inflateResult.f39789a) && Intrinsics.d(this.f39790b, inflateResult.f39790b) && Intrinsics.d(this.f39791c, inflateResult.f39791c) && Intrinsics.d(this.f39792d, inflateResult.f39792d);
    }

    public int hashCode() {
        View view = this.f39789a;
        int i2 = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        String str = this.f39790b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Context context = this.f39791c;
        int hashCode3 = (hashCode2 + (context != null ? context.hashCode() : 0)) * 31;
        AttributeSet attributeSet = this.f39792d;
        if (attributeSet != null) {
            i2 = attributeSet.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "InflateResult(view=" + this.f39789a + ", name=" + this.f39790b + ", context=" + this.f39791c + ", attrs=" + this.f39792d + ")";
    }
}
