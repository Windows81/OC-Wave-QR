package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0601c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f37340A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f37341B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f37342z;

    public /* synthetic */ C0601c(SheetState sheetState, ImmutableList immutableList, ImmutableList immutableList2, Function1 function1, Function0 function0, int i2) {
        this.f37342z = sheetState;
        this.f37340A = immutableList;
        this.f37341B = immutableList2;
        this.C = function1;
        this.D = function0;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaSelectorKt.t(this.f37342z, this.f37340A, this.f37341B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
