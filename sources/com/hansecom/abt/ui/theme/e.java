package com.hansecom.abt.ui.theme;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyles;
import com.hansecom.abt.ui.components.listItem.AbtMenuItemStyle;
import com.hansecom.abt.ui.components.quickSelectionButton.AbtQuickSelectionButtonStyle;
import com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme;
import com.hansecom.abt.ui.theme.typography.AbtTypography;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AbtTypography f38938A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AbtButtonStyles f38939B;
    public final /* synthetic */ AbtMenuItemStyle C;
    public final /* synthetic */ AbtQuickSelectionButtonStyle D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbtColorScheme f38940z;

    public /* synthetic */ e(AbtColorScheme abtColorScheme, AbtTypography abtTypography, AbtButtonStyles abtButtonStyles, AbtMenuItemStyle abtMenuItemStyle, AbtQuickSelectionButtonStyle abtQuickSelectionButtonStyle, Function2 function2, int i2, int i3) {
        this.f38940z = abtColorScheme;
        this.f38938A = abtTypography;
        this.f38939B = abtButtonStyles;
        this.C = abtMenuItemStyle;
        this.D = abtQuickSelectionButtonStyle;
        this.E = function2;
        this.F = i2;
        this.G = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtBaseThemeKt.g(this.f38940z, this.f38938A, this.f38939B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
