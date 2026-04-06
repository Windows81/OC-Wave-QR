package com.hansecom.abt.ui.components.checkout;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f38086A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f38087z;

    public /* synthetic */ a(ImmutableList immutableList, int i2) {
        this.f38087z = immutableList;
        this.f38086A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return CheckoutSummaryKt.d(this.f38087z, this.f38086A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
