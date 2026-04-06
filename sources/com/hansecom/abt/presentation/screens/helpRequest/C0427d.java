package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

/* renamed from: com.hansecom.abt.presentation.screens.helpRequest.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0427d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f34911A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f34912B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f34913z;

    public /* synthetic */ C0427d(String str, ImmutableList immutableList, Function1 function1, boolean z2, Function0 function0, int i2) {
        this.f34913z = str;
        this.f34911A = immutableList;
        this.f34912B = function1;
        this.C = z2;
        this.D = function0;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return CardNumberBottomSheetKt.k(this.f34913z, this.f34911A, this.f34912B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
