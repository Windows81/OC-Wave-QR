package com.hansecom.abt.ui.theme.typography;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum AbtTypographyKeyTokens {
    SuperLargeTitle,
    LargeTitle,
    InputFieldBig,
    Title1,
    Title2,
    Title3,
    Headline,
    BodyEmphasized,
    Body,
    Action,
    Hint,
    Caption1,
    Caption2;

    static {
        AbtTypographyKeyTokens[] d2;
        N = EnumEntriesKt.a(d2);
    }

    public static EnumEntries f() {
        return N;
    }
}
