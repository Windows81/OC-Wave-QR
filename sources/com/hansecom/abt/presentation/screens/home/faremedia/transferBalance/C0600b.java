package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0600b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f37337A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f37338B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f37339z;

    public /* synthetic */ C0600b(ImmutableList immutableList, ImmutableList immutableList2, Function1 function1, int i2) {
        this.f37339z = immutableList;
        this.f37337A = immutableList2;
        this.f37338B = function1;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaSelectorKt.y(this.f37339z, this.f37337A, this.f37338B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
