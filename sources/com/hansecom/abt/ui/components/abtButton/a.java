package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Integer f37911A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AbtButtonIconPosition f37912B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f37913z;

    public /* synthetic */ a(String str, Integer num, AbtButtonIconPosition abtButtonIconPosition, int i2) {
        this.f37913z = str;
        this.f37911A = num;
        this.f37912B = abtButtonIconPosition;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtButtonKt.p(this.f37913z, this.f37911A, this.f37912B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
