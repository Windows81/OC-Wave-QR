package com.hansecom.abt.ui.components.listItem;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class m implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38519A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38520B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Painter f38521z;

    public /* synthetic */ m(Painter painter, Modifier modifier, int i2, int i3) {
        this.f38521z = painter;
        this.f38519A = modifier;
        this.f38520B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return MenuItemKt.n(this.f38521z, this.f38519A, this.f38520B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
