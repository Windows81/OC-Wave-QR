package com.hansecom.abt.data.config.guidedTour;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import s.a;

@Metadata
@Serializable
public enum MediaType {
    IMAGE,
    UNKNOWN;
    
    public static final Companion Companion = null;

    /* renamed from: z  reason: collision with root package name */
    public static final Lazy f33198z = null;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ KSerializer a() {
            return (KSerializer) MediaType.f33198z.getValue();
        }

        public final KSerializer<MediaType> serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        MediaType[] f2;
        C = EnumEntriesKt.a(f2);
        Companion = new Companion((DefaultConstructorMarker) null);
        f33198z = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a());
    }
}
