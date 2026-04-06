package com.hansecom.abt.ui.components.formFields;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.ui.components.formFields.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0634a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f38357A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38358B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Shape f38359z;

    public /* synthetic */ C0634a(Shape shape, boolean z2, Function0 function0, Function2 function2, int i2, int i3) {
        this.f38359z = shape;
        this.f38357A = z2;
        this.f38358B = function0;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtBaseTextFieldKt.f(this.f38359z, this.f38357A, this.f38358B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
