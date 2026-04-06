package com.hansecom.abt.data.config.menu;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import t.a;

@Metadata
@Serializable
public enum MenuItemSelector {
    LOCKED,
    UNLOCKED,
    VIRTUAL,
    PHYSICAL,
    ALL,
    NONE;
    
    public static final Companion Companion = null;

    /* renamed from: z  reason: collision with root package name */
    public static final Lazy f33246z = null;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ KSerializer a() {
            return (KSerializer) MenuItemSelector.f33246z.getValue();
        }

        public final KSerializer<MenuItemSelector> serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        MenuItemSelector[] f2;
        f33245B = EnumEntriesKt.a(f2);
        Companion = new Companion((DefaultConstructorMarker) null);
        f33246z = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a());
    }
}
