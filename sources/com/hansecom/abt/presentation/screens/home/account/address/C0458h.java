package com.hansecom.abt.presentation.screens.home.account.address;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.home.account.address.h  reason: case insensitive filesystem */
public final /* synthetic */ class C0458h implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35207A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f35208B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAddress.State f35209z;

    public /* synthetic */ C0458h(ChangeAddress.State state, Function1 function1, Function0 function0, Function0 function02, int i2, int i3) {
        this.f35209z = state;
        this.f35207A = function1;
        this.f35208B = function0;
        this.C = function02;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ChangeAddressScreenKt.i(this.f35209z, this.f35207A, this.f35208B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
