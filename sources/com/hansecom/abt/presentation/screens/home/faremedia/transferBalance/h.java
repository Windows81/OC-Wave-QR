package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

public final /* synthetic */ class h implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f37346A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f37347B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.FareMedia f37348z;

    public /* synthetic */ h(PaymentMethodState.FareMedia fareMedia, ImmutableList immutableList, ImmutableList immutableList2, Function1 function1, boolean z2, int i2, int i3) {
        this.f37348z = fareMedia;
        this.f37346A = immutableList;
        this.f37347B = immutableList2;
        this.C = function1;
        this.D = z2;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaSelectorKt.m(this.f37348z, this.f37346A, this.f37347B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
