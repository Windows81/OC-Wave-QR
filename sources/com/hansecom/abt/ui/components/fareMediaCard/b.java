package com.hansecom.abt.ui.components.fareMediaCard;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38223A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f38224B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38225z;

    public /* synthetic */ b(Modifier modifier, Function0 function0, Function3 function3, int i2, int i3) {
        this.f38225z = modifier;
        this.f38223A = function0;
        this.f38224B = function3;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaCardBaseKt.e(this.f38225z, this.f38223A, this.f38224B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
