package com.hansecom.abt.ui.components.quickSelectionButton;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.PersistentList;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PersistentList f38770A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f38771B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f38772z;

    public /* synthetic */ g(Object obj, PersistentList persistentList, Function1 function1, Modifier modifier, boolean z2, int i2, int i3) {
        this.f38772z = obj;
        this.f38770A = persistentList;
        this.f38771B = function1;
        this.C = modifier;
        this.D = z2;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return QuickSelectionGridKt.c(this.f38772z, this.f38770A, this.f38771B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
