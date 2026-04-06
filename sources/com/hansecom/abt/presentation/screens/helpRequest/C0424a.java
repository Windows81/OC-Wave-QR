package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.helpRequest.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0424a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f34904A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f34905B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f34906z;

    public /* synthetic */ C0424a(String str, String str2, Function0 function0, int i2) {
        this.f34906z = str;
        this.f34904A = str2;
        this.f34905B = function0;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return CardNumberBottomSheetKt.m(this.f34906z, this.f34904A, this.f34905B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
