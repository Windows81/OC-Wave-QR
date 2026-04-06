package io.github.inflationx.viewpump;

import android.content.Context;
import android.content.ContextWrapper;
import io.github.inflationx.viewpump.internal.ViewPumpLayoutInflater;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata
public final class ViewPumpContextWrapper extends ContextWrapper {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f39814b = {Reflection.i(new PropertyReference1Impl(Reflection.b(ViewPumpContextWrapper.class), "inflater", "getInflater()Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;"))};

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f39815c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Lazy f39816a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final ContextWrapper a(Context context) {
            Intrinsics.j(context, "base");
            return new ViewPumpContextWrapper(context, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ViewPumpContextWrapper(Context context) {
        super(context);
        this.f39816a = LazyKt.a(LazyThreadSafetyMode.NONE, new ViewPumpContextWrapper$inflater$2(this));
    }

    public final ViewPumpLayoutInflater a() {
        Lazy lazy = this.f39816a;
        KProperty kProperty = f39814b[0];
        return (ViewPumpLayoutInflater) lazy.getValue();
    }

    public Object getSystemService(String str) {
        Intrinsics.j(str, "name");
        return Intrinsics.d("layout_inflater", str) ? a() : super.getSystemService(str);
    }

    public /* synthetic */ ViewPumpContextWrapper(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }
}
