package com.hansecom.abt.presentation.screens.home.faremedia;

import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class I0 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f36009A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f36010B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ FareMediaViewModel D;
    public final /* synthetic */ Map E;
    public final /* synthetic */ Map F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f36011z;

    public /* synthetic */ I0(List list, boolean z2, boolean z3, boolean z4, FareMediaViewModel fareMediaViewModel, Map map, Map map2) {
        this.f36011z = list;
        this.f36009A = z2;
        this.f36010B = z3;
        this.C = z4;
        this.D = fareMediaViewModel;
        this.E = map;
        this.F = map2;
    }

    public final Object invoke(Object obj) {
        return FareMediaViewModel.AnonymousClass1.AnonymousClass1.D(this.f36011z, this.f36009A, this.f36010B, this.C, this.D, this.E, this.F, (FareMedia.State) obj);
    }
}
