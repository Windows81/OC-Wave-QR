package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

/* renamed from: com.hansecom.abt.presentation.screens.helpRequest.e  reason: case insensitive filesystem */
public final /* synthetic */ class C0428e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f34915A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f34916B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f34917z;

    public /* synthetic */ C0428e(SheetState sheetState, String str, ImmutableList immutableList, Function1 function1, Function0 function0, int i2) {
        this.f34917z = sheetState;
        this.f34915A = str;
        this.f34916B = immutableList;
        this.C = function1;
        this.D = function0;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return CardNumberBottomSheetKt.g(this.f34917z, this.f34915A, this.f34916B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
