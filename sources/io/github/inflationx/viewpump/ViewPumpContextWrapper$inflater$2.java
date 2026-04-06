package io.github.inflationx.viewpump;

import android.view.LayoutInflater;
import io.github.inflationx.viewpump.internal.ViewPumpLayoutInflater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ViewPumpContextWrapper$inflater$2 extends Lambda implements Function0<ViewPumpLayoutInflater> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ViewPumpContextWrapper f39817z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewPumpContextWrapper$inflater$2(ViewPumpContextWrapper viewPumpContextWrapper) {
        super(0);
        this.f39817z = viewPumpContextWrapper;
    }

    /* renamed from: b */
    public final ViewPumpLayoutInflater invoke() {
        LayoutInflater from = LayoutInflater.from(this.f39817z.getBaseContext());
        Intrinsics.e(from, "LayoutInflater.from(baseContext)");
        return new ViewPumpLayoutInflater(from, this.f39817z, false);
    }
}
